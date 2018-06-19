package controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import model.Cliente;
import model.Usuario;
import view.ClienteView;

public class ClientesController {
	@PersistenceContext
	EntityManagerFactory emf;
	EntityManager em;
	
	public ClientesController() {
		emf = Persistence.createEntityManagerFactory("cliente");
		em = emf.createEntityManager();
	}
	
	public void Deletar() {
		em.getTransaction().begin();
		try {
			long id  = ClienteView.Deletar();
			Cliente cliente = em.find(Cliente.class, id);
			Usuario usuario = em.find(Usuario.class, id);
			em.remove(cliente);
			em.remove(usuario);
			em.getTransaction().commit();
			emf.close();
			ClienteView.Mensagens("deletado");
		}catch(Exception e) {
			ClienteView.Mensagens("naoEncontrado");
		}

	}
	
	public void Criar() {
		Cliente cliente = ClienteView.Criar();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		emf.close();
		ClienteView.Mensagens("cadastrado");
	}
	
	public void Alterar() {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select id from usuario where nome = '"+ClienteView.Alterar(1).getNome()+"'");
		try {
			int idEncontrado = (int) q.getSingleResult();
			Cliente encontrado = ClienteView.Alterar(2);
			encontrado.setId(idEncontrado);
			em.merge(encontrado);
			em.getTransaction().commit();
			emf.close();
			ClienteView.Mensagens("alterado");
		}catch(Exception e) {
			System.out.println(e);
			ClienteView.Mensagens("naoEncontrado");
		}
		

	}
	
	public void Consultar() {
		em.getTransaction().begin();  
		Query query = em.createQuery("select g from Cliente g");
		List<Cliente> clientes = query.getResultList();
		em.getTransaction().commit();
		emf.close();
		if(clientes.isEmpty()) {
			ClienteView.Mensagens("naoCadastrado");
		}else {
			for (int i = 0;i < clientes.size(); i++) {
				ClienteView.Consultar(clientes.get(i));
			}
		}
	}
	
}
