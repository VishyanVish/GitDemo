package array.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://106.51.16.208:5050/yaragoemrjavaclient/");

		driver.findElement(By.id("userName")).sendKeys("cons");
		// driver.findElement(By.id("userhospitalbranch")).sendKeys("2");
		driver.findElement(By.id("userhospitalbranch")).click();
		WebElement dropdown = driver.findElement(By.id("userhospitalbranch"));
		Select selectObject = new Select(dropdown);
		selectObject.selectByValue("3");
		driver.findElement(By.id("userPassword")).sendKeys("123");
		driver.findElement(By.id("btnLoginSubmit")).click();

		System.out.println("done");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String zoom = "document.body.style.zoom='75%'";
		js.executeScript(zoom);

	}

}
