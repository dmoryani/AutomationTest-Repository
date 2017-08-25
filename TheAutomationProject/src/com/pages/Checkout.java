/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Divya
 *
 */
public class Checkout extends ShoppingCart{
	
	public void enterBillingAddress() {
		try {
			driver.findElement(By.id(getBillingAddress_id())).sendKeys("ABCD");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void enterBillingCity() {
		try {
			driver.findElement(By.id(getBillingCity_id())).sendKeys("New York");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void selectBillingState() {
		try {
			driver.findElement(By.id(getBillingStateRegion_Id())).click();
			Select state = new Select(driver.findElement(By.id(getBillingStateRegion_Id())));

			// Select value using value attribute.

			state.selectByValue("43");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	public void enterBillingZip() {
		try {
			driver.findElement(By.id(getBillingZip_id())).sendKeys("542896");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void enterBillingtelephone() {
		try {
			driver.findElement(By.id(getBillingTelephone_id())).sendKeys("123456");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickBillingContinue() {
		try {
			driver.findElement(By.xpath(getBillingContinue_Button())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickShippingContinue() {
		try {
			driver.findElement(By.xpath(getShippingContinue_Button())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickPaymentContinue() {
		try {
			driver.findElement(By.xpath(getPaymentContinue_Button())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickMoneyOrder() {
		try {
			driver.findElement(By.id(getCheckout_CheckMoneyOrder_id())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void clickPlaceOrder() {
		try {
			driver.findElement(By.xpath(getPlaceOrder_button())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String verifyOrderConfMessage() {
		try {
			return driver.findElement(By.xpath(getOrderPlaced_Message())).getText();

		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}
	public String getOrderNum() {
		try {
			return driver.findElement(By.xpath(getOrder_No())).getText();

		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}
	
	
}
