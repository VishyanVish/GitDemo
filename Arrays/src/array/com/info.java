package array.com;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class info {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Edge.driver", "C:\\Users\\ADMIN\\Documents\\msedgedriver.exe");
		WebDriver Driver = new EdgeDriver();
		Driver.get("http://106.51.16.208/ygopticals");
		Driver.findElement(By.id("user-type")).click();
		WebElement dropdown = Driver.findElement(By.id("user-type"));
		Select select = new Select(dropdown);
		select.selectByValue("2");
		Driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("branchadmin");
		Driver.findElement(By.id("user-depots-branches")).click();
		WebElement dropdown2 = Driver.findElement(By.id("user-depots-branches"));
		Select select2 = new Select(dropdown2);
		select2.selectByValue("1");
		Driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("123");
		Driver.findElement(By.className("btn-flat")).click();
		// Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Thread.sleep(3000);
		// System.out.println(
		// Driver.findElement(By.className("toast-message")).getText());
		System.out.println(Driver.getTitle());
		Thread.sleep(5000);
		Driver.findElement(By.id("logged_in_user_name_global")).click();
		Driver.findElement(By.className("cls-sign-out")).click();

	}
}
