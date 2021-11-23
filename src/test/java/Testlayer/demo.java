package Testlayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demo {
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\javaprogram\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	
	@Test
	public void m1()	{
		
		Properties p=new Properties();
		
		try {
			
			FileInputStream f = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\HybridFramework_practice\\src\\main\\java\\Configlayer\\Config.properties");
			p.load(f);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.get(p.getProperty("url"));
		
		driver.findElement(By.name("email")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
	}
	
	
	@AfterClass
	public void shutdown() {
		driver.close();
	}
	
	
}
