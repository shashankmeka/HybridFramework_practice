package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class anotations {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
	}
	
	@Test
	public void test() {
		System.out.println("test ");
	}
	
	@Test
	public void test1() {
		System.out.println("test 1 ");
	}
	
	@AfterClass
	public void Afterclass() {
		System.out.println("After class");
	}
	
	@AfterMethod
	public void Aftermethod() {
		System.out.println("After method");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("After test");
	}
	

}
