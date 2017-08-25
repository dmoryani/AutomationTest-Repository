/**
 * 
 */
package com.test;

import org.testng.annotations.Test;

import com.pages.WishlistPage;

/**
 * @author Divya
 *
 */
public class TestCase007 extends WishlistPage {
	
	
	@Test
	public void TestCase7() {

		String StatusMessage;

		openUrl();
		clickMyAccount();
		enterLoginEmailId();
		enterLoginPassword();
		clickLoginButton();
		clickMyOrder();
		clickViewOrder();
		StatusMessage = verifyOrderStatus();
		System.out.println(StatusMessage);
		clickPrintOrder();
		handlePrintDialog();
	
	}
}
