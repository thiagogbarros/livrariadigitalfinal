package view;

import model.Livro;
import model.Carrinho;
import model.Cliente;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
public class CarrinhoView {
	
	public static Livro addLivro() {
		System.out.println("Carrinho: Adicionando Livro...");
		Scanner sc = new Scanner(System.in);
		Livro livro = new Livro();
		System.out.println("TITULO:");
		livro.setTitulo(sc.nextLine());
		return(livro);
	}
	public static int removeLivro() {
		System.out.println("Carrinho: Removendo Livro...");	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o id do livro que deseja remover do carrinho: ");
		int id = sc.nextInt();
		return id;
	}

	public static void Consultar(Carrinho carrinho) {
		System.out.println("Carrinho: Consultando...");
		System.out.println("ID: "+carrinho.getId());
		System.out.println("Nome do Cliente: "+carrinho.getCliente());

		
	}
	public static Carrinho Criar(EntityManagerFactory emf,EntityManager em) {

		System.out.println("CARRINHO: Criando...");
		Scanner sc = new Scanner(System.in);
		Carrinho carrinho = new Carrinho();
		System.out.println("Digite o id do livro ser adicionado ");
		long id = sc.nextInt();
		Livro livro = em.find(Livro.class,id);
		carrinho.setLivro(livro);
		System.out.printf("Digite o id do cliente a ser associado:");
		id = sc.nextLong();
		Cliente cliente = em.find(Cliente.class,id);
		carrinho.setCliente(cliente);
		return(carrinho);
	}
	
	public static int Deletar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o id do carrinho que deseja limpar");
		int id = sc.nextInt();
		return(id);
	}
	
	public static Carrinho Alterar(int parte,EntityManagerFactory emf,EntityManager em) {
		Scanner sc = new Scanner(System.in);
		Carrinho carrinho = new Carrinho();
		if(parte == 1) {
			System.out.println("Digite o id do carrinho que deseja ser alterado:");
			return(em.find(Carrinho.class,sc.nextLong()));
		}else {

			System.out.println("NOVO ID LIVRO:");
			carrinho.setLivro(em.find(Livro.class, sc.nextLong()));
			System.out.printf("NOVO ID CLIENTE:");
			carrinho.setCliente(em.find(Cliente.class, sc.nextLong()));
			return(carrinho);
		}
	}
	
	public static void Mensagens(String tipo) {
		switch(tipo) {
		case "naoEncontrado":	System.out.println("Carrinho não encontrado!");
								break;
		case "naoCadastrado":	System.out.println("Não existem carrinhos cadastrados!");
								break;
		case "cadastrado":	System.out.println("Carrinho cadastrado com sucesso!");
							break;
		case "deletado":	System.out.println("Carrinho deletado com sucesso!");
							break;
		case "alterado":	System.out.println("Carrinho alterado com sucesso!");
		}
	}
	
}