package com.Skillio.base;

import org.testng.annotations.BeforeMethod;
import static com.Skillio.base.Keyword.*;

public class TestBase {
	
	@BeforeMethod
	
	public void lanchBrowser() {
		openBrowserName("chrome");
		launchurl("https://www.goibibo.com/");
		
	}

}
