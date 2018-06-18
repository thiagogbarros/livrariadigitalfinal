package view;
import java.util.Scanner;

import model.Usuario;


public class UsuarioView {
	public static Usuario Criar() {
		Scanner sc = new Scanner(System.in);
		Usuario usuario = new Usuario();
		System.out.println("Digite o nome do usuario a ser cadastrado");
		usuario.setNome(sc.nextLine());
		System.out.printf("Digite o endereço do usuario a ser cadastrado \n");
		usuario.setEndereco(sc.nextLine());
        System.out.println("Digite o cpf do usuario a ser cadastrado \n");
		usuario.setCpf(sc.nextLine());
		System.out.println("Digite o cep do usuario a ser cadastrado \n");
		usuario.setCep(sc.nextLine());
		System.out.println("Digite o telefone do usuario a ser cadastrado \n");
		usuario.setTelefone(sc.nextLine());
		System.out.println("Digite o idade do usuario a ser cadastrado");
		usuario.setIdade(sc.nextInt());
		return(usuario);
	}
	
	public static int Deletar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o id do usuario que deseja deletar");
		int id = sc.nextInt();
		return(id);
	}
	
	public static Usuario Alterar(int parte) {
		Scanner sc = new Scanner(System.in);
		Usuario usuario = new Usuario();
		if(parte == 1) {
			System.out.println("Digite o nome do usuario que deseja ser alterado");
			usuario.setNome(sc.nextLine());
			return(usuario);
		}else {
			System.out.println("Digite o nome do usuario a ser cadastrado");
			usuario.setNome(sc.nextLine());
			System.out.printf("Digite o endereço do usuario a ser cadastrado \n");
			usuario.setEndereco(sc.nextLine());
	        System.out.println("Digite o cpf do usuario a ser cadastrado \n");
			usuario.setCpf(sc.nextLine());
			System.out.println("Digite o cep do usuario a ser cadastrado \n");
			usuario.setCep(sc.nextLine());
			System.out.println("Digite o telefone do usuario a ser cadastrado \n");
			usuario.setTelefone(sc.nextLine());
			System.out.println("Digite o idade do usuario a ser cadastrado");
			usuario.setIdade(sc.nextInt());
			return(usuario);
		
		}
	}
	
	public static void Consultar(Usuario usuario) {
		System.out.println("Nome: "+usuario.getNome());
		System.out.println("Cpf: "+usuario.getCpf());
		System.out.println("Cep: "+usuario.getCep());
		System.out.println("Telefone: "+usuario.getTelefone());
		System.out.println("Idade: "+usuario.getIdade());
		System.out.println("Endereço: "+usuario.getEndereco()+"\n");
	}
	
	public static void Mensagens(String tipo) {
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
	}
}
