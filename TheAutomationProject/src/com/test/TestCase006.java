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
public class TestCase006 extends WishlistPage {
	
	@Test
	public void TestCase6 () {

		String flatRatePrice, grandTotal, orderConfirmed;

		openUrl();
		clickMyAccount();
		enterLoginEmailId();
		enterLoginPassword();
		clickLoginButton();
		clickMyWishlist();
		clickLGAddtoCart();
   		selectRegionState();
		enterZipCode();
		clickEstimate();
		flatRatePrice = verifyFlatPrice();
		Assert.assertEquals(getActualFlatRatePrice(), flatRatePrice);
		clickFlatPrice();
		clickUpdateTotal();
		grandTotal = verifyGrandTotal();
		Assert.assertEquals(getActualGrandTotal(), grandTotal);
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

