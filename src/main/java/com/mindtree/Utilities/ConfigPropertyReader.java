package com.mindtree.Utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropertyReader {
	
	Properties property;
	

	public ConfigPropertyReader(){
		// TODO Auto-generated constructor stub
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("./testdata/configuration.properties"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.setProperty("org.freemarker.loggerLibrary", "none");
		try {
			property=new Properties();
			property.load(reader);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public String getDriverPath() {
		
		String path="C:\\Driver\\chromedriver.exe";
		System.out.println(path +"Hello Boss");
		return path;
	}
	
	public String getBrowserName() {
		String bname=property.getProperty("browser");
		return bname;
	}
	
	public String getURL() {
		String url=property.getProperty("url");
		return url;
	}
	
	
	
	
}
