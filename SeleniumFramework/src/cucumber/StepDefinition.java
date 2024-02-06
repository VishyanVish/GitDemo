package cucumber;



import io.cucumber.java.en.Given;
import source.Base;

public class StepDefinition extends Base {

	@Given("^Logged in with username (.+) and password(.+)$")
	public void logged_in_with_userNameandPass(String username,String password){
		page.loginApplication(username, password);
	}
}
