package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        //you must initialize page factory to make @FindBy annotation work
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetModule;

    @FindBy (xpath = "//span[.='Vehicles']")
    public WebElement vehiclesButton;


}
