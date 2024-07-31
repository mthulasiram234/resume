package Modules;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.Basetest;

public class timesheetpagefactory {
	WebDriver driver;

	@FindBy(xpath="//button[@title='My Timesheet']" )
	
	//private WebElement clickonTimesheetbutton;

	private WebElement clickonTimesheetutton;
	timesheetpagefactory() throws IOException
	{
		Basetest bt=new Basetest();
		driver=bt.logintoApplication();
		PageFactory.initElements(driver, this);
	}
	@Test
	
	public void getclickonButtorn()
	{
		clickonTimesheetutton.click();
	}
	
	
}
