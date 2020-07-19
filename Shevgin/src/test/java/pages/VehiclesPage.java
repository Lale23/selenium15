package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VehiclesPage {

    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        //you must initialize page factory to make @FindBy annotation work
    }

    @FindBy(xpath = "//a[@title='Create Car']")
    public WebElement createCarButton;

    @FindBy (xpath = "//a[@title='Cancel']")
    public WebElement cancelCarButton;

    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "(//i[@class='fa-plus']/..)[1]")
    public WebElement vehicleModelButton;

    @FindBy(xpath = "(//i[@class='fa-plus']/..)[2]")
    public WebElement vehicleMakeButton;

    @FindBy(xpath = "//input[@name='custom_entity_type[LicensePlate]']")
    public WebElement inputLicense;



}
