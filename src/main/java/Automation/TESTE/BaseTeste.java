package Automation.TESTE;

import static Automation.CORE.DriverFactory.getdDriver;
import static Automation.CORE.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Automation.CORE.Propriedades;
import Automation.PAGE.BasePage;
import Automation.PAGE.LoginPage;

public class BaseTeste extends BasePage{
	
	LoginPage login = new LoginPage();

	@Rule
	public TestName testname = new TestName();
	
	@Before
	public void inicializa() throws InterruptedException {
		logarEmProducao();
	}
	
	public void logarEmProducao() {
		login.acessarTelaInicialProducao("http://automationpractice.com/index.php");
		login.clicarSignIn();
		login.escreverEmail("Teste638@gmail.com");
		login.escreverSenha("123123");
		login.clicarLogar();
	}
	
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