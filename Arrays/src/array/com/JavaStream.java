package array.com;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.locators.RelativeLocator.*;
public class JavaStream {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> items = elements.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(items);
		List<String> Sorted = items.stream().sorted().collect(Collectors.toList());
		Assert.assertEquals(items, Sorted);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		List<String> price = elements.stream().filter(s -> s.getText().contains("Beans")).map(s->getprice(s))
//				.collect(Collectors.toList());
//		price.forEach(a->System.out.println(a));

		List<String> prices = null;
		for (int i = 0; i < elements.size(); i++) {
			String name = elements.get(i).getText();

			if (name.equalsIgnoreCase("Apple")) {

				String Price = elements.get(i).findElement(By.xpath("following-sibling::td[1]")).getText();
				prices = Arrays.asList(Price);

				System.out.println(prices);
			}

		}
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> elements2 = driver.findElements(By.xpath("//tr/td[1]"));
		elements2.stream().map(a->a.getText()).forEach(a->System.out.println(a));

		List<WebElement> vegies = elements2.stream().filter(veg -> veg.getText().contains("Rice"))
				.collect(Collectors.toList());
		
		Assert.assertEquals(elements2.size(), vegies.size());
	
	}
}

//	private static String getprice( WebElement s) {
//	String Price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
//		return Price;
//	}
