package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class Homepage extends TestBase{
	
	@FindBy(xpath = "//td[contains(text(),'User: Aravindh Murugan')]")
	WebElement usernamelabel;
			
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")	
	WebElement Contactslink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newcontactslink;
	
	public Homepage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyusernamelabel() {
		return usernamelabel.isDisplayed();
	}
	
	public String verifyhomepagetitle() {
		return driver.getTitle();
	}
	
	public void clickonnewcontactslink() {
		Actions action = new Actions(driver);
		action.moveToElement(Contactslink).build().perform();
		newcontactslink.click();
		
	}
	
	

}
