package controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import model.Genero;
import view.GeneroView;

public class GenerosController {
	@PersistenceContext
	EntityManagerFactory emf;
	EntityManager em;
	
	public GenerosController() {
		emf = Persistence.createEntityManagerFactory("genero");
		em = emf.createEntityManager();
	}
	
	public void Deletar() {
		em.getTransaction().begin();
		try {
			//Query q = em.createNativeQuery("select id from genero where nome = '"+GeneroView.Deletar()+"'");
			//Genero genero = em.find(Genero.class, q.getSingleResult());
			Genero genero = em.find(Genero.class, GeneroView.Deletar());
			em.remove(genero);
			em.getTransaction().commit();
			emf.close();
			GeneroView.Mensagens("deletado");
		}catch(Exception e) {
			GeneroView.Mensagens("naoEncontrado");
		}

	}
	
	public void Criar() {
		Genero genero = GeneroView.Criar();
		em.getTransaction().begin();
		em.persist(genero);
		em.getTransaction().commit();
		emf.close();
		GeneroView.Mensagens("cadastrado");
	}
	
	public void Alterar() {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select id from genero where nome = '"+GeneroView.Alterar(1)+"'");
		try {
			int idEncontrado = (int) q.getSingleResult();
			Genero encontrado = em.find(Genero.class, idEncontrado);
			encontrado.setNome(GeneroView.Alterar(2));
			em.merge(encontrado);
			em.getTransaction().commit();
			emf.close();
			GeneroView.Mensagens("alterado");
		}catch(Exception e) {
			GeneroView.Mensagens("naoEncontrado");
		}
		

	}
	
	public void Consultar() {
		em.getTransaction().begin();  
		Query query = em.createQuery("select g from Genero g");
		List<Genero> generos = query.getResultList();
		em.getTransaction().commit();
		emf.close();
		if(generos.isEmpty()) {
			GeneroView.Mensagens("naoCadastrado");
		}else {
			for (int i = 0;i < generos.size(); i++) {
				GeneroView.Consultar(generos.get(i));
			}
		}
	}
	
}
