package array.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		driver.manage().window().maximize();
		WebElement Staticdrop=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select select =new Select(Staticdrop);
		select.selectByIndex(2);
		System.out.println(select.getFirstSelectedOption().getText());
		
		driver.findElement(By.className("paxinfo")).click();
		Thread.sleep(1000);
		
			int i = 1;
		while( i<4) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
	
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
	List<WebElement> option	=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	for( WebElement Option:option) {
		if(Option.getText().equalsIgnoreCase("India"))
				{
			Option.click();
			break;
				}
	}
	driver.navigate().back();
}
}