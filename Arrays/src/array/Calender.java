package array;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		// driver.get("https://www.booking.com/index.en-gb.html?aid=2336990;label=en-in-booking-desktop-3FAAu_HpR7SrB1xA8qrIhwS652804038422:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-101028350:lp9061999:li:dec:dm;ws=&gad_source=1&gclid=EAIaIQobChMIvujUq5GTgwMVvA57Bx2JywZvEAAYASAAEgKBLfD_BwE");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='date-display-field-start']")));
//		driver.findElement(By.xpath("//button[@data-testid='date-display-field-start']")).click();
//String[] text=driver.findElement(By.xpath("//div[@class='d358556c65'][1]/h3")).getText().split(" ");
//List<WebElement> dates=	driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td"));
//for(int i=0;i<dates.size();i++) {
// String date=	dates.get(i).getText();
// System.out.println(date);
// if (date.equalsIgnoreCase("22")) {
//	 driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td")).get(i).click();
// }
//}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".demo-frame.lazyloaded")));
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame.lazyloaded")));

		driver.findElement(By.id("datepicker")).click();

		System.out.println(driver.findElement(By.className("ui-datepicker-month")).getText());
		while (!driver.findElement(By.className("ui-datepicker-month")).getText().contains("March")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}

		method(driver);
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='DropDown DatePicker']")));
		driver.findElement(By.xpath("//li[@id='DropDown DatePicker']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[2]/p/iframe")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//select[@data-handler='selectMonth']")).click();
	WebElement dropdown=driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Apr");
		method(driver);
		
	}

	public static void method(WebDriver driver) {
		List<WebElement> days = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for (int i = 0; i < days.size(); i++) {
			String date = days.get(i).getText();
			if (date.equalsIgnoreCase("22")) {
				days.get(i).click();
			}
		}
	}

}
