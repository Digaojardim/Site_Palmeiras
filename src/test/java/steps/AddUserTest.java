package steps;

import conexoes.DriversFactory;
import elementos.Elementos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import metodos.MetodosDeTestes;
import pages.AddUserPage;
import runner.Executa;

public class AddUserTest extends DriversFactory {

	AddUserPage page = new AddUserPage();
	MetodosDeTestes meto = new MetodosDeTestes();
	Elementos el = new Elementos();
	Executa eu = new Executa();

	@SuppressWarnings("static-access")
	@Dado("que entro no site do \"Palmeiras'")
	public void queEntroNoSiteDoPalmeiras() {
		eu.abrirNavegador();

	}

	@Quando("clico em entrar no site")
	public void clicoEmEntrarNoSite() {
		//meto.clicar(el.Entrarsite);

	}

	@Quando("clico em ingressos")
	public void clicoEmIngressos() {
		meto.clicar(el.Ingressos);

	}

	@Quando("clico em postos de vendas")
	public void clicoEmPostosDeVendas() {
		meto.clicar(el.Postosvendas);

	}
	

	@SuppressWarnings("static-access")
	@Entao("clico em seja avante")
	public void clicoEmSejaAvante() {
	    meto.clicar(el.Avante);
	    eu.fecharnavegador();
	   
	}




	

	

	}


