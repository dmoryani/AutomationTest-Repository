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
public class TestCase002 extends MobilePage {
	@Test
public void TestCase2(){
		
		String priceOnListPage, priceOnDetailPage;
		
		openUrl();
		clickMobileMenu();
		priceOnListPage = getXperiaPrice();
		clickXperia();
		priceOnDetailPage = getXperiaPrice(); 
		Assert.assertEquals(priceOnListPage, priceOnDetailPage);
		
	}
}
