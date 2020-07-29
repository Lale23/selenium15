package test;

import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    @BeforeMethod
    public void setUp(){
        BrowserUtils.waitForLoaderMask();
        String url = ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(url);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        BrowserUtils.waitForLoaderMask();

    }

    @AfterMethod
    public void tearDown(){

        Driver.closeDriver();

    }
}
