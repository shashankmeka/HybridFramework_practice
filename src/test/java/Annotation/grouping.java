package Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class grouping {

	@Test
	public void test() {
		System.out.println("test");
		
	}
	
	@Test(priority = 1)
	public void test1() {
		
		System.out.println("test 1");
		
	}
	
	@Test(priority = 2, groups = "login")
	public void test2() {
		System.out.println("test 2");
	}
	
	@Test(priority = 3,groups = "login")
	public void test3() {
		
		System.out.println("test 3");
	}
}
