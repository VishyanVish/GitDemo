package array.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JsExicute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,500)");
//		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500");
//		List<WebElement> value = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
//		int j = 0;
//		for (int i = 0; i < value.size(); i++) {
//			int n = Integer.parseInt(value.get(i).getText());
//
//			j = n + j;
//
//		}
//		System.out.println(j);
//	String amount=	 driver.findElement(By.className("totalAmount")).getText();
//int total=	Integer.parseInt( amount.split(":")[1].trim());
//Assert.assertEquals(j, total);

		List<WebElement> amounts = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int sum = 0;
		for (int i = 0; i < amounts.size(); i++) {
			int n = Integer.parseInt(amounts.get(i).getText());
			System.out.println(n);
			sum = sum + n;
		}
		System.out.println(sum);

	}
}
