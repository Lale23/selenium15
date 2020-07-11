package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ForgotPasswordPage {

    public ForgotPasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        //page factory needs initelements and init elements needs webdriver and object
    }

    @FindBy(id = "prependedInput")
    public WebElement inputBox;

    @FindBy(xpath = "//button[.='Request']")
    public WebElement requestButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;



}
