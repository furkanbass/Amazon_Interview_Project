package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    @Given("Go to amazon.ca")
    public void go_to_amazon_ca() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().navigate().refresh();
    }
    @Then("Click on hamburger menu \\(top left corner)")
    public void click_on_hamburger_menu_top_left_corner() {
        amazonPage.hamburgerMenu.click();
    }
    @Then("Select Kindle under Digital Content and Devices")
    public void select_kindle_under_digital_content_and_devices() {
        amazonPage.Kindle.click();
    }
    @Then("Click Kindle under Kindle E-Reader")
    public void click_kindle_under_kindle_e_reader() {
        amazonPage.allKindle.click();
    }
    @Then("Click Buy Now")
    public void click_buy_now() {
        WebElement buyNow = amazonPage.buyNow;
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        if (amazonPage.addWishList.isDisplayed()){
            amazonPage.addWishList.click();
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        else {
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            amazonPage.buyNow.click();
        }

    }
    @Then("Verify User is asked for email or mobile number")
    public void verify_user_is_asked_for_email_or_mobile_number() {
        String signIn = "Sign in";
        Assert.assertEquals(signIn,amazonPage.signIn.getText());
        String emailPhoneNumber = "Email or mobile phone number";
        Assert.assertEquals(emailPhoneNumber,amazonPage.emailPhoneNumber.getText());
    }
    @Then("Close the browser")
    public void close_the_browser() {

    }
}
