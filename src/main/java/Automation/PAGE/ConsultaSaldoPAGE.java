package Automation.PAGE;

public class ConsultaSaldoPAGE extends BasePAGE {
	
	
	public void clicarExtrato() {
		clicarViaXpath("//*[@id=\"btn-EXTRATO\"]");
	}
	
	public String confirmarTranferencia() {
		return obterValorCampoByXpath("/html/body/div/div/div[3]/div/div[2]/div[2]/div[2]/p[2]");
	}	


}
