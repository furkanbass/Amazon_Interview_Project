package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridStepDefinitions {
    WebDriver driver;
    @Given("Go to amazon.ca with chrome")
    public void go_to_amazon_ca_with_chrome() throws MalformedURLException {

//        chromeOptions.setCapability("browserVersion", "106");
//        chromeOptions.setCapability("platformName", "Windows");

       driver = new RemoteWebDriver(new URL("http://192.168.2.14:4444"),new ChromeOptions());
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("amazonUrl"));
    }

    @Given("Go to amazon.ca with firefox")
    public void go_to_amazon_ca_with_firefox() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.2.14:4444"),new FirefoxOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("amazonUrl"));
    }
}
