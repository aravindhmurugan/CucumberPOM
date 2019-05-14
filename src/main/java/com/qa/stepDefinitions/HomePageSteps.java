package com.qa.stepDefinitions;

import java.io.IOException;

import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;
import com.qa.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert; 

public class HomePageSteps extends TestBase {
	
	public HomePageSteps() throws IOException {
		super();
	}
	
	Loginpage loginpage = new Loginpage();
	Homepage homepage = new Homepage();

	@Given("^user opens browser$")
	public void user_is_on_home_page() {
		initialization();
	}
	
	@Then("^user is on the login page$")
	public void user_is_on_the_login_page(){
		
		String logintitle = loginpage.verifyloginpagetitle();
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", logintitle);
		
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws IOException{
		Loginpage loginpage = new Loginpage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@And("^user is on the home page$")
	public void user_is_on_the_home_page(){
		driver.switchTo().frame("mainpanel");
		String hometitle = homepage.verifyhomepagetitle();
		Assert.assertEquals(hometitle, "CRMPRO");
	}

	@Then("^user is on the new contacts page$")
	public void user_is_on_the_new_contacts_page() {
		homepage.clickonnewcontactslink();
	}


}
