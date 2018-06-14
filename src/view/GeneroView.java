package view;
import java.util.Scanner;


public class GeneroView {
	public static String Criar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do genero a ser cadastrado");
		String nome = sc.nextLine();
		return(nome);
	}
	
	public static String Deletar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do genero que deseja deletar");
		String nome = sc.nextLine();
		return(nome);
	}
	
	public static String Alterar(int parte) {
		Scanner sc = new Scanner(System.in);
		if(parte == 1) {
			System.out.println("Digite o nome do genero que deseja ser alterado");
			String nome = sc.nextLine();
			return(nome);
		}else {
			System.out.println("Digite o nome do genero que deseja alterar");
			String nome = sc.nextLine();
			return(nome);
		
		}
	}
}
