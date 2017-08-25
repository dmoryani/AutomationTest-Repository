/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;

/**
 * @author Divya
 *
 */
public class MobilePage extends ShoppingCart {
	
	public void clickMobileMenu(){
		try {
			driver.findElement(By.xpath(getMobileMenu())).click();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public String getXperiaPrice(){
		try {
			
		return  driver.findElement(By.xpath(getPrice())).getText();
			
		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}
	public void clickXperia(){
		try {
			driver.findElement(By.xpath(getModel())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickXperiaAddToCart(){
		try {
			driver.findElement(By.xpath(getAddToCart())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickXperiaAddToCompare(){
		try {
			driver.findElement(By.xpath(getXperiaAddToCompare())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickIphoneAddToCompare(){
		try {
			driver.findElement(By.xpath(getIphoneAddToCompare())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickCompareButton(){
		try {
			driver.findElement(By.xpath(getCompareButton())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void switchWindow(){
		try {
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String getCompareWindowTitle(){
		try {
			
		return  driver.findElement(By.xpath(getComparePopupTitle())).getText();
			
		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}
	public boolean verifyXperia(){
		try {
			
		return  driver.findElement(By.linkText(getXperiaLinkText())).isDisplayed();
		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}
		
	}
	public boolean verifyIphone(){
		try {
			
		return  driver.findElement(By.linkText(getIphoneLinkText())).isDisplayed();
			
		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}
		
	}
	public void clickIphoneAddToCart(){
		try {
			driver.findElement(By.xpath(getIphone_AddToCart_button())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
