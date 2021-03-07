package Automation.PAGE;

public class CompraComVariacaoDeProdutosPAGE extends BasePAGE{


	public void inserirNaBusca(String busca) {
		escreverViaCss("#search_query_top", busca);
	}

	public void clicarBusca() {
		clicarViaCss("#searchbox > button");
	}
		
	public void selecionarVestido() {
		clicarViaCss(
				"#best-sellers_block_right > div > ul > li:nth-child(1) > a > img");
	}

	public void selecionarCamisa() {
		clicarViaCss(
				"#best-sellers_block_right > div > ul > li:nth-child(2) > div > h5 > a");
	}
	public void addToCard() {
		clicarViaCss("#add_to_cart > button > span");
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
	
	public void payByCheck() {
		clicarViaCss(".cheque > span:nth-child(1)");
	}

	public void clicarConfirmacaoTransferencia() {
		clicarViaCss("button.button-medium > span:nth-child(1)");
	}
	
}
