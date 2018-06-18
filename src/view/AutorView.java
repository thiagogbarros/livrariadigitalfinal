package view;
import java.util.Scanner;

import model.Autor;


public class AutorView {
	public static Autor Criar() {
		Scanner sc = new Scanner(System.in);
		Autor autor = new Autor();
		System.out.println("Digite o nome do autor a ser cadastrado");
		autor.setNome(sc.nextLine());
		return(autor);
	}
	
	public static int Deletar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o id do autor que deseja deletar");
		int id = sc.nextInt();
		return(id);
	}
	
	public static Autor Alterar(int parte) {
		Scanner sc = new Scanner(System.in);
		Autor autor = new Autor();
		if(parte == 1) {
			System.out.println("AUTOR: alterando dados... \n");	//TITULO DA TELA
			System.out.println("Digite o nome do autor que deseja ser alterado");
			autor.setNome(sc.nextLine());
			return(autor);
		}else {
			System.out.println("NOVO NOME:");
			autor.setNome(sc.nextLine());
			return(autor);
		
		}
	}
	
	public static void Consultar(Autor autor) {
		System.out.println("Nome: "+autor.getNome()+"\n");
	}
	
	public static void Mensagens(String tipo) {
		switch(tipo) {
		case "naoEncontrado":	System.out.println("Autor não encontrado!");
								break;
		case "naoCadastrado":	System.out.println("Não existem autores cadastrados!");
								break;
		case "cadastrado":	System.out.println("Autor cadastrado com sucesso!");
							break;
		case "deletado":	System.out.println("Autor deletado com sucesso!");
							break;
		case "alterado":	System.out.println("Autor alterado com sucesso!");
		}
	}
}
