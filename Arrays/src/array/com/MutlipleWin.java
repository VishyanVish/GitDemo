package array.com;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutlipleWin {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	driver.switchTo().newWindow(WindowType.TAB);
 Set<String> handles=driver.getWindowHandles();
 Iterator<String> it=handles.iterator();
 String parent= it.next();
 String Child=it.next();
 driver.switchTo().window(Child);
	driver.get("https://rahulshettyacademy.com/");
	driver.switchTo().window(parent);
File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(Source, new File("D://Screeenshot.png"));
 WebElement name= driver.findElement(By.xpath("//input[@name='name']"));
name.sendKeys("vishwa");
File file=name.getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(file, new File("D://abc.jpg"));
 
System.out.println( name.getRect().getHeight());
System.out.println( name.getRect().getDimension().getHeight());

}
}
