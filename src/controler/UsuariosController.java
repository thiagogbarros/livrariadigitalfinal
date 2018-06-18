package controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import model.Usuario;
import view.UsuarioView;

public class UsuariosController {
	@PersistenceContext
	EntityManagerFactory emf;
	EntityManager em;
	
	public UsuariosController() {
		emf = Persistence.createEntityManagerFactory("usuario");
		em = emf.createEntityManager();
	}
	
	public void Deletar() {
		em.getTransaction().begin();
		try {
			//Query q = em.createNativeQuery("select id from usuario where nome = '"+UsuarioView.Deletar()+"'");
			//Usuario usuario = em.find(Usuario.class, q.getSingleResult());
			Usuario usuario = em.find(Usuario.class, UsuarioView.Deletar());
			em.remove(usuario);
			em.getTransaction().commit();
			emf.close();
			UsuarioView.Mensagens("deletado");
		}catch(Exception e) {
			UsuarioView.Mensagens("naoEncontrado");
		}

	}
	
	public void Criar() {
		Usuario usuario = UsuarioView.Criar();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		emf.close();
		UsuarioView.Mensagens("cadastrado");
	}
	
	public void Alterar() {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select id from usuario where nome = '"+UsuarioView.Alterar(1).getNome()+"'");
		try {
			int idEncontrado = (int) q.getSingleResult();
			//Usuario encontrado = em.find(Usuario.class, idEncontrado);
			//encontrado.setNome(UsuarioView.Alterar(2));
			Usuario encontrado = UsuarioView.Alterar(2);
			encontrado.setId(idEncontrado);
			em.merge(encontrado);
			em.getTransaction().commit();
			emf.close();
			UsuarioView.Mensagens("alterado");
		}catch(Exception e) {
			UsuarioView.Mensagens("naoEncontrado");
		}
		

	}
	
	public void Consultar() {
		em.getTransaction().begin();  
		Query query = em.createQuery("select g from Usuario g");
		List<Usuario> usuarios = query.getResultList();
		em.getTransaction().commit();
		emf.close();
		if(usuarios.isEmpty()) {
			UsuarioView.Mensagens("naoCadastrado");
		}else {
			for (int i = 0;i < usuarios.size(); i++) {
				UsuarioView.Consultar(usuarios.get(i));
			}
		}
	}
	
}
