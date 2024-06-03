package Automation.PAGE;

public class TraferirValorPAGE extends BasePAGE {

		
	//  ***Transferência***
	
	public void clicarTransferencia() {
		clicarViaXpath("//*[@id=\"btn-TRANSFERÊNCIA\"]");
	}
	
	public void inserirNumeroDaConta(String conta) {
		escreverViaXpath("//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[1]/input", conta);
	}	
	
	public void inserirDigitoDaConta(String digito) {
		escreverViaXpath("//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[2]/input", digito);
	}
	
	public void inserirValorTransferencia(String valor) {
		escreverViaXpath("//*[@id=\"__next\"]/div/div[3]/form/div[2]/input", valor);
	}
	
	public void informarDescricao(String descricao) {
		escreverViaXpath("//*[@id=\"__next\"]/div/div[3]/form/div[3]/input", descricao);
	}
		
	public void clicarTransferirAgora() {
		clicarViaXpath("//*[@id=\"__next\"]/div/div[3]/form/button");
	}
	
	public void fecharModal() {
		clicarViaXpath("//*[@id=\"btnCloseModal\"]");
		
	}
	
	public void clicarVoltar() {
		clicarViaXpath("//*[@id=\"btnBack\"]");
	}
	
	public String obterSaldoConta() {
		return obterValorCampoByXpath("//*[@id=\"textBalance\"]/span");
	}
	
	public String obterNumeroDaContaDigital() {
		return obterValorCampoByXpath("//*[@id=\"textAccountNumber\"]/span");
	}	
}
