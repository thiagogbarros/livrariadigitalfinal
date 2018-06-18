package controler;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import model.Editora;
import view.EditoraView;

public class EditorasController {
	@PersistenceContext
	EntityManagerFactory emf;
	EntityManager em;
	
	public EditorasController() {
		emf = Persistence.createEntityManagerFactory("editora");
		em = emf.createEntityManager();
	}
	
	public void Deletar() {
		em.getTransaction().begin();
		try {
			//Query q = em.createNativeQuery("select id from editora where nome = '"+EditoraView.Deletar()+"'");
			//Editora editora = em.find(Editora.class, q.getSingleResult());
			Editora editora = em.find(Editora.class, EditoraView.Deletar());
			em.remove(editora);
			em.getTransaction().commit();
			emf.close();
			EditoraView.Mensagens("deletado");
		}catch(Exception e) {
			EditoraView.Mensagens("naoEncontrado");
		}

	}
	
	public void Criar() {
		Editora editora = EditoraView.Criar();
		em.getTransaction().begin();
		em.persist(editora);
		em.getTransaction().commit();
		emf.close();
		EditoraView.Mensagens("cadastrado");
	}
	
	public void Alterar() {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select id from editora where nome = '"+EditoraView.Alterar(1).getNome()+"'");
		try {
			int idEncontrado = (int) q.getSingleResult();
			Editora encontrado = EditoraView.Alterar(2);
			encontrado.setId(idEncontrado);
			em.merge(encontrado);
			em.getTransaction().commit();
			emf.close();
			EditoraView.Mensagens("alterado");
		}catch(Exception e) {
			EditoraView.Mensagens("naoEncontrado");
		}
		

	}
	
	public void Consultar() {
		em.getTransaction().begin();  
		Query query = em.createQuery("select e from Editora e");
		List<Editora> editoras = query.getResultList();
		em.getTransaction().commit();
		emf.close();
		if(editoras.isEmpty()) {
			EditoraView.Mensagens("naoCadastrado");
		}else {
			for (int i = 0;i < editoras.size(); i++) {
				EditoraView.Consultar(editoras.get(i));
			}
		}
	}
	
}
