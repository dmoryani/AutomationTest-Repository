/**
 * 
 */
package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Divya
 * 
 */
public class ConfigReader {
	Properties prop;

	public ConfigReader() {

		try {
			File src = new File("./src/com/utility/resources/Config.property");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getDriverPath() {
		return prop.getProperty("driver_path");
	}

	public String getDriverValue() {
		return prop.getProperty("driver_value");
	}

	public String getUrl() {
		return prop.getProperty("url");
	}

	public String getMobileMenu() {
		return prop.getProperty("Mobile_menu_locator");
	}

	public String getPrice() {
		return prop.getProperty("Sony_Xperia_price_locator");
	}

	public String getModel() {
		return prop.getProperty("Sony_Xperia_Model");
	}

	public String getAddToCart() {
		return prop.getProperty("Mobile_Xperia_AddToCart");
	}

	public String getQuantity() {
		return prop.getProperty("Xperia_Quantity");
	}

	public String getUpdateButton() {
		return prop.getProperty("Xperia_UpdateQty");
	}

	public String getErrorMessage() {
		return prop.getProperty("Xperia_ErrorMessage");
	}

	public String getActualErrorMessage() {
		return prop.getProperty("ActualErrorMessage");
	}

	public String getEmptyCartLink() {
		return prop.getProperty("EmptyCart");
	}

	public String getEmptyCartMessage() {
		return prop.getProperty("MessageafterEmptyCart");
	}

	public String getActualEmptyCartMessage() {
		return prop.getProperty("ActualEmptyCartMessage");
	}

	public String getXperiaAddToCompare() {
		return prop.getProperty("Xperia_AddToCompare");
	}

	public String getIphoneAddToCompare() {
		return prop.getProperty("Iphone_AddToCompare");
	}

	public String getCompareButton() {
		return prop.getProperty("Compare_Button");
	}

	public String getComparePopupTitle() {
		return prop.getProperty("Compare_popupTitle");
	}

	public String getCompareActualTitle() {
		return prop.getProperty("CompareActualTitle");
	}

	public String getXperiaLinkText() {
		return prop.getProperty("Xperia_linkText");
	}

	public String getIphoneLinkText() {
		return prop.getProperty("Iphone_linkText");
	}
	public String getMyAccount_Link() {
		return prop.getProperty("MyAccount_Link");
	}
	public String getCreateAccount() {
		return prop.getProperty("CreateAccount");
	}
	public String getFirstName_id() {
		return prop.getProperty("FirstName_id");
	}
	public String getLastName_Id() {
		return prop.getProperty("LastName_Id");
	}
	public String getEmail_id() {
		return prop.getProperty("Email_id");
	}
	public String getPassword_id() {
		return prop.getProperty("Password_id");
	}
	public String getConfirm_Pwd_id() {
		return prop.getProperty("Confirm_Pwd_id");
	}
	public String getRegister_button() {
		return prop.getProperty("Register_button");
	}
	public String getRegistration_Message_xpath() {
		return prop.getProperty("Registration_Message_xpath");
	}
	public String getActual_Reg_msg() {
		return prop.getProperty("Actual_Reg_msg");
	}
	public String getTV_menu() {
		return prop.getProperty("TV_menu");
	}
	public String getLG_LCD_AddtoWishlist() {
		return prop.getProperty("LG_LCD_AddtoWishlist");
	}
	public String getShare_Wishlist() {
		return prop.getProperty("Share_Wishlist");
	}
	public String getMessage_ID() {
		return prop.getProperty("Message_ID");
	}
	public String getWishlist_Message_xpath() {
		return prop.getProperty("Wishlist_Message_xpath");
	}
	public String getActual_Wishlist_msg() {
		return prop.getProperty("Actual_Wishlist_msg");
	}
	public String getLoginEmail_id() {
		return prop.getProperty("LoginEmail_id");
	}
	public String getLoginPassword_id() {
		return prop.getProperty("LoginPassword_id");
	}
	public String getLogin_button() {
		return prop.getProperty("LoginButton_id");
	}
	public String getMyWishlist() {
		return prop.getProperty("My_Wishlist");
	}
	public String getLGAddtoCart() {
		return prop.getProperty("LG_AddToCart");
	}
	public String getStateRegion_Id() {
		return prop.getProperty("StateRegion_Id");
	}
	public String getZip_Id() {
		return prop.getProperty("Zip_Id");
	}
	public String getEstimate_Button() {
		return prop.getProperty("Estimate_Button");
	}
	public String getFlatRate_Id() {
		return prop.getProperty("FlatRate_Id");
	}
	public String getActualFlatRatePrice() {
		return prop.getProperty("ActualFlatRatePrice");
	}
	
	public String getFlatRatePrice_xpath() {
		return prop.getProperty("FlatRatePrice_xpath");
	}
	public String getUpdateTotal_Button() {
		return prop.getProperty("UpdateTotal_Button");
	}
	public String getGrandTotal_Label() {
		return prop.getProperty("GrandTotal_Label");
	}
	public String getActualGrandTotal() {
		return prop.getProperty("ActualGrandTotal");
	}
	
	public String getProceedToCheckout_xpath() {
		return prop.getProperty("ProceedToCheckout_xpath");
	}
	public String getBillingAddress_id() {
		return prop.getProperty("BillingAddress_id");
	}
	public String getBillingCity_id() {
		return prop.getProperty("BillingCity_id");
	}
	public String getBillingStateRegion_Id() {
		return prop.getProperty("BillingStateRegion_Id");
	}
	public String getBillingZip_id() {
		return prop.getProperty("BillingZip_id");
	}
	public String getBillingTelephone_id() {
		return prop.getProperty("BillingTelephone_id");
	}
	public String getBillingContinue_Button() {
		return prop.getProperty("BillingContinue_Button");
	}
	public String getShippingContinue_Button() {
		return prop.getProperty("ShippingContinue_Button");
	}
	public String getPaymentContinue_Button() {
		return prop.getProperty("PaymentContinue_Button");
	}
	public String getCheckout_CheckMoneyOrder_id() {
		return prop.getProperty("Checkout_CheckMoneyOrder_id");
	}
	public String getPlaceOrder_button() {
		return prop.getProperty("PlaceOrder_button");
	}
	public String getOrderPlaced_Message() {
		return prop.getProperty("OrderPlaced_Message");
	}
	public String getOrder_No() {
		return prop.getProperty("Order_No_xpath");
	}
	public String getActualOrdermessage() {
		return prop.getProperty("ActualOrdermessage");
	}
	public String getIphone_AddToCart_button() {
		return prop.getProperty("Iphone_AddToCart_button");
	}
	public String getDiscountCode_id() {
		return prop.getProperty("DiscountCode_id");
	}
	public String getApply_Code() {
		return prop.getProperty("Apply_Code");
	}
	public String getDiscount_label() {
		return prop.getProperty("Discount_label");
	}
	public String getActualDiscount() {
		return prop.getProperty("ActualDiscount");
	}
	
	public String getMyorder(){
		return prop.getProperty("Myorder");
	}
	public String getViewOrder(){
		return prop.getProperty("ViewOrder");
	}
	public String getOrderStatus_Message(){
		return prop.getProperty("OrderStatus_Message");
	}
	public String getPrintOrder_button(){
		return prop.getProperty("PrintOrder_button");
	}
	public String getActualOrderStatus_Message(){
		return prop.getProperty("ActualOrderStatus");
	}
	
	public String getReOrder(){
		return prop.getProperty("ReOrder");
	}
	
	public String getReOrderGrandTotal_Label(){
		return prop.getProperty("ReOrderGrandTotal_Label");
	}
	public String getActualReOrderGrandTotal(){
		return prop.getProperty("ActualReOrderGrandTotal");
	}
}
