package controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Livro;
import view.LivroView;

public class LivrosController {
	@PersistenceContext
	EntityManagerFactory emf;
	EntityManager em;
	
	public LivrosController() {
		emf = Persistence.createEntityManagerFactory("livro");
		em = emf.createEntityManager();
	}
	public void Deletar() {
		em.getTransaction().begin();
		try {
			Livro livro = em.find(Livro.class, LivroView.Deletar());
			em.remove(livro);
			em.getTransaction().commit();
			emf.close();
			LivroView.Mensagens("deletado");
		}catch(Exception e) {
			System.out.printf("exception "+e);
			LivroView.Mensagens("naoEncontrado");
		}

	}
	
	public void Criar() {
		Livro livro = LivroView.Criar(emf,em);
		em.getTransaction().begin();
		em.persist(livro);
		em.getTransaction().commit();
		emf.close();
		LivroView.Mensagens("cadastrado");
	}
	
	public void Alterar() {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select id from livro where titulo = '"+LivroView.Alterar(1,emf,em).getTitulo()+"'");
		try {
			int idEncontrado = (int) q.getSingleResult();
			Livro encontrado = LivroView.Alterar(2,emf,em);
			encontrado.setId(idEncontrado);
			em.merge(encontrado);
			em.getTransaction().commit();
			emf.close();
			LivroView.Mensagens("alterado");
		}catch(Exception e) {
			LivroView.Mensagens("naoEncontrado");
		}
		

	}
	
	public void Consultar() {
		em.getTransaction().begin();  
		Query query = em.createQuery("select g from Livro g");
		List<Livro> livros = query.getResultList();
		em.getTransaction().commit();
		emf.close();
		if(livros.isEmpty()) {
			LivroView.Mensagens("naoCadastrado");
		}else {
			for (int i = 0;i < livros.size(); i++) {
				LivroView.Consultar(livros.get(i));
			}
		}
	}
	
}
