package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class MassadeDados {

	public String nome = "E2E";
	public String contactFirstName = " E2E treinamentos";
	public String Phone = "11-99600-8818";
	public String addressLine1 = "rua teste";
	public String addressLine2 = "Bairro Cidade Jardim";
	public String city = "São José dos Campos";
	public String state = "São Paulo";
	public String postalCode = "11.123-666";
	public String country = "Brasil";
	public String creditlimited = "1000";
	public String deleted = "teste";
	

	public static String gerarNome(int letras) {

		String nomeGerado = RandomStringUtils.randomAlphabetic(letras);
		String nome = "James" + nomeGerado;
		return nome;

	}

	public static String gerarEmail(int letras) {
		String emailGerado = RandomStringUtils.randomAlphabetic(letras);
		String email = "joh" + emailGerado + "@e2etreinamentos.com.br";
		return email.toLowerCase();

	}

}
