package Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demo2 {
	

	@Test
	public void testa() {
		System.out.println("Test A started");
		
		Assert.assertEquals(false, false);
		
		System.out.println("===============");
	}
	
	
//	@Test
//	public void testb() {
//		System.out.println("Test B started");
//		SoftAssert soft=new SoftAssert();
//		soft.assertEquals("Google", "facebook");
//		soft.assertAll();
//		System.out.println("Test Case B Ended");
//		System.out.println("===============");
//	}
	
	
	@Test
	public void testc() {
		System.out.println("Test C started");
		Assert.assertEquals("Yahoo", "Yahoo");
		System.out.println("Test Case C Ended");
		System.out.println("===============");
	}

}
