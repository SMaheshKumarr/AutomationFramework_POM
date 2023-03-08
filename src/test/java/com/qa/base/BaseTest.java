package com.qa.base;

import java.util.Properties;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.Dfactory.DriverFactory;
import com.qa.pages.AccountPage;
import com.qa.pages.LoginPage;

public class BaseTest {
	
	WebDriver driver;
	DriverFactory ObjDriverFactory;
	protected Properties prop;
	protected LoginPage objLoginPage;
	protected AccountPage objAccountPage;
	
	@BeforeTest
	public void setUp() {
		ObjDriverFactory = new DriverFactory();
		prop=ObjDriverFactory.initProp();
		driver=ObjDriverFactory.initDriver(prop);
		objLoginPage =  new LoginPage(driver);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
