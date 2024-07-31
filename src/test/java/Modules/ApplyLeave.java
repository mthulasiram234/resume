package Modules;

import java.io.IOException;
import java.util.logging.LogManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Basetest;
import pageobjects.applyleaveLocators;



public class ApplyLeave {
	Logger log= LogManager.getLogger(Applyleave.class);
	 public WebDriver driver;
	applyleaveLocators apl;
	ApplyLeave() throws IOException
	{
		Basetest bt=new Basetest();
		  driver=bt.logintoApplication();
		  applyleaveLocators apl=new applyleaveLocators();
	}
	@Test
	public void clickonapplyLeave()
	{
		//driver.findElement(By.xpath("//button[@title='Apply Leave']")).click();
		driver.findElement(apl.getclickonApplyleave()).click();
	}
}


