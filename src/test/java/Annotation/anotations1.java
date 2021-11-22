package Annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class anotations1 {
	
	WebDriver driver;
	@Test
	public void test() {
		System.out.println("test");
		
	}
	
	@Test(priority = 1)
	public void test1() {
		
		System.out.println("test 1");
		Assert.assertEquals(false, true);
		
	}
	
	@Test(priority = 2, dependsOnMethods = "test1")	// it depends on test1 method.
	public void test2() {
		
		System.out.println("test 2");
	}
	
	@Test(priority = 3)
	public void test3() {
		
		System.out.println("test 3");
	}
	
	
//	@BeforeClass
//	public void setup() {
//		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\javaprogram\\driver\\geckodriver.exe");
//		driver=new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//	
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
//	
//	@Test(dependsOnMethods = "freecrmlogin")
//	public void afterlogin() throws InterruptedException {
//		
//		WebElement wb=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/span[1]"));
//		Thread.sleep(2000);
//		System.out.println(wb.getText());
//		
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/button/i")).click();
//	}
//	
//	@AfterMethod
//	public void close() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		driver.close();
//	}
	


}
