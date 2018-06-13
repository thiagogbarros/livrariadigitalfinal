package controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Genero;
import view.GeneroView;

public class GenerosController {
	EntityManagerFactory emf;
	EntityManager em;
	
	public GenerosController() {
		emf = Persistence.createEntityManagerFactory("genero");
		em = emf.createEntityManager();
	}
	
	public void salvar(Genero genero) {
		em.getTransaction().begin();
		em.merge(genero);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Genero genero) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("delete aluno from aluno where nome = "+genero.getNome());
		q.executeUpdate();
		em.getTransaction().commit();
		emf.close();
	}
	
	public void CriaGenero() {
		Genero genero = new Genero();
		genero.setNome(GeneroView.Cadastro());
		this.salvar(genero);
	}
}
