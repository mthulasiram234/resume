package utils;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreportConfiguration {
	static ExtentReports extent;
	
@Test
	public static ExtentReports reportconfiguration()
	{
		
	
	String path= System.getProperty("user.dir")+"\\testreport\\report.html";
	//ExtentSparkReporter is for setting configraton for reports, file location and report name
	ExtentSparkReporter reporter =new ExtentSparkReporter(path);
	reporter.config().setReportName("Automaton test results");
	
	 extent=new ExtentReports();// if we want to access extent objct out side the method we need to declare the variable as a class variable
	extent.attachReporter(reporter);
	return extent;
	
	}
@Test(priority=3)
public void testcase1()
{
extent.createTest("testcase1");// for generating report for any tst case we need to give extent.createTest("testcase name")
	System.out.println("This is testcase 1 executed");
	
}
@Test(priority=2)
public void testcase2()
{
extent.createTest("testcase2");
	System.out.println("This is testcase 2 executed");
	
}
// for closing the extent report session we use flush method
@Test(priority=4)
public void closetheExtentReport()
{
	extent.flush();
	System.out.println("This is closed the extent report session");
}

}
