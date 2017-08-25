/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;

/**
 * @author Divya
 *
 */
public class MyOrder extends Account{
	
	public void clickMyOrder(){
		try {
			
			driver.findElement(By.xpath(getMyorder())).click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickViewOrder(){
		try {
			
			driver.findElement(By.xpath(getViewOrder())).click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String verifyOrderStatus(){
		try {
			
			return driver.findElement(By.xpath(getOrderStatus_Message())).getText();
			
		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}
	public void clickPrintOrder(){
		try {
			
			driver.findElement(By.xpath(getPrintOrder_button())).click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void handlePrintDialog(){
		try {
			Thread.sleep(3000);
			
			Runtime.getRuntime().exec("D:\\eclipse\\workspace\\TheAutomationProject\\PrintOrder.exe");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void clickReOrder(){
		try {
			
			driver.findElement(By.xpath(getReOrder())).click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
