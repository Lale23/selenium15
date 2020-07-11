package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    //	Task :
    //	- Write a static method in WebDriverFactory class
    //	- Return type is WebDriver
    //	- method name getDriver
    //	- it accepts one String argument, and returns the browser according to what string is passed
    //	- if "chrome" --> returns chrome browser
    //	- if "firefox" --> returns firefox browser
    //

    public static WebDriver getDriver(String browserType){

        if (browserType.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/chromedriver.exe");
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\IdeaProjects\\seleniumprojectB18\\webdriver.chrome.driver.exe");
            return new ChromeDriver();

        } else if (browserType.equals("firefox")){
            System.setProperty("webdriver.firefox.driver", "C:\\Users\\TOSHIBA\\IdeaProjects\\seleniumprojectB18\\webdriver.geckodriver.driver.exe");
            return new FirefoxDriver();

        }else{
            System.out.println("Given browser type does not exist. Driver = null!");
            return null;
        }


    }




}
