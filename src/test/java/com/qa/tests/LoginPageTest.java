package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.constants.WebConstant;

public class LoginPageTest extends BaseTest{
	
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String actualTitle = objLoginPage.getPageTitle();
		System.out.println("Login Page Title:" + actualTitle);
		Assert.assertEquals(actualTitle, WebConstant.LOGIN_PAGE_TITLE);
	}
	
	@Test(priority = 2)
	public void fPasswordLinkExistTest() {
		boolean linkexist = objLoginPage.verifyForPasswordLink();
		Assert.assertTrue(linkexist);
	}
	
	@Test(priority = 3)
	public void loginTest() {
		objLoginPage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim());
	}

}
