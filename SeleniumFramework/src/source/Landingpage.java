package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage extends Abstract {
	WebDriver driver;

	public Landingpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement userEmail = driver.findElement(By.id("userEmail"));

	@FindBy(id = "userEmail")
	WebElement email;
	@FindBy(id = "userPassword")
	WebElement password;
	@FindBy(id = "login")
	WebElement submit;
	@FindBy(xpath="//div[@aria-label='Incorrect email or password.']")
	WebElement errorMassage;

	public void loginApplication(String userName, String Password) {
		email.sendKeys(userName);
		password.sendKeys(Password);
		submit.click();
	}

	public String geterrorText() {
		visibilyofWeblelment(errorMassage);
		return errorMassage.getText();
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
}
