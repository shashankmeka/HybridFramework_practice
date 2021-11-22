package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demo1 {
	
	@Test //2
	public void test() {
		System.out.println("test ");
	}
	
	@Test// 5
	public void test1() {
		System.out.println("test 1 ");
	}
	
	@Test // 7
	public void test2() {
		System.out.println("test 2 ");
	}
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	
	
	
	
	
	
	
	
//	@BeforeMethod //1 4 7
//	public void beforemethod() {
//		System.out.println("Before method");
//	}
//	
//	@AfterMethod //3 6 8
//	public void aftermethod() {
//		System.out.println("after method");
//	}
	
}
