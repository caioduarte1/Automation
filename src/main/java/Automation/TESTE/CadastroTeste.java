package Automation.TESTE;

import java.util.Random;

import org.junit.Test;

import Automation.PAGE.CadastroPage;

public class CadastroTeste extends BaseTeste {

	CadastroPage cadastro = new CadastroPage();
	Random random = new Random(); 
	
	@Test
	public void CriarCadastroUsuario() throws InterruptedException { 
				
		int numeroRandomico = random.nextInt(1000);
		//cadastro.acessarTelaInicialProducao("http://automationpractice.com/index.php");
		cadastro.clicarSignIn();
		cadastro.escreverEmail("Teste"+numeroRandomico+"@gmail.com");
		cadastro.clicarCriarNovaConta();
		cadastro.esperarPor2s();
		cadastro.clicarRadioBoxSexoMasc();
		cadastro.inserirFirstNameYPI("Name");
		cadastro.inserirLastNameYPI("LastName"); 
		cadastro.inserirPassword("123123");
		cadastro.inserirDiaNascimento("12");
		cadastro.inserirMesNascimento("August");
		cadastro.inserirAnoNascimento("1983");
		cadastro.aceitarCheckBoxNewsLetter();
		cadastro.aceitarCheckBoxPartners();
		//YOUR ADRESS
		cadastro.inserirFirstNameYA("Name");
		cadastro.inserirLastNameYA("LastName");
		cadastro.inserirAdress("Rua 12");
		cadastro.inserirCity("City");
		cadastro.inserirState("Alaska");
		cadastro.inserirZipCode("12345");
		cadastro.inserirCountry("United States");
		cadastro.inserirMobilePhone("515 552 661");
		cadastro.clicarRegistrar();
				
	}
}
