package source;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends Base implements ITestListener{				
	   	
	ExtentReports report=	ExtendsReportsone.extendsReport();
	ExtentTest test;
	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult arg0) {
	    	String path = null;
	    	test.fail(arg0.getThrowable());
  	 try {
			driver	=(WebDriver)arg0.getTestClass().getRealClass().getField("driver").get(arg0.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    	
	    	try {
				 path=getScreenshot(arg0.getMethod().getMethodName(),driver);
				
				} catch (IOException e) {			
					e.printStackTrace();}
		    
				test.addScreenCaptureFromPath(path);
	        		
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	    			
	        	test=	report.createTest(arg0.getMethod().getMethodName());
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	        // TODO Auto-generated method stub		
	    
	    	test.log(Status.PASS, "Test passed");
	   
	    }
	    @Override		
	    public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	    	report.flush();		
	    }
}
