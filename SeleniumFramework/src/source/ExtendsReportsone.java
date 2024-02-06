package source;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReportsone {

	public  static ExtentReports extendsReport() {
		

		String File=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter re=new ExtentSparkReporter(File);
		re.config().setReportName("Automation Testing results");
		re.config().setDocumentTitle("test");
	ExtentReports	Report=new ExtentReports();
		Report.attachReporter(re);
		Report.setSystemInfo("tester" ,"Vishwa");
		return Report;
	}
}
