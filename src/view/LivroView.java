package view;
import java.util.Scanner;
//import model.Livro;


public class LivroView {
/*	public static Livro Criar() {
		System.out.println("LIVRO: Criando...");
		Scanner sc = new Scanner(System.in);
		Livro livro = new Livro();
		System.out.println("ISBN:");
		livro.setIsbn(sc.nextInt());
		System.out.printf("TITULO:");
		livro.setTitulo(sc.nextLine());
		System.out.printf("NOME DO AUTOR:");
		livro.setAutor(sc.nextLine());
		System.out.printf("EDITORA:");
		livro.setEditora(sc.nextLine());
		System.out.printf("ANO DE LANÇAMENTO:");
		livro.setAno(sc.nextInt());
		System.out.printf("PREÇO:");
		livro.setPreco(sc.nextFloat());
     return(livro);
	}
	
	public static int Deletar() {
		System.out.println("LIVRO: Deletando...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o id do livro que deseja deletar");
		int id = sc.nextInt();
		return(id);
	}
	
	public static Livro Alterar(int parte) {
		System.out.println("LIVRO: Alterando...");
		Scanner sc = new Scanner(System.in);
		Livro livro = new Livro();
		if(parte == 1) {
			System.out.println("Digite o nome do livro que deseja ser alterado");
			livro.setTitulo(sc.nextLine());
			return(livro);
		}else {
			System.out.println("NOVO ISBN: ");
			livro.setIsbn(sc.nextInt());
			System.out.printf("NOVO TITULO:");
			livro.setTitulo(sc.nextLine());
			System.out.printf("NOVO NOME DO AUTOR:");
			livro.setAutor(sc.nextLine());
			System.out.printf("NOVA EDITORA:");
			livro.setEditora(sc.nextLine());
			System.out.printf("NOVO ANO DE LANÇAMENTO:");
			livro.setAno(sc.nextInt());
			System.out.printf("NOVO PREÇO:");
			livro.setPreco(sc.nextFloat());
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
	*/
}