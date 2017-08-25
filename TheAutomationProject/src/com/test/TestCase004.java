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
public class TestCase004 extends MobilePage {
	
	@Test
	public void TestCase4 () {

		String CompareWindowTitle;

		openUrl();
		clickMobileMenu();
		clickXperiaAddToCompare();
		clickIphoneAddToCompare();
		clickCompareButton();
		switchWindow();
		CompareWindowTitle = getCompareWindowTitle();
		Assert.assertEquals(getCompareActualTitle(), CompareWindowTitle);
		if (verifyXperia() && verifyIphone()) {
			closeBrowser();
			switchWindow();
		}
		
	}


}
