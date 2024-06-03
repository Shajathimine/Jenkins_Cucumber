package com.Pom_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Page {
	
	
	public static WebDriver driver;
	
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement user;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement click;
	
	public login_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClick() {
		return click;
	}
	


}
