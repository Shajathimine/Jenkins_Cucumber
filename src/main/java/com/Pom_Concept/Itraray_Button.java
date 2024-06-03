package com.Pom_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itraray_Button {
	
	
	
	public static WebDriver driver;
	
	@FindBy (xpath = "//input[@name='my_itinerary']")
	private WebElement itinrary;
	
	public   Itraray_Button(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	public WebElement getItinrary() {
		return itinrary;
	}
	
	
	

}
