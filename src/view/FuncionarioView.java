package view;
import java.util.Scanner;

import model.Funcionario;


public class FuncionarioView {
	public static Funcionario Criar() {

		System.out.println("FUNCIONARIO: Criando...");
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		System.out.println("NOME:");
		funcionario.setNome(sc.nextLine());
		System.out.printf("ENDEREÇO:");
		funcionario.setEndereco(sc.nextLine());
        System.out.println("CPF:");
		funcionario.setCpf(sc.nextLine());
		System.out.println("CEP:");
		funcionario.setCep(sc.nextLine());
		System.out.println("TELEFONE:");
		funcionario.setTelefone(sc.nextLine());
		System.out.println("USUARIO:");
		funcionario.setLogin(sc.nextLine());
		System.out.println("SENHA:");
		funcionario.setSenha(sc.nextLine());
		System.out.println("IDADE:");
		funcionario.setIdade(sc.nextInt());
		return(funcionario);
	}
	
	public static int Deletar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o id do funcionario que deseja deletar");
		int id = sc.nextInt();
		return(id);
	}
	
	public static Funcionario Alterar(int parte) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		if(parte == 1) {
			System.out.println("Digite o nome do funcionario que deseja ser alterado:");
			funcionario.setNome(sc.nextLine());
			return(funcionario);
		}else {

			System.out.println("NOVO NOME:");
			funcionario.setNome(sc.nextLine());
			System.out.printf("NOVO ENDEREÇO:");
			funcionario.setEndereco(sc.nextLine());
	        System.out.println("NOVO CPF:");
			funcionario.setCpf(sc.nextLine());
			System.out.println("NOVO CEP:");
			funcionario.setCep(sc.nextLine());
			System.out.println("NOVO TELEFONE:");
			funcionario.setTelefone(sc.nextLine());
			System.out.println("USUARIO:");
			funcionario.setLogin(sc.nextLine());
			System.out.println("SENHA:");
			funcionario.setSenha(sc.nextLine());
			System.out.println("NOVA IDADE:");
			funcionario.setIdade(sc.nextInt());
			return(funcionario);
		}
	}
	
	public static void Consultar(Funcionario funcionario) {
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Cpf: "+funcionario.getCpf());
		System.out.println("Cep: "+funcionario.getCep());
		System.out.println("Telefone: "+funcionario.getTelefone());
		System.out.println("Idade: "+funcionario.getIdade());
		System.out.println("Usuario: "+funcionario.getLogin());
		System.out.println("Senha: "+funcionario.getSenha());
		System.out.println("Endereço: "+funcionario.getEndereco()+"\n");
	}
	
	public static void Mensagens(String tipo) {
		switch(tipo) {
		case "naoEncontrado":	System.out.println("Funcionario não encontrado!");
								break;
		case "naoCadastrado":	System.out.println("Não existem funcionarios cadastrados!");
								break;
		case "cadastrado":	System.out.println("Funcionario cadastrado com sucesso!");
							break;
		case "deletado":	System.out.println("Funcionario deletado com sucesso!");
							break;
		case "alterado":	System.out.println("Funcionario alterado com sucesso!");
		}
	}
}
