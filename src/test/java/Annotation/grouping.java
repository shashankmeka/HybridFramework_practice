package Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class grouping {

	@Test
	public void test() {
		System.out.println("nothing");
		
	}
	
	@Test(priority = 1, groups = "homepage")
	public void test1() {
		
		System.out.println("homepage");
		
	}
	@Test(priority = 1)
	public void test6() {
		
		System.out.println("nothing");
		
	}
	@Test(priority = 1, groups = "homepage")
	public void test5() {
		
		System.out.println("homepage");
		
	}
	
	@Test(priority = 2, groups = "login")
	public void test2() {
		System.out.println("login");
	}
	
	@Test(priority = 3,groups = {"login", "homepage"})
	public void test3() {
		
		System.out.println("both");
	}
}
