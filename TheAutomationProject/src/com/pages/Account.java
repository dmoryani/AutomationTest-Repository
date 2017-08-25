/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;

import com.utility.BrowserSetup;

/**
 * @author Divya
 *
 */
public class Account extends BrowserSetup {
	public void clickMyAccount(){
		try {
			
			driver.findElement(By.xpath(getMyAccount_Link())).click();
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickCreateAccount(){
		try {
			
			driver.findElement(By.xpath(getCreateAccount())).click();
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void enterFirstName(){
		try {
			
			driver.findElement(By.id(getFirstName_id())).sendKeys("Neha");
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void enterLastName(){
		try {
		
			driver.findElement(By.id(getLastName_Id())).sendKeys("Mehta");
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void enterEmailId(){
		try {
		
			driver.findElement(By.id(getEmail_id())).sendKeys("Neha_Menta_002@gmail.com");
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void enterPassword(){
		try {
		
			driver.findElement(By.id(getPassword_id())).sendKeys("password123");
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void enterConfirmPassword(){
		try {
		
			driver.findElement(By.id(getConfirm_Pwd_id())).sendKeys("password123");
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickRegisterButton(){
		try {
		
			driver.findElement(By.xpath(getRegister_button())).click();
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String getRegisterMessage(){
		try {
			
		return  driver.findElement(By.xpath(getRegistration_Message_xpath())).getText();
			
		} catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}
	
	public void enterLoginEmailId(){
		try {
		
			driver.findElement(By.id(getLoginEmail_id())).sendKeys("Neha_Menta_001@gmail.com");
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void enterLoginPassword(){
		try {
		
			driver.findElement(By.id(getLoginPassword_id())).sendKeys("password123");
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void clickLoginButton(){
		try {
		
			driver.findElement(By.id(getLogin_button())).click();
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
