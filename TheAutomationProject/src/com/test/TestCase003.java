/**
 * 
 */
package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.MobilePage;

/**
 * @author Divya
 * 
 */
public class TestCase003 extends MobilePage {
	@Test
	public void TestCase3() {

		String errorMessage, emptyCartMessage;

		openUrl();
		clickMobileMenu();
		clickXperiaAddToCart();
		editQuantity("1000");
		clickUpdateQuantity();
		errorMessage = errorMessage();
		Assert.assertEquals(getActualErrorMessage(), errorMessage);
		clickEmptyCart();
		emptyCartMessage = emptyCartMessage();
		Assert.assertEquals(getActualEmptyCartMessage(), emptyCartMessage);
	}

}
