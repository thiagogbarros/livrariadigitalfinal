package controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import model.Autor;
import view.AutorView;

public class AutoresController {
	@PersistenceContext
	EntityManagerFactory emf;
	EntityManager em;
	
	public AutoresController() {
		emf = Persistence.createEntityManagerFactory("autor");
		em = emf.createEntityManager();
	}
	
	public void Deletar() {
		em.getTransaction().begin();
		try {
			Autor genero = em.find(Autor.class, AutorView.Deletar());
			em.remove(genero);
			em.getTransaction().commit();
			emf.close();
			AutorView.Mensagens("deletado");
		}catch(Exception e) {
			AutorView.Mensagens("naoEncontrado");
		}

	}
	
	public void Criar() {
		Autor autor = AutorView.Criar();
		em.getTransaction().begin();
		em.persist(autor);
		em.getTransaction().commit();
		emf.close();
		AutorView.Mensagens("cadastrado");
	}
	
	public void Alterar() {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select id from autor where nome = '"+AutorView.Alterar(1).getNome()+"'");
		try {
			int idEncontrado = (int) q.getSingleResult();
			Autor encontrado = AutorView.Alterar(2);
			encontrado.setId(idEncontrado);
			em.merge(encontrado);
			em.getTransaction().commit();
			emf.close();
			AutorView.Mensagens("alterado");
		}catch(Exception e) {
			AutorView.Mensagens("naoEncontrado");
		}
	}
	
	public void Consultar() {
		em.getTransaction().begin();  
		Query query = em.createQuery("select g from Autor g");
		List<Autor> autores = query.getResultList();
		em.getTransaction().commit();
		emf.close();
		if(autores.isEmpty()) {
			AutorView.Mensagens("naoCadastrado");
		}else {
			for (int i = 0;i < autores.size(); i++) {
				AutorView.Consultar(autores.get(i));
			}
		}
	}
	
}
