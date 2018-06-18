import controler.EditorasController;
import controler.GenerosController;
import controler.UsuariosController;

public class Main {

	public static void main(String[] args) {
		GenerosController gcontroller = new GenerosController();
		UsuariosController ucontroller = new UsuariosController();
		EditorasController econtroller = new EditorasController();
		//gcontroller.Criar();
		//gcontroller.Consultar();
		//gcontroller.Deletar();
		//gcontroller.Alterar();
		//gcontroller.Consultar();
		
		//ucontroller.Criar();
		//ucontroller.Consultar();
		//ucontroller.Deletar();
		//ucontroller.Alterar();
		//ucontroller.Consultar();
		
		//econtroller.Criar();
		//econtroller.Consultar();
		//econtroller.Deletar();
		//econtroller.Alterar();
		econtroller.Consultar();
	}

}
