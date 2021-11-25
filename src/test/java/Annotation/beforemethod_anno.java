package Annotation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class beforemethod_anno{
	WebDriver driver;
	
	@BeforeMethod
	public void m1() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\javaprogram\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
}
	
//	@Test
//	public void  freecrmlogin() throws InterruptedException {
//		driver.get("https://ui.cogmento.com/");
//		driver.findElement(By.name("email")).sendKeys("shashankmeka023@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Shashank@123");
//		
//		driver.findElement(By.cssSelector(".fluid")).click();
//		
//		Thread.sleep(3000);
//		
//	}
	
	@Test(priority = 1)
	public void orangeHRM() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//Hard assert
		Assert.assertEquals(title, "OrangeHRM");
		
		Thread.sleep(4000);
		System.out.println("+++++++++++++++");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	
	
	
	
}
