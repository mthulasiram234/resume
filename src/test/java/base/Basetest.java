package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	Logger log=

 public static WebDriver driver;
	@Test
	public WebDriver logintoApplication() throws IOException
	{
		//String path=System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties";	
		FileInputStream fis=new FileInputStream("H:\\config.properties");
		Properties prop=new Properties();
		prop.load(fis);
 if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
	 driver=new ChromeDriver();
	 WebDriverManager.chromedriver().setup();
	 System.out.println("chrome browser invoked");
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
			
		}
		else if(prop.getProperty("browser")=="edge")
		{
			driver=new EdgeDriver();
			WebDriverManager.edgedriver().setup();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get(prop.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		
		return driver;
		
	}
}
