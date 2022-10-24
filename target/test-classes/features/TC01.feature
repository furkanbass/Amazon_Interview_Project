Feature: Amazon Kindle
  Scenario: Amazon Kindle TC01
    Given Go to amazon.ca
    Then Click on hamburger menu (top left corner)
    And Select Kindle under Digital Content and Devices
    And Click Kindle under Kindle E-Reader
    And Click Buy Now
    And Verify User is asked for email or mobile number
    Then Close the browser