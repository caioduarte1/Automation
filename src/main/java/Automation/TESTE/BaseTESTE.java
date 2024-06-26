package Automation.TESTE;

import static Automation.CORE.DriverFactory.getdDriver;
import static Automation.CORE.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Automation.CORE.Propriedades;
import Automation.PAGE.BasePAGE;
import io.cucumber.java.After;

public class BaseTESTE extends BasePAGE{
	

	@After
	public void registraRelatorio() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/"+testname.getMethodName()+".html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest(testname.getMethodName());
		logger.log(Status.INFO, "Log");
		extent.flush();
	}
	
	@After
	public void finaliza() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getdDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File(
				"target" + File.separator + 
				"screenshot" + File.separator + testname.getMethodName()+ ".jpg"));
		if (Propriedades.FECHAR_BROWSER)
			killDriver();
	}
}