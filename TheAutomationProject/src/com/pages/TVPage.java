/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;

/**
 * @author DELL
 *
 */
public class TVPage extends Checkout{
	
	public void clickTvMenu(){
		try {
		
			driver.findElement(By.xpath(getTV_menu())).click();
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickLGAddToWishlist(){
		try {
		
			driver.findElement(By.xpath(getLG_LCD_AddtoWishlist())).click();
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickShareWishlist(){
		try {
		
			driver.findElement(By.xpath(getShare_Wishlist())).click();
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
