package view;
import java.util.Scanner;

public class GeneroView {
	public static String Cadastro() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do genero a ser cadastrado");
		String nome = sc.nextLine();
		return(nome);
	}
}
