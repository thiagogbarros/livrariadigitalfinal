package controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

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
	
	/*public void Deletar() {
		
		}*/
	/*public void Criar() {
		
	}*/
	
}