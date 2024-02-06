import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extends {
	ExtentReports	Report;
	@BeforeMethod
	public ExtentReports getExtends() {
		String File=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter re=new ExtentSparkReporter(File);
		re.config().setReportName("Automation Testing results");
		re.config().setDocumentTitle("test");
		
		Report=new ExtentReports();
		Report.attachReporter(re);
		Report.setSystemInfo("tester" ,"Vishwa");
	return Report;
	}
	
	@Test
	public void geturl() {
		Report.createTest("Dom");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://106.51.16.208:5050/yaragoemrjavaclient");
		Report.flush();
	}
}
