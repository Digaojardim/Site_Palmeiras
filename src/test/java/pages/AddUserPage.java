package pages;

import elementos.Elementos;
import metodos.MetodosDeTestes;

public class AddUserPage {
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	Elementos el = new Elementos();
	
	
	public void site() {
	//	metodos.clicar(el.Entrarsite);
		metodos.clicar(el.Ingressos);
		metodos.clicar(el.Postosvendas);
		metodos.clicar(el.Avante);
		
	}
	

}
