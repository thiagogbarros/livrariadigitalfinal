
package view;
import model.Editora;

import java.util.Scanner;

public class EditoraView {
	
	public static Editora Criar() {
		
		System.out.println("EDITORA: criando...\n");	//TITULO DA TELA
		Scanner sc = new Scanner(System.in);
		Editora editora = new Editora();
		System.out.println("NOME:");
		editora.setNome(sc.nextLine());
		System.out.println("TELEFONE:");
		editora.setTelefone(sc.nextLine());
		return(editora);
	}
	public static int Deletar() {
		System.out.println("EDITORA: deletando...");	//TITULO DA TELA
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o id da editora que deseja deletar: ");
		int id = sc.nextInt();
		return id;		
	}
	
	public static Editora Alterar(int parte) {
		Scanner sc = new Scanner(System.in);
		Editora editora = new Editora();
		if(parte == 1) {
			System.out.println("EDITORA: alterando dados... \n");	//TITULO DA TELA
			System.out.println("Digite o nome da editora que deseja ser alterado");
			editora.setNome(sc.nextLine());
			return(editora);
		}else {
			System.out.println("NOVO NOME:");
			editora.setNome(sc.nextLine());
			System.out.println("NOVO TELEFONE:");
			editora.setTelefone(sc.nextLine());
			return(editora);
		
		}
	}
	
	public static void Consultar(Editora editora) {
		System.out.println("ID da Editora: "+editora.getId());
		System.out.println("Nome: "+editora.getNome());
		System.out.println("Telefone: "+editora.getTelefone()+"\n");
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