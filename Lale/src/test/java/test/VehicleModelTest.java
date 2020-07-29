package test;

import Page.LoginPage;
import Page.VehicleModelPage;
import Utilities.BrowserUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VehicleModelTest extends TestBase{

    @Test(dataProvider = "testData")
    public void vehicleModel_1(String userName, String password) {

        LoginPage loginPage = new LoginPage();
        VehicleModelPage vehicleModelPage = new VehicleModelPage();


        loginPage.login1(userName,password);
        vehicleModelPage.fleet();
        vehicleModelPage.vehicle();
        vehicleModelPage.createVehiclesModel();
        vehicleModelPage.modelName("Toyota");
        vehicleModelPage.make("300");
        vehicleModelPage.selectCanBeRequested();
        vehicleModelPage.catalogValue("25366");
        vehicleModelPage.monthInput("07");
        vehicleModelPage.costInput("50000");
        vehicleModelPage.totalCost("6000000");
        vehicleModelPage.emissionsInput("577");
        vehicleModelPage.selectFuelType();
        vehicleModelPage.setVendorsInput("5555");
        vehicleModelPage.setSaveAndCloseButton();
        //vehicleModelPage.setEntitySavedMessage();

        vehicleModelPage.setVehiclesModuleTextButton();

        vehicleModelPage.fleet();

        vehicleModelPage.vehicle();

        vehicleModelPage.setCarInfoButton();

        vehicleModelPage.setEditButton("BMW", "150.000", "yes");
        //vehicleModelPage.fleet();
        //vehicleModelPage.vehicle();
        vehicleModelPage.setDeleteButton();
        vehicleModelPage.setAlertAccept();
        vehicleModelPage.setResetButton();
        BrowserUtils.waitForLoaderMask();
    }



    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                {"storemanager79", "UserUser123"},
                {"storemanager80", "UserUser123"},
                {"salesmanager143", "UserUser123"},
                {"salesmanager144", "UserUser123"},
                {"salesmanager145", "UserUser123"}
        };



    }
}
