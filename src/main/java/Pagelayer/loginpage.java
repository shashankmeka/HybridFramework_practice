package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.baseclass;

public class loginpage extends baseclass{
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginbutton;
	
	//initialize POM with page factory
	public loginpage() {
		PageFactory.initElements(driver, this);
	}

	public void getusername(String uname) {
		
		username.sendKeys(uname);
	}
	public void getpassword(String unam2e) {
		
		password.sendKeys(unam2e);
	}
	public void button() {
		
		loginbutton.click();
	}
	
	public void validatepageTitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	
	
	
	
	
	
	
	
	
}
