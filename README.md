# Amazon_Interview_Project

==> The framework (Cucumber BDD) is builded from scratch based on the Page Object Model. 

==>The feature file is created according to the test case.

==>Amazon Page is created to define the locators. 

==>Properties file is used to store the important data such as url and browser type. ConfigReader class created under the utilities package to get the data easily from properties file.

==> Currently, the "BuyNow" button is not visible because the kindle is not available in stock on the amazon website. So, if there is no "BuyNow" button, the "Add Wish To List" button is clicked instead and verified the user is asked for their email and phone number.

==> Html reporting is defined in the runner classes and added the plugin into the pom.xml file. (target/html-reports/)

==> Implicit Wait is used to handle the "NoSuchElementException" exceptions and synchronization issues.



Selenium Grid is a tool to run tests on Remote Web Driver for Cross-platform testing.

Configuration Steps:

==> Downloaded the selenium server - currently using selenium grid version 4

==> Downloaded the drivers - currently using chromedriver and firefoxdriver

==> Used CMD to run the server - used standalone mode

==> Created grid_feature file and grid_step_definition

==> Used RemoteWebDriver
