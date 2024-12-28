package com.GroupId.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private static String defaultConfigFile = "./Config.properties";
	 static Properties properties;
	 static boolean isLoaded = false;
	
	public ConfigFileReader() {
		// TODO Auto-generated constructor stub
	}
	
	public static void loader(String propertyFilePath) {
		properties = new Properties();
		if(!isLoaded) {
			try (FileInputStream fis = new FileInputStream(propertyFilePath)) {
	            properties.load(fis);
	            isLoaded = true;
	        } catch (IOException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Failed to load config.properties file.");
	        }
		}
	}
	
	public static String getProperty(String propertyFilePath,String property) {
		loader(propertyFilePath);
	    return properties.getProperty(property);
        
	}
	
	public static String getProperty(String property) {
		if(!isLoaded)
		return getProperty(defaultConfigFile,property);
		else {
			return properties.getProperty(property);
		}
	}
	
}
