import controler.AutoresController;
import controler.EditorasController;
import controler.GenerosController;
import controler.LivrosController;
import controler.UsuariosController;

public class Main {

	public static void main(String[] args) {
		GenerosController gcontroller = new GenerosController();
		UsuariosController ucontroller = new UsuariosController();
		EditorasController econtroller = new EditorasController();
		AutoresController acontroller = new AutoresController();
		LivrosController lcontroller = new LivrosController();


		//gcontroller.Criar();
		//gcontroller.Consultar();
		//gcontroller.Deletar();
		//gcontroller.Alterar();
		
		//ucontroller.Criar();
		//ucontroller.Consultar();
		//ucontroller.Deletar();
		//ucontroller.Alterar();
		
		//econtroller.Criar();
		//econtroller.Consultar();
		//econtroller.Deletar();
		//econtroller.Alterar();
		
		//acontroller.Criar();
		//acontroller.Consultar();
		//acontroller.Deletar();
		//acontroller.Alterar();
		
		//lcontroller.Criar();
		lcontroller.Consultar();
		//lcontroller.Deletar();
		//lcontroller.Alterar();
	}

}
