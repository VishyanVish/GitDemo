package yarago.testng.com;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listerners implements ITestListener{
public void OnTestSuccess(ITestResult result) {
		System.out.println("succes");
	}

}
