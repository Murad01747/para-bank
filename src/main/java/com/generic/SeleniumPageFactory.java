package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {
	
	SeleniumPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//*[@name='username']")
	private WebElement username;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement login;
	
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
}
