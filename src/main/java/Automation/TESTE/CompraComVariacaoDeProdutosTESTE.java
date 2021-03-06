package Automation.TESTE;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import Automation.PAGE.CompraComVariacaoDeProdutosPAGE;

@RunWith(Parameterized.class)
public class CompraComVariacaoDeProdutosTESTE extends BaseTESTE {

	CompraComVariacaoDeProdutosPAGE ccvp = new CompraComVariacaoDeProdutosPAGE();

	@Parameter
	public String produto;
	@Parameter(value = 1)
	public String pagamento;

	@Parameters
	public static Collection<Object[]> getCollection(){
		return Arrays.asList(new Object[][]{
			{"Dresses","Transferencia"},
			{"T-Shirts","Check"},
			{"T-Shirts","Transferencia"},
			{"Dresses","Check"},
		});
	}
	
	@Test
	public void produtosVariaveis() throws InterruptedException {
		
		ccvp.esperaImplicita();
		ccvp.inserirNaBusca(produto);
		ccvp.clicarBusca();	
		ccvp.esperaImplicita();
		if(produto.equals("Dresses")) {
			ccvp.selecionarVestido();
		}
		if(produto.equals("T-Shirts")) {
			ccvp.selecionarCamisa();
		}
		ccvp.esperaImplicita();
		ccvp.addToCard();
		ccvp.esperaImplicita();
		ccvp.addItemNocheckout();
		ccvp.esperaImplicita();
		ccvp.procedToCheckout();
		ccvp.procedToCheckoutEndereco();
		ccvp.acertoDeServico();
		ccvp.shippingProceedToCheckou();
		ccvp.esperaImplicita();
		if(pagamento.equals("Transferencia")) {
			ccvp.bankWirePayment();
		}
		if(pagamento.equals("Check")) {
			ccvp.payByCheck();
		}
		ccvp.esperaImplicita();
		ccvp.clicarConfirmacaoTransferencia();
	}
}
