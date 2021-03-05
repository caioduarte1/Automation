package Automation.PAGE_Produtos;

import Automation.PAGE.BasePage;

public class ComprarDressesPage extends BasePage {

	public void clicarDresses() {
		clicarViaCss(".sf-menu > li:nth-child(2) > a:nth-child(1)");
	}

	public void selecionarCasual() {
		clicarViaCss(
				"#subcategories > ul:nth-child(2) > li:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)");
	}

	public void confirmarSelecionadoCasual() {
		clicarViaCss(".product_img_link > img:nth-child(1)");
	}

	public void addToCard() {
		clicarViaCss("button.exclusive > span:nth-child(1)");
	}

	public void addItemNocheckout() {
		clicarViaCss("a.btn:nth-child(2) > span:nth-child(1)");
	}

	public void procedToCheckout() {
		clicarViaCss(".standard-checkout > span:nth-child(1)");
	}

	public void procedToCheckoutEndereco() {
		clicarViaCss("button.button:nth-child(4) > span:nth-child(1)");
	}

	public void acertoDeServico() {
		clicarViaCss("#cgv");
	}

	public void shippingProceedToCheckou() {
		clicarViaCss("button.button:nth-child(4) > span:nth-child(1)");
	}

	public void bankWirePayment() {
		clicarViaCss(".bankwire > span:nth-child(1)");
	}

	public void confirmacaoTransferencia() {
		clicarViaCss("button.button-medium > span:nth-child(1)");
	}

	public String retornaConfirmacaoAprovada() {
		return obterValorCampoCss(".cheque-indent > strong:nth-child(1)");
	}

}
