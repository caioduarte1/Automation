package Automation.CORE;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {

	}

	public static WebDriver getdDriver() {
		if (driver == null) {

			switch (Propriedades.browser) {
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			case CHORME:
				driver = new ChromeDriver();
				break;
			case HEADLESS:
				driver = new HtmlUnitDriver();
				break;
			}
			
			driver.manage().window().maximize();
		}return driver;

	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
