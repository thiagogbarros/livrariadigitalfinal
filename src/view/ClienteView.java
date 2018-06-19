package view;
import java.util.Scanner;

import model.Cliente;


public class ClienteView {
	public static Cliente Criar() {

		System.out.println("CLIENTE: Criando...");
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		System.out.println("NOME:");
		cliente.setNome(sc.nextLine());
		System.out.printf("ENDEREÇO:");
		cliente.setEndereco(sc.nextLine());
        System.out.println("CPF:");
		cliente.setCpf(sc.nextLine());
		System.out.println("CEP:");
		cliente.setCep(sc.nextLine());
		System.out.println("TELEFONE:");
		cliente.setTelefone(sc.nextLine());
		System.out.println("USUARIO:");
		cliente.setLogin(sc.nextLine());
		System.out.println("SENHA:");
		cliente.setSenha(sc.nextLine());
		System.out.println("IDADE:");
		cliente.setIdade(sc.nextInt());
		return(cliente);
	}
	
	public static int Deletar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o id do cliente que deseja deletar");
		int id = sc.nextInt();
		return(id);
	}
	
	public static Cliente Alterar(int parte) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		if(parte == 1) {
			System.out.println("Digite o nome do cliente que deseja ser alterado:");
			cliente.setNome(sc.nextLine());
			return(cliente);
		}else {

			System.out.println("NOVO NOME:");
			cliente.setNome(sc.nextLine());
			System.out.printf("NOVO ENDEREÇO:");
			cliente.setEndereco(sc.nextLine());
	        System.out.println("NOVO CPF:");
			cliente.setCpf(sc.nextLine());
			System.out.println("NOVO CEP:");
			cliente.setCep(sc.nextLine());
			System.out.println("NOVO TELEFONE:");
			cliente.setTelefone(sc.nextLine());
			System.out.println("USUARIO:");
			cliente.setLogin(sc.nextLine());
			System.out.println("SENHA:");
			cliente.setSenha(sc.nextLine());
			System.out.println("NOVA IDADE:");
			cliente.setIdade(sc.nextInt());
			return(cliente);
		}
	}
	
	public static void Consultar(Cliente cliente) {
		System.out.println("Nome: "+cliente.getNome());
		System.out.println("Cpf: "+cliente.getCpf());
		System.out.println("Cep: "+cliente.getCep());
		System.out.println("Telefone: "+cliente.getTelefone());
		System.out.println("Idade: "+cliente.getIdade());
		System.out.println("Usuario: "+cliente.getLogin());
		System.out.println("Senha: "+cliente.getSenha());
		System.out.println("Saldo: "+cliente.getSaldo());
		System.out.println("Endereço: "+cliente.getEndereco()+"\n");
	}
	
	public static void Mensagens(String tipo) {
		switch(tipo) {
		case "naoEncontrado":	System.out.println("Cliente não encontrado!");
								break;
		case "naoCadastrado":	System.out.println("Não existem clientes cadastrados!");
								break;
		case "cadastrado":	System.out.println("Cliente cadastrado com sucesso!");
							break;
		case "deletado":	System.out.println("Cliente deletado com sucesso!");
							break;
		case "alterado":	System.out.println("Cliente alterado com sucesso!");
		}
	}
}
