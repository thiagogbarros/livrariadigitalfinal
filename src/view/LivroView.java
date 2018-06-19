package view;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import model.Autor;
import model.Editora;
import model.Genero;
import model.Livro;


public class LivroView {
	public static Livro Criar(EntityManagerFactory emf,EntityManager em) {
		System.out.println("LIVRO: Criando...");
		Scanner sc = new Scanner(System.in);
		Livro livro = new Livro();
		System.out.println("TITULO:");
		livro.setTitulo(sc.nextLine());
		System.out.println("ISBN:");
		livro.setIsbn(sc.nextInt());
		System.out.println("PREÇO:");
		livro.setPreco(sc.nextInt());
		System.out.printf("ID DO AUTOR:");
		em.getTransaction().begin();
		Autor autor = em.find(Autor.class, sc.nextInt());
		livro.setAutor(autor);
		System.out.printf("ID EDITORA:");
		Editora editora = em.find(Editora.class, sc.nextInt());
		livro.setEditora(editora);
		System.out.printf("ANO DE LANÇAMENTO:");
		livro.setAno(sc.nextInt());
		System.out.printf("ID GENERO:");
		Genero genero = em.find(Genero.class, sc.nextInt());
		livro.setGenero(genero);
		em.getTransaction().commit();
		emf.close();
		return(livro);
	}
	
	public static long Deletar() {
		System.out.println("LIVRO: Deletando...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o id do livro que deseja deletar");
		long id = sc.nextInt();
		return(id);
	}
	
	public static Livro Alterar(int parte,EntityManagerFactory emf,EntityManager em) {
		System.out.println("LIVRO: Alterando...");
		Scanner sc = new Scanner(System.in);
		Livro livro = new Livro();
		if(parte == 1) {
			System.out.println("Digite o nome do livro que deseja ser alterado");
			livro.setTitulo(sc.nextLine());
			return(livro);
		}else {
			System.out.println("NOVO TITULO:");
			livro.setTitulo(sc.nextLine());
			System.out.println("NOVO ISBN: ");
			livro.setIsbn(sc.nextInt());
			System.out.printf("NOVO AUTOR(id):");
			Autor autor = em.find(Autor.class, sc.nextInt());
			livro.setAutor(autor);
			System.out.printf("NOVA EDITORA(id):");
			Editora editora = em.find(Editora.class, sc.nextInt());
			livro.setEditora(editora);
			System.out.printf("NOVO ANO DE LANÇAMENTO:");
			livro.setAno(sc.nextInt());
			System.out.printf("NOVO PREÇO:");
			livro.setPreco(sc.nextInt());
			System.out.printf("NOVO GENERO(id):");
			Genero genero = em.find(Genero.class, sc.nextInt());
			livro.setGenero(genero);
			return(livro);
		
		}
	}
	
	public static void Consultar(Livro livro) {
		System.out.println("LIVRO: Consultando...");
		System.out.println("Titulo: "+livro.getTitulo());
		System.out.println("ISBN: "+livro.getIsbn());
		System.out.println("Autor: "+livro.getAutor());
		System.out.println("Editora:"+livro.getEditora());
		System.out.println("Ano de Lançamento:"+livro.getAno());	
		System.out.println("Preço: "+livro.getPreco());	
		System.out.println("Genero:"+livro.getGenero());
	}
	
	public static void Mensagens(String tipo) {
		switch(tipo) {
		case "naoEncontrado":	System.out.println("Livro não encontrado!");
								break;
		case "naoCadastrado":	System.out.println("Não existem livros cadastrados!");
								break;
		case "cadastrado":	System.out.println("Livro cadastrado com sucesso!");
							break;
		case "deletado":	System.out.println("Livro deletado com sucesso!");
							break;
		case "alterado":	System.out.println("Livro alterado com sucesso!");
		}
	}
}