package com.Adactin.stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Adactin.runner.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition {

	public static WebDriver driver=Runner.driver;
	
	@Given("Launching the adactin application")
	public void launching_the_adactin_application() {
		driver.get("https://adactinhotelapp.com/index.php"); 
	}



	@When("Entering the data in Username field")
	public void entering_the_data_in_username_field() {
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	     username.sendKeys("BenazirFaizha");
	
	}
	
	@When("Entering the password in the required field")
	public void entering_the_password_in_the_required_field() {
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shinchan@97");
	
	}
	
	@Then("clicking the login button after all requied entry")
	public void clicking_the_login_button_after_all_requied_entry() {
	    
		
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@When("user Selects The Hotel Location")
	public void user_selects_the_hotel_location() {
		
		
		 WebElement first = driver.findElement(By.xpath("//select[@name='location']"));
		 
		 Select a =new Select(first);
		    a.selectByIndex(3);
	}

    @When("user Selects The Hotel From List Of Hotels")
	public void user_selects_the_hotel_from_list_of_hotels() {
    	
    	 WebElement second = driver.findElement(By.xpath("//select[@name='hotels']"));
  	   Select b = new Select(second);
  	   b.selectByValue("Hotel Sunshine");
    	
    	
	}
	@When("user Selects The Room Type In The Desired Field")
	public void user_selects_the_room_type_in_the_desired_field() {
		
		 WebElement third = driver.findElement(By.xpath("//select[@name='room_type']"));
		  Select c= new Select(third);
		  c.selectByVisibleText("Deluxe");
		
	}
	@When("user Select The Number Of Rooms In The  Desired Field")
	public void user_select_the_number_of_rooms_in_the_desired_field() {
		
		WebElement four = driver.findElement(By.xpath("//select[@name='room_nos']"));
		   Select d = new Select(four);
		   d.selectByIndex(3);
		
		
	}
	@When("user Selects The Number Of Adults In The Particular Field")
	public void user_selects_the_number_of_adults_in_the_particular_field() {
		
		 WebElement five = driver.findElement(By.xpath("//select[@id='adult_room']"));
	      Select e= new Select(five);
	      e.selectByValue("2");
		
	}
	@When("user Selects The Number Of Children In The Particular Field")
	public void user_selects_the_number_of_children_in_the_particular_field() {
		
		 WebElement six = driver.findElement(By.xpath("//select[@name='child_room']"));
	     Select f = new Select(six);
	     f.selectByVisibleText("1 - One");
		
		
	}
	@Then("user Click The Search Button And It Navigates To Check In Page")
	public void user_click_the_search_button_and_it_navigates_to_check_in_page() {
		
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
	}

	@When("user Checks The Booking details And Click The Radio Button")
	public void user_checks_the_booking_details_and_click_the_radio_button() {
		
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		
		}



	@Then("user Click Continue Button And It Navigates To Book Hotel Page")
	public void user_click_continue_button_and_it_navigates_to_book_hotel_page() {
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("user Enters The First Name In The Required Field")
	public void user_enters_the_first_name_in_the_required_field() {
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("sddhyhjy");
	}



	@When("user Enters The Last Name In The Required Field")
	public void user_enters_the_last_name_in_the_required_field() {
		
		 driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("gggdetrdswssd");
	}
	@When("user Enters The Billing Address In The Required Field")
	public void user_enters_the_billing_address_in_the_required_field() {
		
		 driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("203 srte  sjreyufbfhfbggbfgbdgfvhcbg");
	}
	@When("user Enters The Credit Card Number In The Desired Field")
	public void user_enters_the_credit_card_number_in_the_desired_field() {
		
		 driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");
	}
	@When("user Selects The Credit Card Type From The Listed Options")
	public void user_selects_the_credit_card_type_from_the_listed_options() {
		
		WebElement creadcard = driver.findElement(By.xpath("//select[@name='cc_type']"));
		 Select i =new Select(creadcard);
		 i.selectByIndex(2);
	}
	@When("user Selects The Expiry Month and Expiry Year In The Expiry Date Field")
	public void user_selects_the_expiry_month_and_expiry_year_in_the_expiry_date_field() {
		
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		 Select m =new Select(month);
		 m.selectByValue("4");
		 
		 WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		 Select y =new Select(year);
		 y.selectByVisibleText("2022");
	}
	@When("user Enters The CVV Number In The Particular Field")
	public void user_enters_the_cvv_number_in_the_particular_field() {
		
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("12345");
		 
		
	}
	@Then("user Clicks Book Now Button And It Navigates To Booking Confirmation Page")
	public void user_clicks_book_now_button_and_it_navigates_to_booking_confirmation_page() {
		
		driver.findElement(By.xpath("//input[@type='button']")).click(); 
		
		}

	@Then("user Clicks My Itenary Button And It Navigates To Booked Itenary Page")
	public void user_clicks_my_itenary_button_and_it_navigates_to_booked_itenary_page() {
		
		 driver.findElement(By.xpath("//input[@name='my_itinerary']")).click();
		  
	}
	@Then("user Clicks The Logout Button And Logsout Successfully")
	public void user_clicks_the_logout_button_and_logsout_successfully() {
		
		driver.findElement(By.xpath("//input[@name='logout']")).click();
	}
}
