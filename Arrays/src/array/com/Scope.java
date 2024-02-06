package array.com;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement columnfooter = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnfooter.findElements(By.tagName("a")).size());
		List<WebElement> eachLink = columnfooter.findElements(By.tagName("a"));

		for (int i = 1; i < eachLink.size(); i++) {
			String clickon = Keys.chord(Keys.CONTROL, Keys.ENTER);
			eachLink.get(i).sendKeys(clickon);
			Thread.sleep(5000);

		}
		Set<String> window = driver.getWindowHandles();
		Iterator<String> iterator = window.iterator();

		while (iterator.hasNext()) {

			driver.switchTo().window(iterator.next());
			System.out.println(driver.getTitle());

		}

	}
}
