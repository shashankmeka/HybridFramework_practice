package Annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameterization {
	
	@Test
	@Parameters({"url","username","password"})	//parameter create and pass the keys
	public void login(String url, String username, String password) {
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\javaprogram\\driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(url);
	
	driver.findElement(By.name("txtUsername")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	

}
}