package Automation.PAGE;

import static Automation.CORE.DriverFactory.getdDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class BasePAGE {

	public void acessarURL(String url) {
		getdDriver().get(url);
	}

	public void escreverViaCss(String cssSelector, String texto) {
		getdDriver().findElement(By.cssSelector(cssSelector)).sendKeys(texto);
	}

	public void clicarViaCss(String cssSelector) {
		getdDriver().findElement(By.cssSelector(cssSelector)).click();
	}

	public String retornaTextoViaCss(String cssSelector) {
		return getdDriver().findElement(By.cssSelector(cssSelector)).getText();
	}

	public void esperaImplicita() {
		getdDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public String obterValorCampoCss(String cssSelector) {
		return getdDriver().findElement(By.cssSelector(cssSelector)).getText();
	}


}
