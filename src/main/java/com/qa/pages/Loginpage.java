package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class Loginpage extends TestBase{

	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Login']")
	WebElement loginbtn;
	
	@FindBy(className = "img-responsive")
	WebElement crmlogo;
	
	public Loginpage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyloginpagetitle() {
		return driver.getTitle();
		
	}
	
	public Boolean verifycrmlogo() {
		return crmlogo.isDisplayed();
	}
	
	public Homepage login(String un, String pwd) throws IOException{
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()", loginbtn);
		
		return new Homepage();
		
	}
	
	
	

}
