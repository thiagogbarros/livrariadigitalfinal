package controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Carrinho;
import view.CarrinhoView;

public class CarrinhosController {
	@PersistenceContext
	EntityManagerFactory emf;
	EntityManager em;
	
	public CarrinhosController() {
		emf = Persistence.createEntityManagerFactory("carrinho");
		em = emf.createEntityManager();
	}
	
	public void Deletar() {
		em.getTransaction().begin();
		try {
			Carrinho carrinho = em.find(Carrinho.class, CarrinhoView.Deletar());
			em.remove(carrinho);
			em.getTransaction().commit();
			emf.close();
			CarrinhoView.Mensagens("deletado");
		}catch(Exception e) {
			System.out.printf("exception "+e);
			CarrinhoView.Mensagens("naoEncontrado");
		}

	}
	
	public void Criar() {
		Carrinho carrinho = CarrinhoView.Criar(emf,em);
		em.getTransaction().begin();
		em.persist(carrinho);
		em.getTransaction().commit();
		emf.close();
		CarrinhoView.Mensagens("cadastrado");
	}
	
	public void Alterar() {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select id from carrinho where id = '"+CarrinhoView.Alterar(1,emf,em).getId()+"'");
		try {
			int idEncontrado = (int) q.getSingleResult();
			Carrinho encontrado = CarrinhoView.Alterar(2,emf,em);
			encontrado.setId(idEncontrado);
			em.merge(encontrado);
			em.getTransaction().commit();
			emf.close();
			CarrinhoView.Mensagens("alterado");
		}catch(Exception e) {
			CarrinhoView.Mensagens("naoEncontrado");
		}
		

	}
	
	public void Consultar() {
		em.getTransaction().begin();  
		Query query = em.createQuery("select g from Carrinho g");
		List<Carrinho> carrinhos = query.getResultList();
		em.getTransaction().commit();
		emf.close();
		if(carrinhos.isEmpty()) {
			CarrinhoView.Mensagens("naoCadastrado");
		}else {
			for (int i = 0;i < carrinhos.size(); i++) {
				CarrinhoView.Consultar(carrinhos.get(i));
			}
		}
	}
	
	
}