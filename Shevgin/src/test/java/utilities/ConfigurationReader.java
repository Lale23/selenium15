package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- we created properties object

    //2- get the path and store in String, or directly pass into fileInputStream obj
    //3- we need to open the file
    //4- we need to load the file
    //5- close.file

    private static Properties properties=new Properties();

    static {
        String path="configuration.properties"; // store path

        try {
            FileInputStream file=new FileInputStream(path); // open the file
            properties.load(file); // load the file

            file.close();

        }catch (FileNotFoundException e){
            System.out.println("Properties file not found");
        }catch (IOException e){
            System.out.println("file cannot be loaded.");
        }
    }

    //Our own custom method to read and get values from configuration.properties file
    public static String getProperty(String keyWord){ // it will take the string
        return properties.getProperty(keyWord); // it will sent it to properties file and return what is assign there.
    }
}
