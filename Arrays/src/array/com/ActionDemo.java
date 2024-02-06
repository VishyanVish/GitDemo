package array.com;

import java.awt.Window;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDemo {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//		driver.get("https://www.amazon.in");
	//Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
//
//	act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Vish")
//				.doubleClick().contextClick().
//				build().perform();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.className("blinkingText")).click();
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		String parent = it.next();
		String Child = it.next();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong/a")));

		driver.switchTo().window(Child);
		String email = driver.findElement(By.xpath("//strong/a")).getText();
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys((email));
		
		FileInputStream file=new FileInputStream("C:\\Users\\ADMIN\\Documents\\1.1HF02.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		int sheet=workbook.getNumberOfSheets();
		for (int i=0;i<sheet;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("1.1HF02")){
			XSSFSheet sheetname	=workbook.getSheetAt(i);
			System.out.println(sheetname.getSheetName());
		Iterator<Row> rows=sheetname.iterator();
		 Row firstRow=rows.next();
	Iterator<Cell> ce= firstRow.cellIterator();
	ce.next();
			}
		}
	}
}
