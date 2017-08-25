/**
 * 
 */
package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.MobilePage;

/**
 * @author DELL
 *
 */
public class TestCase009 extends MobilePage{
	@Test
	public void TestCase9 () {

		String DiscountAmt;

		openUrl();
		clickMobileMenu();
		clickIphoneAddToCart();
		enterDiscountCode();
		clickApply();
		DiscountAmt= getDiscountAmout();
		Assert.assertEquals(getActualDiscount(), DiscountAmt);
		
	
	}
	
	
	

}
