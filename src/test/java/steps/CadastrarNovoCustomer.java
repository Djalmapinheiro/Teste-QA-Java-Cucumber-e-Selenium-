package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import runner.Executa;
import utils.MassadeDados;

public class CadastrarNovoCustomer {

	HomePage hPages = new HomePage();
	MassadeDados dados = new MassadeDados();

	@Before
	public static void iniciarTeste() {

		Executa.abrirNavegador();

	}

	@After
	public static void finalizarTest() {
		Executa.fecharNavegador();

	}

	@Given("que selecione o bootstrap v4")
	public void queSelecioneOBootstrapV4() {
		hPages.selecionarVersao("Bootstrap V4 Theme");

	}

	@Given("acessar o formulario")
	public void acessarOFormulario() {
	hPages.preencherFormulario(dados.gerarNome(4), "Coders");

	}

	@When("enviar o formulario")
	public void enviarOFormulario() {

	}

	@Then("valido a mensagem de envio")
	public void validoAMensagemDeEnvio() {
		hPages.validarMensagem("Your data has been successfully stored into the database. ");
		
		

	}

}
