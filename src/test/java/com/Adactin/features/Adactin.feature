Feature:  Book the adactin hotel for vaccation
Scenario:  user login the adactin application 
Given Launching the adactin application 
When Entering the data in Username field
And Entering the password in the required field
Then clicking the login button after all requied entry

Scenario: user Searches For Hotel In Search Hotel Page
When user Selects The Hotel Location
And user Selects The Hotel From List Of Hotels
And user Selects The Room Type In The Desired Field
And user Select The Number Of Rooms In The  Desired Field
And user Selects The Number Of Adults In The Particular Field
And user Selects The Number Of Children In The Particular Field
Then user Click The Search Button And It Navigates To Check In Page

Scenario: user Click The Radio Button In The CheckIn Page
When user Checks The Booking details And Click The Radio Button
Then user Click Continue Button And It Navigates To Book Hotel Page

Scenario: user Enters The Details In The Book Hotel Page
When user Enters The First Name In The Required Field
When user Enters The Last Name In The Required Field
When user Enters The Billing Address In The Required Field 
When user Enters The Credit Card Number In The Desired Field
When user Selects The Credit Card Type From The Listed Options
When user Selects The Expiry Month and Expiry Year In The Expiry Date Field
When user Enters The CVV Number In The Particular Field
Then user Clicks Book Now Button And It Navigates To Booking Confirmation Page

Scenario: user Checks The Details Are Displayed Correctly
Then user Clicks My Itenary Button And It Navigates To Booked Itenary Page

Scenario: user Checks The Hotel Booking Details Are Updated
Then user Clicks The Logout Button And Logsout Successfully






