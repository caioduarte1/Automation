package Automation.CORE;



public class Propriedades {

//	public String navegador;
	
	public static boolean FECHAR_BROWSER = false; // -> NÃO fechar o browser após a execuções
//	public static boolean FECHAR_BROWSER = true; // -> FECHAR o Browser após as execuções
	
	public static Browsers browser = Browsers.CHORME;   // -> Definir o navegador a ser utilizado
//	public static Browsers browser = Browsers.HEADLESS; // -> Definir o navegador a ser utilizado
//	public static Browsers browser = Browsers.FIREFOX;  // -> Definir o navegador a ser utilizado

 	public enum Browsers {
		CHORME, FIREFOX, HEADLESS
	}
 	
 
	
}