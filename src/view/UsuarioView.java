package view;
import java.util.ArrayList;
import java.util.Scanner;

import model.Usuario;

public class UsuarioView {
	
	public static String criarUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do usuario a ser criado: ");
		String nome = sc.nextLine();
		return nome;	
	}
	
	public static String excluir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome a ser excluido: ");
		String nome = sc.nextLine();
		return nome;
	}
	
	public void consultarPerfil() {
		Scanner sc = new Scanner(System.in);
		int idbusca;
		System.out.println("Informe seu ID: ");
		idbusca = sc.nextInt();
		//BUSCA NO BANCO DE DADOS, IMPLEMENTAR DE ACORDO COM O BD
		System.out.printf("CPF: \n",this.getCpf());
		System.out.printf("NOME: \n",this.getNome());
		System.out.printf("IDADE: \n",this.getIdade());
		System.out.printf("ENDERECO: \n",this.getEndereco());
		System.out.printf("TELEFONE: \n",this.getTelefone());
		System.out.printf("CEP: \n",this.getCep());
	}
	
	public void editarPerfil() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("CPF: \n");
		this.setCpf(sc.nextInt());	
		System.out.printf("NOME: \n");
		this.setNome(sc.next());
		System.out.printf("IDADE: \n");
		this.setCpf(sc.nextInt());
		System.out.printf("ENDERECO: \n");
		this.setEndereco(sc.next());
		System.out.printf("TELEFONE: \n");
		this.setTelefone(sc.nextInt());
		System.out.printf("CEP: \n");
		this.setCep(sc.nextInt());
		sc.close();
	}
	
}