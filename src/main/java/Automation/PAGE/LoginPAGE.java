package Automation.PAGE;

public class LoginPAGE extends BasePAGE {
	
	
	// *** LOGIN ***
	public void acessarTelaInicial(String url) {
		acessarURL(url);
	}

	public void escreverEmail(String email) {
		escreverViaName("email", email);
	}

	public void escreverSenha(String senha) {
		escreverViaName("password", senha);
	}

	public void clicarAcessar() {
		clicarViaCss(
				"#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.otUnI.button__child");
	}

	public String obterNumeroDaConta() {
		return obterValorCampoByXpath("//*[@id=\"textAccountNumber\"]/span");
	}

	// *** Registrar-se ***
	
	public void clicarRegistrar() {
		clicarViaCss(
				"#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.ihdmxA.button__child");
	}

	public void cadastrarEmailNovo(String email) {
		escreverViaXpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input", email);
	}

	public void cadastrarNome(String nome) {
		escreverViaName("name", nome);
	}

	public void cadastrarSenha(String senha) {
		escreverViaXpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input", senha);
	}

	public void confirmaSenha(String confirmacaoSenha) {
		escreverViaName("passwordConfirmation", confirmacaoSenha);

	}

	public void criarContaComSaldo() {
		clicarViaXpath("//*[@id=\"toggleAddBalance\"]");
	}

	public void clicarCadastar() {
		clicarViaXpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button");
	}

	
	
	
	
	
}
