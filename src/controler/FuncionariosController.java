package controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import model.Funcionario;
import model.Usuario;
import view.FuncionarioView;

public class FuncionariosController {
	@PersistenceContext
	EntityManagerFactory emf;
	EntityManager em;
	
	public FuncionariosController() {
		emf = Persistence.createEntityManagerFactory("funcionario");
		em = emf.createEntityManager();
	}
	
	public void Deletar() {
		em.getTransaction().begin();
		try {
			long id  = FuncionarioView.Deletar();
			Funcionario funcionario = em.find(Funcionario.class, id);
			Usuario usuario = em.find(Usuario.class, id);
			em.remove(funcionario);
			em.remove(usuario);
			em.getTransaction().commit();
			emf.close();
			FuncionarioView.Mensagens("deletado");
		}catch(Exception e) {
			FuncionarioView.Mensagens("naoEncontrado");
		}

	}
	
	public void Criar() {
		Funcionario funcionario = FuncionarioView.Criar();
		em.getTransaction().begin();
		em.persist(funcionario);
		em.getTransaction().commit();
		emf.close();
		FuncionarioView.Mensagens("cadastrado");
	}
	
	public void Alterar() {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select id from usuario where nome = '"+FuncionarioView.Alterar(1).getNome()+"'");
		try {
			int idEncontrado = (int) q.getSingleResult();
			Funcionario encontrado = FuncionarioView.Alterar(2);
			encontrado.setId(idEncontrado);
			em.merge(encontrado);
			em.getTransaction().commit();
			emf.close();
			FuncionarioView.Mensagens("alterado");
		}catch(Exception e) {
			System.out.println(e);
			FuncionarioView.Mensagens("naoEncontrado");
		}
		

	}
	
	public void Consultar() {
		em.getTransaction().begin();  
		Query query = em.createQuery("select g from Funcionario g");
		List<Funcionario> funcionarios = query.getResultList();
		em.getTransaction().commit();
		emf.close();
		if(funcionarios.isEmpty()) {
			FuncionarioView.Mensagens("naoCadastrado");
		}else {
			for (int i = 0;i < funcionarios.size(); i++) {
				FuncionarioView.Consultar(funcionarios.get(i));
			}
		}
	}
	
}
