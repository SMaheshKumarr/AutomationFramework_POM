package com.qa.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.constants.WebConstant;

public class AccountPageTest extends BaseTest{
	
	@BeforeClass
	public void accPageSetup() {
		 objAccountPage = objLoginPage.doLogin("mahesh@test.com", "testaccount");
	}
	
	@Test
	public void verifyAccPageTitle() {
		String AccPageTit = objAccountPage.getAccountPageTitle();
		Assert.assertEquals(AccPageTit, WebConstant.ACCOUNT_PAGE_TITLE);
	}
	
	@Test
	public void verifyAccUrl() {
		String AccPageUrl = objAccountPage.getAccountPageUrl();
		Assert.assertTrue(AccPageUrl.contains(WebConstant.ACCCOUNT_PAGE_PATH_URL));
	}

	@Test
	public void accPageHeadersTest() {
		List<String> actualHeaderResult = objAccountPage.acccHeaderLinks();
		System.out.println(actualHeaderResult);
		Assert.assertEquals(actualHeaderResult.size(), 4);
	}
}
