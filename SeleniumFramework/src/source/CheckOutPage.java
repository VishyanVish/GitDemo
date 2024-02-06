package source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Abstract {

	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".totalRow button")
	WebElement CheckOutButton;
	@FindBy(xpath = "//input[@placeholder='Select Country']")
	WebElement dropdown;
	@FindBy(xpath = "//body//app-root//button[2]")
	WebElement SelectDrop;
	@FindBy(xpath = "//a[@class='btnn action__submit ng-star-inserted']")
	WebElement submit;

	public void goToCheckout(String country) {
		CheckOutButton.click();
		Actions a = new Actions(driver);
		a.sendKeys(dropdown, country).build().perform();
		SelectDrop.click();
		submit.click();
	}

}
