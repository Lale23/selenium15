package test;


import Page.LoginPage;
import Utilities.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest_US1 extends TestBase {


    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 25);

    LoginPage loginPage = new LoginPage();

    @Test(dataProvider = "testData")
    public void loginTest_US1_1(String userName, String password) {

        loginPage.login1(userName, password);
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
