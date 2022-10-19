package com.mindtree.ReusableComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mindtree.Runner.Runner;
import com.mindtree.Utilities.ConfigPropertyReader;

public class Helper {

	WebDriver driver=null;
	ConfigPropertyReader reader = new ConfigPropertyReader();
	public WebDriver getBrowser() {
		System.out.println(reader.getDriverPath());
		System.setProperty("webdriver.chrome.driver",reader.getDriverPath() );
		driver=new ChromeDriver();
		System.out.println("Hello");
		return driver;
	}
	
	public void openURL() {
		Runner.driver.get(reader.getURL());
	}
	
}
