package Automation.PAGE;

public class LoginPage extends BasePage {

	public void acessarTelaInicialProducao(String url) {
		acessarURL(url);
	}
	
	public void clicarSignIn() {
		clicarViaCss("#header > div.nav > div > div > nav > div.header_user_info > a");
	} 
	
	public void escreverEmail(String email) {
		escreverViaCss("#email",email); 
	}
	
	
	public void escreverSenha(String senha) {
		escreverViaCss("#passwd",senha); 
	}
	
	public void clicarLogar(){
		clicarViaCss("#SubmitLogin > span");  
	}
	
}
