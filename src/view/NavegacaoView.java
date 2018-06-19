package view;
import java.util.Scanner;


public class NavegacaoView {
	
	public void telaInicial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println();
		System.out.println("[1] - Novo Cliente ");
		System.out.println("[2] - Novo Funcionario ");
		System.out.println("[3] - Buscar Livro ");
		System.out.println("[4] - Sair \n");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");
		int op = sc.nextInt();
		
				switch(op) {
					case 1:
						
						//telaPerfilCliente();
					case 2:
						telaPerfilFuncionario();
					case 3:
						telaBuscarVisitante();
					case 4:
						System.exit(0);
					default:
						System.out.println("Opcao invalida!");					
				}
	}
	
	public void telaPerfilCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println();
		System.out.println("\t\t  PERFIL CLIENTE\n");
		System.out.println("[1] - Meus Dados");
		System.out.println("[2] - Ir para loja");
		System.out.println("[3] - Carrinho");
		System.out.println("[4] - Finalizar Compra");
		System.out.println("[5] - Deslogar \n");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");
		int op = sc.nextInt();
			switch(op) {
			case 1:
				//novo.Consultar(); quero mostrar os dados do cliente
				
			case 2:
				telaLoja();
			case 3:
				telaCarrinho();
			case 4:
				telaFinalizarCompra();
			case 5:
				telaInicial();
			default:
				System.out.println("Opcao invalida!");
			}
	}
	
	public void telaPerfilFuncionario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println();
		System.out.println("\t\tPERFIL FUNCIONARIO\n");
		System.out.println("[1] - Meus Dados");
		System.out.println("[2] - Gerenciar Estoque");
		System.out.println("[3] - Pedidos dos Clientes");
		System.out.println("[4] - Deslogar");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");
		int op = sc.nextInt();
			switch(op) {
			case 1:
				telaMeusDadosFuncionario();
			case 2:
				//GERENCIAR ESTOQUE
			case 3:
				//PEDIDOS DOS CLIENTES
			case 4:
				telaInicial();
			default:
				System.out.println("Opcao invalida!");
			}
	}

	public void telaMeusDadosCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println();
		System.out.println("\t\t MEUS DADOS(Cliente)\n");
		System.out.println("IMPRIMIR OS DADOS AQUI!!!");
		System.out.println("\t	[1] - Editar");
		System.out.println("\t	[2] - Excluir");
		System.out.println("\t	[3] - Meu Perfil");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");
		int op = sc.nextInt();
			switch(op) {
			case 1:
				//alterar dados cliente
			case 2:
				//Excluir cliente
			default:
				telaPerfilCliente();
			}	
	}

	public void telaMeusDadosFuncionario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println();
		System.out.println("\t\t MEUS DADOS(Funcionario)\n");
		System.out.println("IMPRIMIR OS DADOS AQUI!!!");
		System.out.println("\t	[1] - Editar");
		System.out.println("\t	[2] - Excluir");
		System.out.println("\t	[3] - Meu Perfil");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");
		int op = sc.nextInt();
			switch(op) {
			case 1:
				//alterar dados funcionario
			case 2:
				//Excluir funcionario
			default:
				telaPerfilFuncionario();
			}	
	}
	
	
	public void telaLoja() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println("\t\t	LOJA\n");
		System.out.println("[1] - Catalogo de Livros");
		System.out.println("[2] - Buscar Livro");
		System.out.println("[3] - Meu perfil");
		System.out.println("--------------------------------------------------");
		System.out.printf("Opcao: ");
		int op = sc.nextInt();
			switch(op) {
			case 1:
				//MOSTRAR TODOS OS LIVROS DA LOJA
			case 2:
				telaBuscarCliente();
			case 3:
				telaPerfilCliente();
			}
	}

	public void telaCarrinho() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println("\t\t     CARRINHO");
		System.out.println("[1] - Visualizar itens");
		System.out.println("[2] - Esvaziar Carrinho");
		System.out.println("[3] - Meu perfil");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");
		int op = sc.nextInt();	
				switch(op) {
					case 1:
						//VISUALIZAR ITENS
					case 2:
						//ESVAZIAR CARRINHO
					default:
						telaPerfilCliente();
				}
	}

	public void telaFinalizarCompra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println("\t\t FINALIZAR COMPRA");
		System.out.println("[1] - Visualizar itens");
		System.out.println("[2] - Pagar");
		System.out.println("[3] - Meu perfil");		
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");		
		int op = sc.nextInt();	
		switch(op) {
			case 1:
				//VISUALIZAR ITENS
			case 2:
				//Pagar
			case 3:
				telaPerfilCliente();
			default:
				System.out.println("Opcao invalida!");
		}		
	}

	public void telaBuscarVisitante() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println("\t\tPESQUISAR(Visitante)");
		System.out.println("[1] - Buscar por TITULO");
		System.out.println("[2] - Buscar por AUTOR");
		System.out.println("[3] - Buscar por GENERO");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");		
		int op = sc.nextInt();	
		switch(op) {
			case 1:
				//BUSCAR POR TITULO
			case 2:
				//BUSCAR POR AUTOR
			case 3:
				//BUSCAR POR GENERO
			default:
				telaInicial();
		}		
	}

	public void telaBuscarCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println("\t\tPESQUISAR(Cliente)");
		System.out.println("[1] - Buscar por TITULO");
		System.out.println("[2] - Buscar por AUTOR");
		System.out.println("[3] - Buscar por GENERO");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");		
		int op = sc.nextInt();	
		switch(op) {
			case 1:
				//BUSCAR POR TITULO
			case 2:
				//BUSCAR POR AUTOR
			case 3:
				//BUSCAR POR GENERO
			default:
				telaPerfilCliente();
		}		
	}
	
}