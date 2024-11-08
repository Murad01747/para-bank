package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.HighLighter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	SeleniumPageFactory pf;
	WebDriver driver;
	
	@Given("Open the browser")
	public void open_the_browser() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("Go to the application URL")
	public void go_to_the_application_URL() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@When("Put the valid user")
	public void put_the_valid_user() throws Exception {	
		
		pf= new SeleniumPageFactory(driver);
		HighLighter.getColor(driver, pf.getUsername(), "black");	
		pf.getUsername().sendKeys("student123");
		
	}

	@When("Put the valid password")
	public   void put_the_valid_password() throws Exception {
		pf= new SeleniumPageFactory(driver);
		HighLighter.getColor(driver, pf.getPassword(), "red");
		pf.getPassword().sendKeys("qa1234");		
	}

	@When("Click the login button")
	public void click_the_login_button() throws Exception {
		
		pf= new SeleniumPageFactory(driver);
		HighLighter.getColor(driver, pf.getLogin(), "blue");
		Thread.sleep(10000);
		 pf.getLogin().click();
	}

	@Then("Check the login should pass")
	public void check_the_login_should_pass() {
	    
	}

	@When("Put the invalid user")
	public void put_the_invalid_user()throws Exception {
		pf= new SeleniumPageFactory(driver);
		HighLighter.getColor(driver, pf.getUsername(), "black");	
		 pf.getUsername().sendKeys("abcd");
	}		


	@When("Put the invalid password")
	public void put_the_invalid_password()throws Exception {
		pf= new SeleniumPageFactory(driver);
		HighLighter.getColor(driver, pf.getPassword(), "red");
		 pf.getPassword().sendKeys("qa1234");
	}

	@Then("Check the login should fail")
	public void check_the_login_should_fail() {
	    
	}

	@When("Put the null user")
	public void put_the_null_user() throws Exception{
		pf= new SeleniumPageFactory(driver);
		HighLighter.getColor(driver, pf.getUsername(), "black");	
		 pf.getUsername().sendKeys("");
	}

	@When("Put the null password")
	public void put_the_null_password() throws Exception{
		pf= new SeleniumPageFactory(driver);
		HighLighter.getColor(driver, pf.getPassword(), "red");
		 pf.getPassword().sendKeys("");
	}
}
