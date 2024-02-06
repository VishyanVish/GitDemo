package source;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.databind.ObjectMapper;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.jar.asm.TypeReference;

public class Base {
	WebDriver driver;
	public Landingpage page;

	public WebDriver IntializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "//GlobalProperty.properties");
		prop.load(file);
		String BrName = prop.getProperty("browser");
		if (BrName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
		
			driver = new ChromeDriver();

		} else if (BrName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (BrName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}

	@BeforeMethod
	public Landingpage lunchApplication() throws IOException {

		driver = IntializeDriver();
		page = new Landingpage(driver);
		page.goTo();
		return page;
	}
	public String getScreenshot(String TestCaseName, WebDriver driver) throws IOException {
		File sorce = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File(System.getProperty("user.dir")+"//reports//"+TestCaseName+".png");
		FileUtils.copyFile(sorce, Dest);
		return (System.getProperty("user.dir")+"//reports//"+TestCaseName+".png");
	}
	
//	public List<HashMap<String,String>> getJsonData(String Filepath) throws IOException {
//
//		String Jsnon = FileUtils.readFileToString(
//				new File(Filepath),StandardCharsets.UTF_8);
//// String to HashMap Jackson DataBind
//	ObjectMapper obj=new ObjectMapper();
//	List<HashMap<String,String>> data=obj.readValue(Jsnon, new TypeReference<List<HashMap<String,String>>>());
//	return data;
//	}
	
}
