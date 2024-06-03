package Automation.TESTE;

import org.junit.Test;

import Automation.PAGE.LoginPAGE;

public class LoginTESTE extends BaseTESTE {

	LoginPAGE login = new LoginPAGE();

	String urlPrincipal = "https://bugbank.netlify.app/";
	String primeiraConta;

	// Cadastrar Primeiro usuário
	@Test
	public void criarUsuario1() {
		login.acessarTelaInicial(urlPrincipal);
		login.clicarRegistrar();
		login.cadastrarEmailNovo("caioprimeirocadastro@gmail.com");
		login.cadastrarNome("Caio Primeiro Cadastro");
		login.cadastrarSenha("123123");
		login.confirmaSenha("123123");
		login.criarContaComSaldo();
		login.clicarCadastar();
	}
	
	// Cadastrar Segundo usuário
	@Test
	public void criarUsuario2() {
		login.acessarTelaInicial(urlPrincipal);
		login.clicarRegistrar();
		login.cadastrarEmailNovo("caioSegundocadastro@gmail.com");
		login.cadastrarNome("Caio Segundo Cadastro");
		login.cadastrarSenha("123123");
		login.confirmaSenha("123123");
		login.criarContaComSaldo();
		login.clicarCadastar();
	}

}
