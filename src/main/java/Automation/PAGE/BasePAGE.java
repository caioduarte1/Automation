package Automation.PAGE;

import static Automation.CORE.DriverFactory.getdDriver;
import static Automation.CORE.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Automation.CORE.Propriedades;

public class BasePAGE {

	public void acessarURL(String url) {
		getdDriver().get(url);
	}

	public void buscarElementoViaXpath(String text) {
		getdDriver().findElement(By.xpath(text));
	}
	
	public void buscarElementoViaType(String text) {
		getdDriver().findElement(By.tagName("text"));
	}

	public void escreverViaXpath(String xPath, String texto) {
		getdDriver().findElement(By.xpath(xPath)).sendKeys(texto);
	}
	
	public void escreverViaCss(String cssSelector, String texto) {
		getdDriver().findElement(By.cssSelector(cssSelector)).sendKeys(texto);
	}

	public void escreverViaName(String name, String texto) {
		getdDriver().findElement(By.name(name)).sendKeys(texto);
	}

	public void clicarViaTeste(String name) {
		getdDriver().findElement(By.name(name)).click();
	}

		public void clicarViaXpath(String xPath) {
		getdDriver().findElement(By.xpath(xPath)).click();
	}
	
	public void clicarViaCss(String cssSelector) {
		getdDriver().findElement(By.cssSelector(cssSelector)).click();
	}

	public String retornaTextoViaCss(String cssSelector) {
		return getdDriver().findElement(By.cssSelector(cssSelector)).getText();
	}

	public void esperaImplicita() {
		getdDriver().manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
	}

	public String obterValorCampoCss(String cssSelector) {
		return getdDriver().findElement(By.cssSelector(cssSelector)).getText();
	}

	public String obterValorCampo(String id_campo) {
		return getdDriver().findElement(By.id(id_campo)).getAttribute("value");
	}
	
	public String obterValorCampoByXpath(String xpath) {
		return getdDriver().findElement(By.xpath(xpath)).getText();
	}
	
	public String obterValorCampoCssSelector(String cssSelector) {
		return getdDriver().findElement(By.cssSelector(cssSelector)).getText();
	}
	
	public String obterValorCampoById(String id) {
		return getdDriver().findElement(By.id(id)).getText();
	}
	
	public String obterClassName(String className) {
		return getdDriver().findElement(By.className(className)).getText();
	}
	
	//Realiza os relatórios por método
	@Rule
	public TestName testname = new TestName();

	@After
	public void registraRelatorio() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/"+testname.getMethodName()+".html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest(testname.getMethodName());
		logger.log(Status.INFO, "Log");
		extent.flush();
	}
		
	//Realiza os prints de cada método
	@After
	public void finaliza() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getdDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File(
				"target" + File.separator + 
				"screenshot" + File.separator + testname.getMethodName()+ ".jpg"));
		if (Propriedades.FECHAR_BROWSER)
			killDriver();
	}


}
