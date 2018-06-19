package view;

import model.Livro;
import model.Usuario;
import model.Carrinho;

import java.util.Scanner;
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
	//CRIAR METODO ESVAZIAR CARRINHO
	//CRIAR METODO FINALIZAR COMPRA

	public static void Consultar(Carrinho carrinho) {
		System.out.println("Carrinho: Consultando...");
		System.out.println("ID: "+carrinho.getId());
		System.out.println("IDCliente: "+carrinho.getIdCliente());
		//NO CASO TERIA Q LISTAR OS LIVROS Q TAO NO CARRINHO?
		//System.out.println("Livros no carrinho: 1)___ 2) ____ ...");
		
	}
	
	/*public static void Mensagens(String tipo) {
		switch(tipo) {
		case "naoEncontrado":	System.out.println("Usuario não encontrado!");
								break;
		case "naoCadastrado":	System.out.println("Não existem usuarios cadastrados!");
								break;
		case "cadastrado":	System.out.println("Usuario cadastrado com sucesso!");
							break;
		case "deletado":	System.out.println("Usuario deletado com sucesso!");
							break;
		case "alterado":	System.out.println("Usuario alterado com sucesso!");
		}
	}*/
	
}