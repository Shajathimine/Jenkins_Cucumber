package com.Pom_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
public static WebDriver driver;
	
	@FindBy (xpath = "//input[@name='logout']")
	private WebElement logout;
	
	public  Logout_Page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}
