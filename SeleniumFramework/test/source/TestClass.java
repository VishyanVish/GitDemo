package source;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass extends Base {

	@Test(dataProvider = "getData")
	public void submitOrder(HashMap<String, String> input) throws IOException {
		String item = "ZARA COAT 3";
		String country = "india";

		page.loginApplication(input.get("email"), input.get("pass"));
		ProductCatalogs prod = new ProductCatalogs(driver);
		prod.addProductToCart(input.get(item));

		prod.goToCartPage();
		Boolean match = prod.varifyProductLists(input.get(item));
		Assert.assertTrue(match);

		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.goToCheckout(country);
		driver.close();
	}

	@Test
	public void ValidateOrdersList() {
		String item = "ZARA COAT 3";

		page.loginApplication("12344@gmail.com", "Vishwa123");
		ProductCatalogs prod = new ProductCatalogs(driver);
		prod.goOrderPage();
		Boolean match = prod.varifyProductOrderLists(item);
		Assert.assertTrue(match);

	}

//	@Test(dependsOnMethods = { "submitOrder" })
	@Test
	public void error() {
		page.loginApplication("12344@gmail.com", "vishwa123");
		String errName = page.geterrorText();
		Assert.assertEquals(errName, "Incorrect email or password.");

	}

	

	@DataProvider
	public Object getData() {
	 return new Object[][] { {"12344@gmail.com","Vishwa123","ZARA COAT 3"}, {} };
////		HashMap<String, String> input = new HashMap<String, String>();
////		input.put("email", "12344@gmail.com");
////		input.put("pass", "Vishwa123");"user.dir") + "\\src\\DataPackage\\orders.json")
////		input.put("Item", "ZARA COAT 3");
//		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir" )+ "\\src\\DataPackage\\orders.json");
//		return new Object[][] { { data.get(0) }, { data.get(1) } };
	}
}