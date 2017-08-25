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
public class TestCase005 extends WishlistPage{
	
	@Test
	public void TestCase5 () {

		String RegisterationMessage, SharedWishlistMessage;

		openUrl();
		clickMyAccount();
		clickCreateAccount();
		enterFirstName();
		enterLastName();
		enterEmailId();
		enterPassword();
		enterConfirmPassword();
		clickRegisterButton();
		RegisterationMessage = getRegisterMessage();
		Assert.assertEquals(getActual_Reg_msg(), RegisterationMessage);
		clickTvMenu();
		clickLGAddToWishlist();
		clickShareWishlist();
		enterEmailId();
		enterMessage();
		clickShareWishlist();
		SharedWishlistMessage = getWishlistMessage();
		Assert.assertEquals(getActual_Wishlist_msg(), SharedWishlistMessage);
	}

}
