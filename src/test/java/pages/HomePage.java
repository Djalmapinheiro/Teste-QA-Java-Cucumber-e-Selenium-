package pages;

import elementos.ElementosWeb;
import metodos.MetodosDeTeste;
import utils.MassadeDados;

public class HomePage {

	MetodosDeTeste metodos = new MetodosDeTeste();

	ElementosWeb elementos = new ElementosWeb();
	MassadeDados dados = new MassadeDados();

	public void selecionarVersao(String versao) {
		metodos.escrever(elementos.getVersao(), versao);

	}

	public void preencherFormulario(String name, String lastName) {
		metodos.clicar(elementos.getBtnAdd());
		metodos.escrever(elementos.getName(), name);
		metodos.escrever(elementos.getLastName(), lastName);

		metodos.escrever(elementos.getContactFirstName(), dados.contactFirstName);
		metodos.escrever(elementos.getPhone(), dados.Phone);
		metodos.escrever(elementos.getAddressLine1(), dados.addressLine1);
		metodos.escrever(elementos.getAddressLine2(), dados.addressLine2);
		metodos.escrever(elementos.getCity(), dados.city);
		metodos.escrever(elementos.getState(), dados.state);
		metodos.escrever(elementos.getPostalCode(), dados.postalCode);
		metodos.escrever(elementos.getCountry(), dados.country);
		
		metodos.scroll(0, 300);
		metodos.esperarElemento(elementos.getFromEmployeer());

		metodos.escreverPorTexto(elementos.getFromEmployeer(), "Bondur");
		metodos.clicar(elementos.getFromEmployeer());
		
		metodos.escrever(elementos.getCreditLimit(), dados.creditlimited);
		metodos.escrever(elementos.getDeleted(), dados.deleted);
		metodos.clicar(elementos.getBtnSave());

		metodos.tirarEvidencia("Preencher Formulario");

	}

	public void validarMensagem(String mensagem) {
		metodos.esperarElemento(elementos.getMsgSucesso());
		metodos.validarMsg(elementos.getMsgSucesso(), mensagem);
		
		metodos.tirarEvidencia("Mensagem de Sucesso");

	}

}
