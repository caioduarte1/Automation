package Automation.TESTE_Produtos;

import org.junit.Assert;
import org.junit.Test;

import Automation.PAGE_Produtos.ComprarDressesPage;
import Automation.TESTE.BaseTeste;

public class ComprarDressesTeste extends BaseTeste {

	//****Corrigir pois não pode incializar no baseTeste****
	ComprarDressesPage cdp = new ComprarDressesPage();

	@Test
	public void comprarDressePorTransferencia() throws InterruptedException {
		cdp.esperarPor2s();
		cdp.clicarDresses();
		cdp.selecionarCasual();
		cdp.confirmarSelecionadoCasual();
		cdp.addToCard();
		cdp.esperarPor2s();
		cdp.addItemNocheckout();
		cdp.procedToCheckout();
		cdp.procedToCheckoutEndereco();
		cdp.acertoDeServico();
		cdp.shippingProceedToCheckou();
		cdp.bankWirePayment();
		cdp.confirmacaoTransferencia();
		Assert.assertEquals("Your order on My Store is complete.", cdp.retornaConfirmacaoAprovada());

	}
}
