package com.Pom_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public static WebDriver driver;
	
	@FindBy (xpath = "//input[@name='first_name']")
	private WebElement name;
	
	@FindBy (xpath ="//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy (xpath ="//textarea[@name='address']")
	private WebElement address;
	
	@FindBy (xpath = "//input[@name='cc_num']")
	private WebElement number;
	
	@FindBy (xpath = "//select[@name='cc_type']")
	private WebElement cctype;
	
	@FindBy (xpath = "//select[@name='cc_exp_month']")
	private WebElement expmonth;
	
	@FindBy (xpath = "//select[@name='cc_exp_year']")
	private WebElement expyear;
	
	@FindBy (xpath = "//input[@name='cc_cvv']")
	private WebElement ccvv;
	
	@FindBy (xpath ="//input[@type='button']")
	private WebElement ebutton;
	
	
	public Book_Hotel (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	

	public WebElement getName() {
		return name;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCcvv() {
		return ccvv;
	}

	public WebElement getEbutton() {
		return ebutton;
	}

	
	
	
	

}
