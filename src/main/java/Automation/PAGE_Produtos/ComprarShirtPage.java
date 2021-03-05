package Automation.PAGE_Produtos;

import Automation.PAGE.BasePage;

public class ComprarShirtPage extends BasePage {

	public void clicarTShirt() {
		clicarViaCss(".sf-menu > li:nth-child(3) > a:nth-child(1)");
	}

	public void selecionarCasual() {
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

	public void payByCheck() {
		clicarViaCss(".cheque > span:nth-child(1)");
	}

	public void confirmarPagamento() {
		clicarViaCss("button.button-medium > span:nth-child(1)");
	}

	public String retornaConfirmacaodeCheck() {
		return obterValorCampoCss(".page-subheading");
	}
}
