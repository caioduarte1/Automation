package Automation.TESTE;

import org.junit.Assert;
import org.junit.Test;

import Automation.PAGE.ConsultaSaldoPAGE;
import Automation.PAGE.LoginPAGE;
import Automation.PAGE.TraferirValorPAGE;

public class TraferirValorTESTE extends BaseTESTE {

	TraferirValorPAGE tv = new TraferirValorPAGE();
	LoginPAGE login = new LoginPAGE();
	ConsultaSaldoPAGE cs = new ConsultaSaldoPAGE();

	String urlPrincipal = "https://bugbank.netlify.app/";
	String numeroDaPrimeiraConta;
	String numeroDaSegundaConta;

	@Test
	public void transferirValor() throws InterruptedException {

		// Login do primeiro cadastro
		login.acessarTelaInicial(urlPrincipal);
		login.escreverEmail("caioprimeirocadastro@gmail.com");
		login.escreverSenha("123123");
		login.clicarAcessar();
		login.esperaImplicita();
		numeroDaPrimeiraConta = login.obterNumeroDaConta();

		// Divide a string em partes usando o caractere '-' como delimitador
		String[] partsConta1 = numeroDaPrimeiraConta.split("-");
		// Armazena as partes em variáveis separadamente da primeira conta
		String primeiraConta = partsConta1[0];
		String digitoPrimeiraConta = partsConta1[1];

		// Login do Segundo Cadastro
		login.acessarTelaInicial(urlPrincipal);
		login.escreverEmail("caioSegundocadastro@gmail.com");
		login.escreverSenha("123123");
		login.clicarAcessar();
		login.esperaImplicita();
		numeroDaSegundaConta = login.obterNumeroDaConta();

		// Divide a string em partes usando o caractere '-' como delimitador
		String[] partsConta2 = numeroDaSegundaConta.split("-");
		// Armazena as partes em variáveis separadamente da segunda conta
		String segundaConta = partsConta2[0];
		String digitoSegunaConta = partsConta2[1];
		numeroDaSegundaConta = segundaConta + '-' + digitoSegunaConta;

		// Verificar o número da segunda conta que está armezenado
		tv.obterNumeroDaContaDigital();
		Assert.assertEquals(tv.obterNumeroDaContaDigital(), numeroDaSegundaConta);

		// Transferência Da conta 2 para o a conta 1
		tv.clicarTransferencia();
		tv.inserirNumeroDaConta(primeiraConta);
		tv.inserirDigitoDaConta(digitoPrimeiraConta);
		tv.inserirValorTransferencia("200");
		tv.informarDescricao("Transferência de R$200,00 reais da conta 2 para a conta 1");
		tv.clicarTransferirAgora();
		login.esperaImplicita(); //deixei este para sair no print sem corte
		Thread.sleep(1000); //deixei este para sair no print sem corte

	}

}
