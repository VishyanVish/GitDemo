package array.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {

	@Test
	public void done() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("enter-name")).sendKeys(("vishwa"));
		driver.findElement(By.id("alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

		driver.navigate().to("http://manager:123@192.168.0.112:5050/");
		driver.findElement(By.xpath("//*[@id=\"actions\"]/div[2]/a")).click();
		driver.manage().deleteAllCookies();
	}

}
