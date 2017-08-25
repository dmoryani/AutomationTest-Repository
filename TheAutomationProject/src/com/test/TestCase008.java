/**
 * 
 */
package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.WishlistPage;

/**
 * @author Divya
 *
 */
public class TestCase008 extends WishlistPage{

	@Test
	public void TestCase8 () {

		String ReorderGrandTotal,orderConfirmed;

		openUrl();
		clickMyAccount();
		enterLoginEmailId();
		enterLoginPassword();
		clickLoginButton();
		clickReOrder();
		editQuantity("10");
		clickUpdateQuantity();
		ReorderGrandTotal = getReOrderGrandTotal();
		Assert.assertEquals(getActualReOrderGrandTotal(), ReorderGrandTotal);
		clickProceedToCheckout();
		enterBillingAddress();
		enterBillingCity();
		selectBillingState();
		enterBillingZip();
		enterBillingtelephone();
		clickBillingContinue();
		clickShippingContinue();
		clickMoneyOrder();
		clickPaymentContinue();
		clickPlaceOrder();
		orderConfirmed = verifyOrderConfMessage();
		Assert.assertEquals(getActualOrdermessage(), orderConfirmed);
		System.out.println(getOrderNum());
	
	}
	
}
