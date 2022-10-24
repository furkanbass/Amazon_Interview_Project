@grid_feature
  Feature: grid_feature
    @grid_chrome
    Scenario: TC01_running_on_chrome
      Given Go to amazon.ca with chrome
      Then Click on hamburger menu (top left corner)
      And Select Kindle under Digital Content and Devices
      And Click Kindle under Kindle E-Reader
      And Click Buy Now
      And Verify User is asked for email or mobile number
      Then Close the browser


    @grid_firefox
    Scenario: TC01_running_on_firefox
      Given Go to amazon.ca with firefox
      Then Click on hamburger menu (top left corner)
      And Select Kindle under Digital Content and Devices
      And Click Kindle under Kindle E-Reader
      And Click Buy Now
      And Verify User is asked for email or mobile number
      Then Close the browser