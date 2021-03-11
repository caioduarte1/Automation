package Automation.PAGE_Cadastro;

import static Automation.CORE.DriverFactory.getdDriver;

import java.util.concurrent.TimeUnit;

import Automation.PAGE.BasePAGE;

public class CadastroNovoUsuarioPAGE extends BasePAGE{

	public void acessarTelaInicialProducao(String url) {
		acessarURL(url);
	}
	
	public void clicarSignIn() {
		clicarViaCss("#header > div.nav > div > div > nav > div.header_user_info > a");
	}                
	
	public void escreverEmail(String email) {
		escreverViaCss("#email_create",email); 
	}
	
	public void clicarCriarNovaConta() {
		clicarViaCss("#SubmitCreate > span");
	} 
	
	public void clicarRadioBoxSexoMasc(){
		clicarViaCss("#id_gender1");  
	}
	
	public void inserirFirstNameYPI(String fname) {
		escreverViaCss("#customer_firstname",fname);
	}
	
	public void inserirLastNameYPI(String lname) {
		escreverViaCss("#customer_lastname",lname);
	}
	
	public void inserirPassword(String password) {
		escreverViaCss("#passwd",password);
	}

	public void inserirDiaNascimento(String dia) {
		escreverViaCss("#days",dia);
	}

	public void inserirMesNascimento(String mes) {
		escreverViaCss("#months", mes);
	}
	
	public void inserirAnoNascimento(String ano) {
		escreverViaCss("#years", ano);
	}
	
	public void aceitarCheckBoxNewsLetter() {
		clicarViaCss("#newsletter");
	} 
	
	public void aceitarCheckBoxPartners() {
		clicarViaCss("#optin");
	} 
//	YOUR ADRESS
	public void inserirFirstNameYA(String fname) {
		escreverViaCss("#firstname", fname);
	} 

	public void inserirLastNameYA(String lname) {
		escreverViaCss("#lastname", lname);
	} 

	public void inserirAdress(String adress) {
		escreverViaCss("#address1", adress);
	} 

	public void inserirCity(String city) {
		escreverViaCss("#city", city);
	} 

	public void inserirState(String state) {
		escreverViaCss("#id_state", state);
	} 
	
	public void inserirZipCode(String zipcode) {
		escreverViaCss("#postcode", zipcode);
	} 

	public void inserirCountry(String coutry) {
		escreverViaCss("#id_country", coutry);
	} 
	
	public void inserirMobilePhone(String coutry) {
		escreverViaCss("#phone_mobile", coutry);
	} 
	
	public void esperaImplicita() {
		getdDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void clicarRegistrar(){
		clicarViaCss("#submitAccount > span");  
	}
	
	
	
}
