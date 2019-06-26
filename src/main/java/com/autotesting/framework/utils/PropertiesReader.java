package com.autotesting.framework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private static PropertiesReader propertiesReader;
    private static Properties properties;

    public static synchronized PropertiesReader getPropertiesReader() throws Exception{
        return (propertiesReader != null) ? propertiesReader : (propertiesReader = new PropertiesReader());
    }

    private PropertiesReader() throws IOException {
        synchronized (PropertiesReader.class) {
            if (propertiesReader != null) {
                throw new IllegalStateException();
            }
            properties = new Properties();
            String PATH_TO_PROPERTIES_FILE = "src//main//resources//config.properties";
            properties.load(new FileInputStream(new File(PATH_TO_PROPERTIES_FILE)));
        }
    }

    public static String getLogin() {
        return properties.getProperty("login");
    }

    public static String getWrongLogin() {
        return properties.getProperty("wrongLogin");
    }

    public static String getPassword() {
        return properties.getProperty("password");
    }

    public static String getWrongPassword() {
        return properties.getProperty("wrongPassword");
    }

    public static String getCurrentURL() {
        return properties.getProperty("url");
    }

    public static String getValidUserName() {
        return properties.getProperty("validUserName");
    }

    public static String getUsernameIsLessThan6() {
        return properties.getProperty("usernameIsLessThan6");
    }

    public static String getSpecialChar() {
        return properties.getProperty("specialChar");
    }

    public static String getCyrillicChar() {
        return properties.getProperty("cyrillicChar");
    }
}
