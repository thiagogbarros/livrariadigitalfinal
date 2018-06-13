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
	
	public void Salvar(Genero genero) {
		em.getTransaction().begin();
		em.merge(genero);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void Deletar() {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("delete from genero where nome = '"+GeneroView.Deletar()+"'");
		q.executeUpdate();
		em.getTransaction().commit();
		emf.close();
	}
	
	public void Criar() {
		Genero genero = new Genero();
		genero.setNome(GeneroView.Criar());
		this.Salvar(genero);
	}
	
}
