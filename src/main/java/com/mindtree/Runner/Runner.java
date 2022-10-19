package com.mindtree.Runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mindtree.ReusableComponents.Helper;

public class Runner {

	public static WebDriver driver;
	Helper help = new Helper();
	
	@Test
	void beforeSuite() {
		driver=help.getBrowser();
		help.openURL();
	}
	
	
}
