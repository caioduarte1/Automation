package Automation.TESTE;

import org.junit.Assert;
import org.junit.Test;

import Automation.PAGE.ConsultaSaldoPAGE;
import Automation.PAGE.LoginPAGE;
import Automation.PAGE.TraferirValorPAGE;

public class ConsultarSaldoTESTE  extends BaseTESTE {

	TraferirValorPAGE tvcs = new TraferirValorPAGE();
	LoginPAGE login = new LoginPAGE();
	ConsultaSaldoPAGE cs = new ConsultaSaldoPAGE();

	
	String urlPrincipal = "https://bugbank.netlify.app/";
	String numeroDaPrimeiraConta;

	// Consultar saldo da primeira conta cadastrada
	@Test
	public void consultarSaldoConta1() throws InterruptedException {
		login.acessarTelaInicial(urlPrincipal);
		login.escreverEmail("caioprimeirocadastro@gmail.com");
		login.escreverSenha("123123");
		login.clicarAcessar();
		Thread.sleep(1000);
		tvcs.obterSaldoConta();
		Assert.assertEquals(tvcs.obterSaldoConta(), "R$ 1.200,00");
//		verficarEntrada
		cs.clicarExtrato();
		cs.confirmarTranferencia();
		Assert.assertEquals(cs.confirmarTranferencia(), "R$ 200,00");
		
	}
	
	// Consultar saldo da segunda conta cadastrada
	@Test
	public void consultarSaldoConta2() throws InterruptedException {
		login.acessarTelaInicial(urlPrincipal);
		login.escreverEmail("caioSegundocadastro@gmail.com");
		login.escreverSenha("123123");
		login.clicarAcessar();
		Thread.sleep(1000);
		tvcs.obterSaldoConta();
		Assert.assertEquals(tvcs.obterSaldoConta(), "R$ 800,00");
		//verificar saida
		cs.clicarExtrato();
		Assert.assertEquals(cs.confirmarTranferencia(), "-R$ 200,00");

	}
	
}
