package view;
import java.util.Scanner;

import model.Genero;


public class GeneroView {
	public static String Criar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do gênero a ser cadastrado");
		String nome = sc.nextLine();
		return(nome);
	}
	
	public static String Deletar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do gênero que deseja deletar");
		String nome = sc.nextLine();
		return(nome);
	}
	
	public static String Alterar(int parte) {
		Scanner sc = new Scanner(System.in);
		if(parte == 1) {
			System.out.println("Digite o nome do gênero que deseja ser alterado");
			String nome = sc.nextLine();
			return(nome);
		}else {
			System.out.println("Digite o nome do gênero que deseja alterar");
			String nome = sc.nextLine();
			return(nome);
		
		}
	}
	
	public static void Consultar(Genero genero) {
		System.out.println("Nome: "+genero.getNome());
	}
	
	public static void Mensagens(String tipo) {
		switch(tipo) {
		case "naoEncontrado":	System.out.println("Gênero não encontrado!");
								break;
		case "naoCadastrado":	System.out.println("Não existem gêneros cadastrados!");
								break;
		case "cadastrado":	System.out.println("Gênero cadastrado com sucesso!");
							break;
		case "deletado":	System.out.println("Gênero deletado com sucesso!");
							break;
		case "alterado":	System.out.println("Gênero alterado com sucesso!");
		}
	}
}
