package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id="nav-hamburger-menu")
    public WebElement hamburgerMenu;

    @FindBy(xpath ="//*[text()='Kindle E-readers & Books']")
    public WebElement Kindle;

    @FindBy(xpath = "//*[text()='All-new Kindle']")
    public WebElement allKindle;

    @FindBy(id = "buy-now-button")
    public WebElement buyNow;

    @FindBy(xpath = "//*[text()=' Add to List ']")
    public WebElement addWishList;

    @FindBy(xpath = "//*[@class='a-spacing-small']")
    public WebElement signIn;

    @FindBy(xpath = "//*[@class='a-form-label']")
    public WebElement emailPhoneNumber;

}
