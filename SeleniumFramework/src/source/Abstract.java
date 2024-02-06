package source;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {
	WebDriver driver;

	public Abstract(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@class='btn btn-custom'])[3]")
	WebElement cartbutton;
	@FindBy(css=".btn.btn-custom[routerlink='/dashboard/myorders']")
	WebElement ordersList;

	public void visibilyofitem(By FindBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(FindBy));

	}
	public void visibilyofWeblelment(WebElement FindBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(FindBy));

	}

	public void goToCartPage() {

		cartbutton.click();

	}
	public void goOrderPage() {

		ordersList.click();
	}

}
