package array.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.navigate().refresh();

}
}