package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexoes.DriversFactory;

public class MetodosDeTeste extends DriversFactory {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void limparCampo(By elemento) {

		driver.findElement(elemento).clear();

	}

	public void tirarEvidencia(String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			System.err.println("***********Erro ao tirar Evidencia********");
			e.printStackTrace();
		}

	}

	public void escreverPorTexto(By elemento, String textoDigitado) {
		driver.findElement(elemento).sendKeys(textoDigitado);

	}

	public void validarMsg(By elemento, String TextoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(TextoEsperado));
		System.out.println(textoCapturado);
	}

	public void esperarElemento(By elemento) {

		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.elementToBeClickable(elemento));
		System.out.println(element.getText());

	}

	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
	}

}
