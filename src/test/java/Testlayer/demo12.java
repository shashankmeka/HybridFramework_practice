package Testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo12 {
	
	@Test(retryAnalyzer= Utilslayer.RetryAnalyzer.class)
	public void test1() {
		
		Assert.assertEquals(false, true);
		
	}
	
	@Test
	public void test2() {
		
		Assert.assertEquals(true, true);
		
	}
	@Test
	public void test3() {
		
		Assert.assertEquals(false, true);
		
	}

	
}
