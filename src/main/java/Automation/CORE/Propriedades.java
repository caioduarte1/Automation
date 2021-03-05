package Automation.CORE;

public class Propriedades {

//	public static boolean FECHAR_BROWSER = false; // -> NÃO fechar o browser após a execuções
	public static boolean FECHAR_BROWSER = true; // -> FECHA o Browser após as execuções
	
//	public static Browsers browser = Browsers.CHORME;
	public static Browsers browser = Browsers.FIREFOX;  
	
	public enum Browsers {
		CHORME, FIREFOX
	}
}