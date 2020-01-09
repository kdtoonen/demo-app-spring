package com.bluemorphost.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    InputStream inputStream;

    public void PropertyReader(){

    }

    private String getProperty(String propertyName) throws IOException {
        Properties prop = new Properties();
        try {

            String propFileName = "testconfig.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return prop.getProperty(propertyName);
    }

    public String getPropertyValue(String propertyName){
        String returnValue = "value not found";
        try {
            returnValue = getProperty(propertyName);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return returnValue;
    }
}