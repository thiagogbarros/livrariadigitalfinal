package view;
import java.util.Scanner;

import controler.ClientesController;
import controler.UsuariosController;
import controler.FuncionariosController;
import controler.LivrosController;
import controler.GenerosController;
import controler.AutoresController;
import controler.CarrinhosController;
import controler.EditorasController;
import model.Usuario;
import model.Cliente;

public class NavegacaoView {
	
	public void telaInicial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println();
		System.out.println("[1] - Novo Cliente ");
		System.out.println("[2] - Novo Funcionario ");
		System.out.println("[3] - Buscar Livro ");
		System.out.println("[4] - Entrar como Usuario");
		System.out.println("[5] - Entrar como Funcionario");
		System.out.println("[6] - Sair \n");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");
		int op = sc.nextInt();
		
				switch(op) {
					case 1:
						ClientesController novoc = new ClientesController();
						novoc.Criar();
						telaPerfilCliente();
					case 2:
						FuncionariosController novof = new FuncionariosController();
						novof.Criar();
						telaPerfilFuncionario();
					case 3:
						telaBuscarVisitante();
					case 4:
						this.telaPerfilCliente();
					case 5:
						this.telaPerfilFuncionario();
					default:
						System.exit(0);
						
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
				telaMeusDadosCliente();
			case 2:
				telaLoja();
			case 3:
				telaCarrinho();
			case 4:
				telaFinalizarCompra();
			default:
				telaInicial();
			}
	}
	
	public void telaPerfilFuncionario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");
		System.out.println();
		System.out.println("\t\tPERFIL FUNCIONARIO\n");
		System.out.println("[1] - Meus Dados");
		System.out.println("[2] - Manter dados");
		System.out.println("[3] - Pedidos dos Clientes");
		System.out.println("[4] - Deslogar");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");
		int op = sc.nextInt();
			switch(op) {
			case 1:
				telaMeusDadosFuncionario();
			case 2:
				this.telaManter();
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
		//System.out.println("IMPRIMIR OS DADOS AQUI!!!");
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
		//System.out.println("IMPRIMIR OS DADOS AQUI!!!");
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
	
	public void telaManter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");		
		System.out.println("[1] - Manter Cliente");
		System.out.println("[2] - Manter Autor");
		System.out.println("[3] - Manter Usuario");
		System.out.println("[4] - Manter Editora");
		System.out.println("[5] - Manter Genero");
		System.out.println("[6] - Manter Livro");
		System.out.println("[7] - Manter Carrinho");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");		
		int op = sc.nextInt();	
		switch(op) {
			case 1:
				telaCrudCliente();
			case 2:
				telaCrudAutor();
			case 3:
				telaCrudUsuario();
			case 4:
				telaCrudEditora();
			case 5:
				telaCrudGenero();
			case 6:
				telaCrudLivro();
			case 7:
				telaCrudCarrinho();
		}
	}
		
	public void telaCrudCliente() {
			ClientesController ccontroller = new ClientesController();
			Scanner sc = new Scanner(System.in);
			System.out.println("------------- L I V R A R I A  A B C -------------");		
			System.out.println("[1] - Criar");
			System.out.println("[2] - Alterar");
			System.out.println("[3] - Consultar");
			System.out.println("[4] - Deletar");
			System.out.println("--------------------------------------------------");
			System.out.print("Opcao: ");		
			int op = sc.nextInt();	
			switch(op) {
				case 1:
					ccontroller.Criar();
					this.telaPerfilFuncionario();

				case 2:
					ccontroller.Alterar();
					this.telaPerfilFuncionario();

				case 3:
					ccontroller.Consultar();
					this.telaPerfilFuncionario();

				case 4:
					ccontroller.Deletar();
					this.telaPerfilFuncionario();

			}						
			
		}
	
	public void telaCrudAutor() {
		AutoresController acontroller = new AutoresController();
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");		
		System.out.println("[1] - Criar");
		System.out.println("[2] - Alterar");
		System.out.println("[3] - Consultar");
		System.out.println("[4] - Deletar");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");		
		int op = sc.nextInt();	
		switch(op) {
			case 1:
				acontroller.Criar();
				this.telaPerfilFuncionario();

			case 2:
				acontroller.Alterar();
				this.telaPerfilFuncionario();

			case 3:
				acontroller.Consultar();
				this.telaPerfilFuncionario();

			case 4:
				acontroller.Deletar();
				this.telaPerfilFuncionario();

		}						
		
	}

	public void telaCrudUsuario() {
		UsuariosController ucontroller = new UsuariosController();
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");		
		System.out.println("[1] - Criar");
		System.out.println("[2] - Alterar");
		System.out.println("[3] - Consultar");
		System.out.println("[4] - Deletar");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");		
		int op = sc.nextInt();	
		switch(op) {
			case 1:
				ucontroller.Criar();
				this.telaPerfilFuncionario();

			case 2:
				ucontroller.Alterar();
				this.telaPerfilFuncionario();

			case 3:
				ucontroller.Consultar();
				this.telaPerfilFuncionario();

			case 4:
				ucontroller.Deletar();
				this.telaPerfilFuncionario();

		}						
		
	}

	public void telaCrudEditora() {
		EditorasController econtroller = new EditorasController();
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");		
		System.out.println("[1] - Criar");
		System.out.println("[2] - Alterar");
		System.out.println("[3] - Consultar");
		System.out.println("[4] - Deletar");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");		
		int op = sc.nextInt();	
		switch(op) {
			case 1:
				econtroller.Criar();
				this.telaPerfilFuncionario();

			case 2:
				econtroller.Alterar();
				this.telaPerfilFuncionario();

			case 3:
				econtroller.Consultar();
				this.telaPerfilFuncionario();

			case 4:
				econtroller.Deletar();
				this.telaPerfilFuncionario();

		}						
		
	}

	public void telaCrudGenero() {
		GenerosController gcontroller = new GenerosController();
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");		
		System.out.println("[1] - Criar");
		System.out.println("[2] - Alterar");
		System.out.println("[3] - Consultar");
		System.out.println("[4] - Deletar");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");		
		int op = sc.nextInt();	
		switch(op) {
			case 1:
				gcontroller.Criar();
				this.telaPerfilFuncionario();

			case 2:
				gcontroller.Alterar();
				this.telaPerfilFuncionario();

			case 3:
				gcontroller.Consultar();
				this.telaPerfilFuncionario();

			case 4:
				gcontroller.Deletar();
				this.telaPerfilFuncionario();

		}						
		
	}
	
	public void telaCrudLivro() {
		LivrosController lcontroller = new LivrosController();
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");		
		System.out.println("[1] - Criar");
		System.out.println("[2] - Alterar");
		System.out.println("[3] - Consultar");
		System.out.println("[4] - Deletar");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");		
		int op = sc.nextInt();	
		switch(op) {
			case 1:
				lcontroller.Criar();
				this.telaPerfilFuncionario();

			case 2:
				lcontroller.Alterar();
				this.telaPerfilFuncionario();

			case 3:
				lcontroller.Consultar();
				this.telaPerfilFuncionario();

			case 4:
				lcontroller.Deletar();
				this.telaPerfilFuncionario();

		}						
		
	}

	public void telaCrudCarrinho() {
		CarrinhosController cacontroller = new CarrinhosController();
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- L I V R A R I A  A B C -------------");		
		System.out.println("[1] - Criar");
		System.out.println("[2] - Alterar");
		System.out.println("[3] - Consultar");
		System.out.println("[4] - Deletar");
		System.out.println("--------------------------------------------------");
		System.out.print("Opcao: ");		
		int op = sc.nextInt();	
		switch(op) {
			case 1:
				cacontroller.Criar();
				this.telaPerfilFuncionario();

			case 2:
				cacontroller.Alterar();
				this.telaPerfilFuncionario();

			case 3:
				cacontroller.Consultar();
				this.telaPerfilFuncionario();
			case 4:
				cacontroller.Deletar();
				this.telaPerfilFuncionario();
		}						
		
	}

	
}