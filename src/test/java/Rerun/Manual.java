package Rerun;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Manual {
	@Test (retryAnalyzer=B.class)
	public void tc1() {
		System.out.println("Tc1");
		System.out.println("Tc1");
		//Assert.assertEquals(true, false);
		Assert.assertEquals("vinoth", "vinothK");
	}

	@Test
	public void tc2() {
		System.out.println("Tc2");
		System.out.println("Tc2");
		//Assert.assertEquals(true, false);
		Assert.assertEquals("vinoth", "vinoth");
	}
	
	@Test
	public void tc3() {
		System.out.println("Tc3");
		System.out.println("Tc3");
		//Assert.assertEquals(true, false);
		Assert.assertEquals("vinoth", "sakthi");
		
	}


}
