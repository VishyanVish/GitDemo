package source;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalogs extends Abstract {
	WebDriver driver;

	public ProductCatalogs(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".mb-3")
	List<WebElement> Products;
	By toastmassage = By.cssSelector("#toast-container");

	public List<WebElement> products() {

		return Products;
	}

	public WebElement getProductByname(String Pname) {

		WebElement ele = products().stream().filter(s -> s.findElement(By.tagName("b")).getText().equals(Pname))
				.findFirst().orElse(null);
		return ele;
	}
	

	public void addProductToCart(String Pname) {
		getProductByname(Pname).findElement(By.cssSelector(".card-body button:last-of-type")).click();
		visibilyofitem(toastmassage);
	}

	@FindBy(css = ".cart h3")
	List<WebElement> cartprod;

	@FindBy(css="tr td:nth-child(3)")
	List<WebElement> OrdersList;
	public Boolean varifyProductLists(String Pname) {

		return cartprod.stream().anyMatch(s -> s.getText().equalsIgnoreCase(Pname));
	}
	public Boolean varifyProductOrderLists(String Pname) {

		return OrdersList.stream().anyMatch(s -> s.getText().equalsIgnoreCase(Pname));
	}

}
