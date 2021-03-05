package Automation.TESTE_Produtos;

import org.junit.Assert;
import org.junit.Test;

import Automation.PAGE_Produtos.ComprarShirtPage;
import Automation.TESTE.BaseTeste;

public class ComprarShirtTeste extends BaseTeste {

	ComprarShirtPage csp = new ComprarShirtPage();

	@Test
	public void comprarShirt() throws InterruptedException {
		csp.esperarPor2s();
		csp.clicarTShirt();
		csp.selecionarCasual();
		csp.addToCard();
		csp.esperarPor2s();
		csp.addItemNocheckout();
		csp.procedToCheckout();
		csp.procedToCheckoutEndereco();
		csp.acertoDeServico();
		csp.shippingProceedToCheckou();
		csp.payByCheck();
		csp.confirmarPagamento();
		Assert.assertEquals("YOUR CHECK MUST INCLUDE:", csp.retornaConfirmacaodeCheck());
	}
}