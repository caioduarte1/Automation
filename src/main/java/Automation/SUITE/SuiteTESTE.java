package Automation.SUITE;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Automation.TESTE.CompraComVariacaoDeProdutosTESTE;
import Automation.TESTE_Cadastro.CadastroNovoUsuarioTESTE;

@RunWith(Suite.class)
@SuiteClasses({
	CadastroNovoUsuarioTESTE.class,
	CompraComVariacaoDeProdutosTESTE.class
})
public class SuiteTESTE {

}
