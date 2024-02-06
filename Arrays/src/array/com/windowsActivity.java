package array.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsActivity {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://106.51.16.208:5050/yaragoemrjavaclient");
	driver.manage().window().maximize();
	driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
//	JavascriptExecutor js =(JavascriptExecutor)driver;
//	String zoom="document.body.style.zoom='75%'";
//	js.executeScript(zoom);
	
	
	
	
}
}
