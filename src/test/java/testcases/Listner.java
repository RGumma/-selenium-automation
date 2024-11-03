package testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {
	
	public void onStart(ITestResult result) {
		
		System.out.println("Test execution is started");
	}
	

	public void onTestStart(ITestResult result) {

   System.out.println("On Test start");
	  
	}

	 
	 public void onTestSuccess(ITestResult result) {
   
		 System.out.println("On test success");
 
	  }

	  
	  public  void onTestFailure(ITestResult result) {

        System.out.println("on Test failure");
	  }

	  public void onTestSkipped(ITestResult result) {

		  System.out.println("on test skipped");

	  }

	  public void onFinish(ITestContext context) {

		  
		  System.out.println("on Finsih");

		  }
       






}
