package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {


    public static void login(WebDriver driver){
        //3. Enter username: “Tester”
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        inputUsername.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        inputPassword.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
    }


    public static void verifyOrder(WebDriver driver,String name){
        /*
    PRACTICE #4: Method: verifyOrder
    •Create a method named verifyOrderin SmartBearUtils class.
    •Methodtakes WebDriver object and String(name).
    •Methodshould verify if given name exists in orders.
    •This method should simply accepts a name(String), and assert whether given name is in the list or not.
    •Create a new TestNG test to test if the method is working as expected
     */

      //  List<WebElement> list=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2]")); //body//td[2]
        //this is only for second row
//        List<WebElement> list=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td"));
//
//        String actualName="";
//        for (WebElement eachName : list) {
//            if (eachName.getText().equals(name))
//                actualName=eachName.getText();
//        }
//        Assert.assertTrue(actualName.equals(name));
//
//        //Finding and storing all of the names in our web table in a list of web element
        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));


        for (WebElement each : namesList) {
            if (each.getText().equals(name)){
                Assert.assertTrue(true);
                return;
             //   break used to exit the loop, return - to exit method..


//                You declare a method’s return type in its method declaration.
//                Within the body of the method, you use the return statement to return the value.
//                Any method declared void doesn’t return a value.
//                It does not need to contain a return statement, but it may do so.
//                In such a case, a return statement can be used to branch out of a control flow block and exit the method .
            }
        }

        Assert.fail("The name does not exist in the list! Verification failed!");

    }

    public static void printNamesAndCities(WebDriver driver){
//   Practice #5: Method: printNamesAndCities
//        •Create a method named printNamesAndCitiesin SmartBearUtils class.
//        •Method takes WebDriver object.
//        •This method should simply print all the names in the List of All Orders.
//        •Create a new TestNG test to test if the method is working as expected.
//        •Output should be like:
//        •Name1: name , City1: city
//        •Name2: name , City2: city

        List<WebElement> list1=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2]"));
        List<WebElement> list2=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[7]"));

        for (int i=0; i<list1.size() ; i++){
            System.out.println("Name"+(i+1)+": "+list1.get(i).getText()+" , City"+(i+1)+": "+list2.get(i).getText());
        }
    }
}