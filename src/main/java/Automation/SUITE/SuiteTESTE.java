package Automation.SUITE;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Automation.CORE.DriverFactory;
import Automation.TESTE.ConsultarSaldoTESTE;
import Automation.TESTE.LoginTESTE;
import Automation.TESTE.TraferirValorTESTE;

@RunWith(Suite.class)
@SuiteClasses({
	
	LoginTESTE.class,
	TraferirValorTESTE.class,
	ConsultarSaldoTESTE.class
	
})
public class SuiteTESTE {

	@AfterClass
	public static void finalizaTudo() {
		DriverFactory.killDriver();
	}
}
