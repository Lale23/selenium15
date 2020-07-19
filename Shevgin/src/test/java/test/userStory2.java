package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.VehiclesPage;
import utilities.ConfigurationReader;
import utilities.Driver;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class userStory2  {

//
//1.Verify that Store manager or sales manager should be able to see all vehicle information once
//navigate to Vehicle page
//2. Verify that Store manager or sales manager should be able to create and cancel car
//3.Verify that Store manager or sales manager should be able to add Vehicle Module and Vehicle Make
//4.Verify that Store manager or sales manager should be able to edit or delete the car
//5.Verify that Store manager or sales manager should be able to add event


    /*



     */

    LoginPage loginPage;
    DashboardPage dashboardPage;
    Actions actions;
    VehiclesPage vehiclesPage;


    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        //5- close browser
        Thread.sleep(3000);
//        Driver.closeDriver();
    }

    @Test
    public void login() throws InterruptedException {


        loginPage=new LoginPage();

        for (String each:UsersUtilities.authorizedUsers() ) {

            loginPage.login(each,UsersUtilities.password());

            Thread.sleep(5000);
            Driver.getDriver().findElement(By.xpath("//li[@class='dropdown user-menu-dropdown']")).click();

            Driver.getDriver().findElement(By.xpath("//a[@href='/user/logout']")).click();

        }

    }

    //
//1.Verify that Store manager or sales manager should be able to see all vehicle information once
//navigate to Vehicle page
    @Test
    public void AC1_vehiclePage() throws InterruptedException {
        loginPage=new LoginPage();
        dashboardPage=new DashboardPage();
        actions=new Actions(Driver.getDriver());


        for (String each:UsersUtilities.authorizedUsers() ) {

            loginPage.login(each,UsersUtilities.password() );

            actions.moveToElement(dashboardPage.fleetModule).perform();
            dashboardPage.vehiclesButton.click();

            Thread.sleep(1000);
            System.out.println(Driver.getDriver().getTitle());
            Assert.assertTrue(Driver.getDriver().getTitle().contains("Car"));


            WebElement logout=Driver.getDriver().findElement(By.xpath("//li[@class='dropdown user-menu-dropdown']/a"));
            Thread.sleep(1000);
            logout.click();
            Driver.getDriver().findElement(By.xpath("//a[@href='/user/logout']")).click();


        }
    }

    //2. Verify that Store manager or sales manager should be able to create and cancel car
    @Test
    public void AC2_create_cancel_car() throws InterruptedException {
        /*
        1
Open URL

https://qa2.vytrack.com/user/login

System should display the page

2
Enter valid user name and password and click on login button

Usernames :
storemanager79 , storemanager80 , salesmanager143 , salesmanager144 , salesmanager145

Password:UserUser123

Store manager or sales manager should be able to login succesfully.

3
Verify that Fleet category is displayed on the page.

As a manager I should be able to see Fleet category

4
Verify there is a Vehicles option under the Fleet and click it.

As a manager I should be able to see and click it.

5
Verify that create car button is displayed on the page and click it.

As a manager I should be able to see and click it.

6
Verify that cancel button display and works.

As a manager I should be able to cancel.

7
click the create car button again fill the blanks with car information .

As a manager I should be able to fill the blanks.

8
Verify that vehicle model add button is displayed and works

As a manager I should be able add vehicle model

9
Verify that vehicle Make add button is displayed and works

As a manager I should be able use vehicle make option

10
Click the save and close button and Verify that you can see new car in the list.

As a manager I should be able see new car in the list
         */
        loginPage=new LoginPage();
        dashboardPage=new DashboardPage();
        actions=new Actions(Driver.getDriver());
        vehiclesPage=new VehiclesPage();

        for (String each:UsersUtilities.authorizedUsers() ) {

            loginPage.login(each,UsersUtilities.password() );

            actions.moveToElement(dashboardPage.fleetModule).perform();
            dashboardPage.vehiclesButton.click();

            Thread.sleep(1000);
            System.out.println(Driver.getDriver().getTitle());
            Assert.assertTrue(Driver.getDriver().getTitle().contains("Car"));

            Thread.sleep(3000);
            vehiclesPage.createCarButton.click();
            Thread.sleep(3000);
            vehiclesPage.cancelCarButton.click();
            Thread.sleep(3000);
            vehiclesPage.createCarButton.click();
            vehiclesPage.inputLicense.sendKeys("NY47");
            vehiclesPage.saveAndCloseButton.click();


            WebElement logout=Driver.getDriver().findElement(By.xpath("//li[@class='dropdown user-menu-dropdown']/a"));
            Thread.sleep(1000);
            logout.click();
            Driver.getDriver().findElement(By.xpath("//a[@href='/user/logout']")).click();


        }
    }
}
