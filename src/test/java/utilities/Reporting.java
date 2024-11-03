package utilities;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.IReporter;
import org.testng.ITestContext;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.markuputils.Markup;


//Listeners
public class Reporting implements IReporter {

	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest Logger;
	

	public void startReport(ITestContext testContext) {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.MM.SS").format(new Date());
		String repName = "Test-Report-" + timeStamp + ".html";

		extent = new ExtentReports();

		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "//test-output//repName");
		extent.attachReporter(spark);
		extent.setSystemInfo("Host Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "Rajani");
		spark.config().setDocumentTitle("Inet Banking Test Project");
		// Name of the report
		spark.config().setReportName("Functional Automation Test Report ");
		// Dark Theme
		spark.config().setTheme(Theme.DARK);
	}

	public void onTestSuccess(ITestResult tr) {

		Logger = extent.createTest(tr.getName());
		Logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));

	}

	
	public void onTestFailure(ITestResult tr) throws IOException {
		
		Logger=extent.createTest(tr.getName());
		Logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		
		String screenshotpath=System.getProperty("user.dir")+"/Screenshots/"+tr.getName()+".png";
		
		File f = new File(screenshotpath);
		
		if(f.exists()) {
			
		 Logger.fail((Markup) Logger.addScreenCaptureFromPath(screenshotpath));
			
		}
		
	}

    public void onTestSkipped(ITestResult tr) {
    	
    	Logger=extent.createTest(tr.getName());
    	Logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
    	
    }
    
    
    public void onFinish(ITestContext testContext) {
    	
    	extent.flush();
    	
    }


}
