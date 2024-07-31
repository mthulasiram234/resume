package Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Basetest;

public class timesheet {
	WebDriver driver;
	
	timesheet() throws IOException
	{
		Basetest bt=new Basetest();
		 driver=bt.logintoApplication();
	}

	@Test
	public void clickontimesheet()
	{
		driver.findElement(By.xpath("//button[@title='My Timesheet']")).click();
	}
}
