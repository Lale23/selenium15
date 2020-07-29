package Page;

import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public  WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginButton;


    public void login1(String userName, String password){

        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password, Keys.ENTER);

    }

}
