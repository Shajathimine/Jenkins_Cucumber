package com.Pom_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	
	public static WebDriver driver;
	
	@FindBy (xpath ="//input[@name='radiobutton_0']")
	private WebElement radiobutton;
	
	@FindBy (xpath ="//input[@type='submit']")
	private WebElement sbutton;
	
	public Select_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getSbutton() {
		return sbutton;
	}
	

}
