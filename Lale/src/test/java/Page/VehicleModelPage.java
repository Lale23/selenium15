package Page;

import Utilities.BrowserUtils;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class VehicleModelPage {

    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    Actions actions = new Actions(Driver.getDriver());

    public VehicleModelPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    private WebElement fleetModule;

    @FindBy(xpath = "//span[text()='Vehicles Model']")
    private WebElement vehicleModulePage;

    @FindBy(xpath = "//a[@title='Create Vehicles Model']")
    private WebElement createVehiclesModelButton;

    @FindBy(name = "custom_entity_type[ModelName]")
    private WebElement modelNameInput;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement makeInput;

    @FindBy(name = "custom_entity_type[Canberequested]")
    private WebElement canBeRequestedSelectButton;

    @FindBy(name = "custom_entity_type[CatalogValue]")
    private WebElement catalogValueInput;

    @FindBy(name = "custom_entity_type[CO2Fee]")
    private WebElement monthInput;

    @FindBy(name = "custom_entity_type[Cost]")
    private WebElement costInput;

    @FindBy(name = "custom_entity_type[TotalCost]")
    private WebElement totalCostInput;

    @FindBy(name = "custom_entity_type[CO2Emissions]")
    private WebElement co2EmissionsInput;

    @FindBy(name = "custom_entity_type[FuelType]")
    private WebElement fuelTypeDropdown;

    @FindBy(name = "custom_entity_type[Vendors]")
    private WebElement vendorsInput;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement saveAndCloseButton;

    /*
    @FindBy(xpath = "//div[text()='Entity saved']")
    private WebElement entitySavedMessage;
 */

    @FindBy(xpath = "//a[text()='Vehicles Model']")
    private WebElement vehiclesModuleTextButton;

    // //tr[@class='grid-row row-click-action'])[1]
    @FindBy(xpath = "(//tr[@class='grid-row row-click-action'])[1]")
    private WebElement carInfoButton;

    @FindBy(xpath = "//a[@title='Edit Vehicles Model']")
    private WebElement editButton;
    //                //a[@title='Delete Vehicles Model']
    @FindBy(xpath = "//a[@title='Delete Vehicles Model']")
    private WebElement deleteButton;

    @FindBy(xpath = "//a[text()='Yes, Delete']")
    private WebElement alertAccept;

    @FindBy(xpath = "//a[@title='Reset']")
    private WebElement resetButton;


    public void fleet(){
        wait.until(ExpectedConditions.elementToBeClickable(fleetModule));
        actions.moveToElement(fleetModule).click().perform();
    }

    public void vehicle(){
        wait.until(ExpectedConditions.elementToBeClickable(vehicleModulePage));
        actions.moveToElement(vehicleModulePage).click().perform();

        // String actualTitle = Driver.getDriver().getTitle();
        // String expectedTitle ="All - Vehicles Model - Entities - System - Car - Entities - System";
       /*
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Lale you got this!");
        }else{
            System.out.println("Work hard Lale!!!");
        }
          */
        //Assert.assertEquals(actualTitle,expectedTitle,"Work hard Lale!!");
        BrowserUtils.waitForLoaderMask();
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa2.vytrack.com/entity/Extend_Entity_VehiclesModel";
        Assert.assertEquals(actualURL,expectedURL,"Go Laleee");

    }

    public void createVehiclesModel(){
        wait.until(ExpectedConditions.elementToBeClickable(createVehiclesModelButton));
        createVehiclesModelButton.click();
    }

    public void modelName(String nameOfModel){
        wait.until(ExpectedConditions.elementToBeClickable(modelNameInput));
        modelNameInput.sendKeys(nameOfModel);
    }

    public void make(String makeValue){
        wait.until(ExpectedConditions.elementToBeClickable(makeInput));
        makeInput.sendKeys(makeValue);
    }

    public void selectCanBeRequested(){
        Select select = new Select(canBeRequestedSelectButton);
        wait.until(ExpectedConditions.elementToBeClickable(canBeRequestedSelectButton));
        select.selectByVisibleText("Yes");
    }

    public void catalogValue(String catalogValue){
        wait.until(ExpectedConditions.elementToBeClickable(catalogValueInput));
        catalogValueInput.sendKeys(catalogValue);
    }

    public void monthInput(String month){
        wait.until(ExpectedConditions.elementToBeClickable(monthInput));
        monthInput.sendKeys(month);
    }

    public void costInput(String costValue){
        wait.until(ExpectedConditions.elementToBeClickable(costInput));
        costInput.sendKeys(costValue);
    }

    public void totalCost(String totalCostValue){
        wait.until(ExpectedConditions.elementToBeClickable(totalCostInput));
        totalCostInput.sendKeys(totalCostValue);
    }

    public void emissionsInput(String emissionsValue){
        wait.until(ExpectedConditions.elementToBeClickable(co2EmissionsInput));
        co2EmissionsInput.sendKeys(emissionsValue);
    }

    public void selectFuelType(){
        Select select = new Select(fuelTypeDropdown);
        wait.until(ExpectedConditions.elementToBeClickable(fuelTypeDropdown));
        select.selectByVisibleText("Gasoline");
    }

    public void setVendorsInput(String vendorsValue){
        wait.until(ExpectedConditions.elementToBeClickable(vendorsInput));
        vendorsInput.sendKeys(vendorsValue);
    }

    public void setSaveAndCloseButton(){

        wait.until(ExpectedConditions.elementToBeClickable(saveAndCloseButton));
        actions.moveToElement(saveAndCloseButton).click();

    }

    /*
    public void setEntitySavedMessage(){

        try{
            Assert.assertTrue(entitySavedMessage.isDisplayed());
            System.out.println("yeahhhh you got this");
        }catch (StaleElementReferenceException exception){
            System.out.println("Stale element git this");
        }
    }
 */

    public void setVehiclesModuleTextButton(){
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesModuleTextButton));
        try{
            actions.moveToElement(vehiclesModuleTextButton).doubleClick().perform();
            System.out.println("yeahh you got this");
        }catch (StaleElementReferenceException exception){
            System.out.println("It's been catched");
        }
    }

    public void setCarInfoButton(){
        wait.until(ExpectedConditions.elementToBeClickable(carInfoButton));
        actions.moveToElement(carInfoButton).click().perform();
    }

    public void setEditButton(String modelName,String makeValue, String vendorValue){
        wait.until(ExpectedConditions.elementToBeClickable(editButton));
        //Thread.sleep(3000);
        editButton.click();
        // Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), pricePerUnitValue);
        wait.until(ExpectedConditions.elementToBeClickable(modelNameInput));
        //Thread.sleep(3000);
        modelNameInput.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END),modelName);

        // Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(makeInput));
        makeInput.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END),makeValue);

        //Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(vendorsInput));
        vendorsInput.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT, Keys.END),vendorValue);

        // Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(saveAndCloseButton));
        saveAndCloseButton.click();
        BrowserUtils.waitForLoaderMask();
    }

    public void setDeleteButton(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
        //Thread.sleep(5000);
        deleteButton.click();
    }
    public void setAlertAccept(){
        wait.until(ExpectedConditions.elementToBeClickable(alertAccept));
        // Thread.sleep(5000);
        alertAccept.click();
    }

    public void setResetButton(){
        wait.until(ExpectedConditions.elementToBeClickable(resetButton));
        // Thread.sleep(5000);
        actions.moveToElement(resetButton).click().perform();
    }
}
