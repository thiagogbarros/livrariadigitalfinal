
package view;
import model.Editora;

import java.util.Scanner;

public class EditoraView {
	
	public static String criar() {
		System.out.println("EDITORA: criando...");	//TITULO DA TELA
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome da editora que deseja adicionar: ");
		String nome = sc.nextLine();
		return nome;
	}
	public static String deletar() {
		System.out.println("EDITORA: deletando...");	//TITULO DA TELA
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome da editora que deseja deletar: ");
		String nome = sc.nextLine();
		return nome;		
	}
	
	public static void editar(Editora editora /*int parte*/) {
		System.out.println("EDITORA: editando dados...");	//TITULO DA TELA
		Scanner sc = new Scanner(System.in);	
		System.out.printf("NOME: \n");
		editora.setNome(sc.nextLine());
		System.out.printf("TELEFONE: \n");
		editora.setTelefone(sc.nextLine());
	
		/*if(parte == 1) {
			System.out.println("Digite o nome do gênero que deseja ser alterado");
			String nome = sc.nextLine();
			return(nome);
		}else {
			System.out.println("Digite o nome do gênero que deseja alterar");
			String nome = sc.nextLine();
			return(nome);
		}*/	
	}
	
	public static void Consultar(Editora editora) {
		System.out.println("EDITORA: consulta de dados...");	//TITULO DA TELA
		System.out.println("Nome: "+editora.getNome());
		System.out.println("ID da Editora: "+editora.getidEditora());
		System.out.println("Telefone: "+editora.getTelefone());
	}

	public static void Mensagens(String tipo) {
		switch(tipo) {
		case "naoEncontrado":	System.out.println("Editora não encontrada!");
								break;
		case "naoCadastrado":	System.out.println("Não existem editoras cadastradas!");
								break;
		case "cadastrado":	System.out.println("Editora cadastrada com sucesso!");
							break;
		case "deletado":	System.out.println("Editora deletada com sucesso!");
							break;
		case "alterado":	System.out.println("Editora alterada com sucesso!");
		}
	}	
	
}