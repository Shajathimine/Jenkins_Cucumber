package com.Pom_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_HotelPage {
	
	public static WebDriver driver;
	
	@FindBy (xpath= "//select[@name='location']")
	private WebElement location;
	
	@FindBy (xpath = "//select[@name='hotels']")
	private WebElement hotel;
	
	@FindBy (xpath ="//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy (xpath ="//select[@name='room_nos']")
	private WebElement roomno;
	
	@FindBy (xpath="//select[@id='adult_room']")
	private WebElement adultroom;
	
	@FindBy (xpath ="//select[@name='child_room']")
	private WebElement childroom;
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement submit;
	
	public Search_HotelPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

}
