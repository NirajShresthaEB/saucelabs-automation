package com.niraj.eb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.niraj.eb.base.TestBase;
import com.niraj.eb.pages.CheckOutInfoPage;

public class CartPage extends TestBase{
	
	@FindBy(id="checkout")
	WebElement checkOut;
	
	
	
	//Initializing the Page Objects
	
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public CheckoutInformation checkOut() {
		
		checkOut.click();
		
		return new CheckoutInformation();
		
	}
	
	
	
	
	
	

}


}
