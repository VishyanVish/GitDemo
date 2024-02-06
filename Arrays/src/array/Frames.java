package array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	driver.switchTo().frame(0);
	 WebElement source= driver.findElement(By.id("draggable"));
	 WebElement dest= driver.findElement(By.id("droppable"));
	 
	Actions a=new Actions(driver);
	a.dragAndDrop(source, dest).build().perform();
	driver.switchTo().defaultContent();
}
}
