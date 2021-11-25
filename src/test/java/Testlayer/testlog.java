package Testlayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Baselayer.baseclass;
import Pagelayer.loginpage;

public class testlog extends baseclass{
	loginpage log;
	
	@BeforeClass
	public void m1() {
		setup();
		
	}
	
	@Test
	public void loginfunction() {
		log=new loginpage();
		
		log.getusername(prop.getProperty("username"));
		
//		log.getpassword(prop.getProperty("password"));
		log.getpassword("Shashank@123");
		
		log.button();
		log.validatepageTitle();
		
		
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		
		Thread.sleep(6000);
		driver.close();
		
	}
	
	
}
