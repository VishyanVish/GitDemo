package yarago.testng.com;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngOne {

	@Parameters({"url"})
	@Test
	public void URL(String URL) {
		System.out.println("vishwa");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
	}
	
	@AfterTest
	public void one() {
		System.out.println("Hii");
	}
	
	@Test(enabled =true)
	public void two() {
		System.out.println("Hello");
	}
	
	@Test(dependsOnMethods={"two"})
	public void three() {
		System.out.println("HH");
	}
	@DataProvider
	public void getData() {
		Object [] [] data=new Object[3][2];
		data[0][0]="Username";
		data[0][1]="password";
		
		data[1][1]="Usernametwo";
		data[1][2]="passwordtwo";
		
	}
}


