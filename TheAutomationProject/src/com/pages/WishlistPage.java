/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;

/**
 * @author Divya
 *
 */
public class WishlistPage extends TVPage{
	
	public void enterMessage(){
		try {
		
			driver.findElement(By.id(getMessage_ID())).sendKeys("Shared Wishlist");
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public String getWishlistMessage(){
		try {
			
		return  driver.findElement(By.xpath(getWishlist_Message_xpath())).getText();
			
		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}
	public void clickMyWishlist(){
		try {
		
			driver.findElement(By.xpath(getMyWishlist())).click();
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickLGAddtoCart(){
		try {
		
			driver.findElement(By.xpath(getLGAddtoCart())).click();
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
