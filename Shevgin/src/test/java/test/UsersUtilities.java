package test;

import utilities.ConfigurationReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersUtilities {


    public static List<String> authorizedUsers() {
        List<String> authorizedNames=new ArrayList<>();

        authorizedNames.addAll(
                Arrays.asList(ConfigurationReader.getProperty("storeManager_username1"),
                        ConfigurationReader.getProperty("storeManager_username2"),
                        ConfigurationReader.getProperty("salesManager_username1"),
                        ConfigurationReader.getProperty("salesManager_username2"),
                        ConfigurationReader.getProperty("salesManager_username3") ) );

        String password=ConfigurationReader.getProperty("vytrack_password");

        return authorizedNames;

    }
    public static List<String> nonAuthorizedUsers() {

        List<String> nonAuthorizedNames=new ArrayList<>();
        nonAuthorizedNames.addAll(
                Arrays.asList(ConfigurationReader.getProperty("truckDriver_username1"),
                        ConfigurationReader.getProperty("truckDriver_username2"),
                        ConfigurationReader.getProperty("truckDriver_username3") ) );

        String password=ConfigurationReader.getProperty("vytrack_password");

        return nonAuthorizedNames;
    }
    public static String password() {

        String password=ConfigurationReader.getProperty("vytrack_password");

        return password;
    }


}
