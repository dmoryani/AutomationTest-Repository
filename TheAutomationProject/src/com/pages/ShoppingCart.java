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
public class ShoppingCart extends MyOrder {

	public void editQuantity(String qty) {
		try {
			
			driver.findElement(By.xpath(getQuantity())).sendKeys(qty);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void clickUpdateQuantity() {
		try {
			driver.findElement(By.xpath(getUpdateButton())).click();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public String errorMessage() {
		try {
			return driver.findElement(By.xpath(getErrorMessage())).getText();

		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}

	public void clickEmptyCart() {
		try {
			driver.findElement(By.id(getEmptyCartLink())).click();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public String emptyCartMessage() {
		try {
			return driver.findElement(By.xpath(getEmptyCartMessage()))
					.getText();

		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}

	public void selectRegionState() {
		try {
			driver.findElement(By.id(getStateRegion_Id())).click();
			Select state = new Select(driver.findElement(By.id(getStateRegion_Id())));

			// Select value using value attribute.

			state.selectByValue("43");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void enterZipCode() {
		try {
			driver.findElement(By.id(getZip_Id())).sendKeys("542896");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void clickEstimate() {
		try {
			driver.findElement(By.xpath(getEstimate_Button())).click();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String verifyFlatPrice() {
		try {
			return driver.findElement(By.xpath(getFlatRatePrice_xpath())).getText();

		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}
	public void clickFlatPrice() {
		try {
			driver.findElement(By.id(getFlatRate_Id())).click();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickUpdateTotal() {
		try {
			driver.findElement(By.xpath(getUpdateTotal_Button())).click();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String verifyGrandTotal() {
		try {
			return driver.findElement(By.xpath(getGrandTotal_Label())).getText();

		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}
	public void clickProceedToCheckout() {
		try {
			driver.findElement(By.xpath(getProceedToCheckout_xpath())).click();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void enterDiscountCode() {
		try {
			driver.findElement(By.id(getDiscountCode_id())).sendKeys("GURU50");
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		
	}
	
	public void clickApply() {
		try {
			driver.findElement(By.xpath(getApply_Code())).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String getDiscountAmout() {
		try {
			return driver.findElement(By.xpath(getDiscount_label())).getText();

		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}
	public String getReOrderGrandTotal() {
		try {
			return driver.findElement(By.xpath(getReOrderGrandTotal_Label())).getText();

		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	} 
	
}
