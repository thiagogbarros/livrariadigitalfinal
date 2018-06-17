package controler;

import java.util.List;

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
		em.persist(genero);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void Deletar() {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("delete from genero where nome = '"+GeneroView.Deletar()+"'");
		q.executeUpdate();
		//em.find(arg0, arg1)
		em.getTransaction().commit();
		emf.close();
	}
	
	public void Criar() {
		Genero genero = new Genero();
		genero.setNome(GeneroView.Criar());
		this.Salvar(genero);
	}
	
	public void Alterar() {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select id from genero where nome = '"+GeneroView.Alterar(1)+"'");
		try {
			int idEncontrado = (int) q.getSingleResult();
			Genero encontrado = em.find(Genero.class, idEncontrado);
			encontrado.setNome(GeneroView.Alterar(2));
			//encontrado.setNome(GeneroView.Alterar(2));
			em.merge(encontrado);
			em.getTransaction().commit();
			emf.close();
		}catch(Exception e) {
			System.out.println("Genero não encontrado");
		}

	}
	
	public void Consultar() {
		//em.getTransaction().begin();
		Query q = em.createNativeQuery("select g from genero as g");
		//Não está funcionando
		//q.getResultList();

	}
	
}
