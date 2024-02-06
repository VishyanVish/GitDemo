package array.com;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
		String[] names = { "Brocolli", "Beans", "Cucumber" };
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
//		org.openqa.selenium.support.ui.Wait<WebDriver> time = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(5000)).pollingEvery(Duration.ofSeconds(2000))
//				.ignoring(NoSuchElementException.class);
//	WebElement aa=	time.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.cssSelector("span.promoInfo"));
//			}
//			
//		});
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		driver.manage().window().maximize();

		addItems(driver, names);

		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Enter promo code']")));
		driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahuglshettyacademy");
		driver.findElement(By.className("promoBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

	}

	public static void addItems(WebDriver driver, String[] names) {
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < items.size(); i++) {
			String[] name = items.get(i).getText().split("-");
			String Formated = name[0].trim();
			List<String> al = Arrays.asList(names);

			if (al.contains(Formated)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			}

		}
	}
}