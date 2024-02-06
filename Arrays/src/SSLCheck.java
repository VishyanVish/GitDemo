import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;
import org.apache.commons.io.FileUtils;

public class SSLCheck {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ADMIN\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
		options.addArguments("headless");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.0.111:5050/yaragoemrjavaclient/Login.jsp0 ");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://Screenshot1.png"));
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/#");
		WebElement foter = driver.findElement(By.id("gf-BIG"));
		List<WebElement> tags = foter.findElements(By.tagName("a"));
		SoftAssert a=new SoftAssert();
		for (int i = 0; i < tags.size(); i++) {
			String url = tags.get(i).getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respons = conn.getResponseCode();
			System.out.println(tags.get(i).getText());
			System.out.println(respons);
			driver.manage().deleteAllCookies();
			a.assertTrue(respons<400, tags.get(i).getText());
		}
		a.assertAll();
	}

}
