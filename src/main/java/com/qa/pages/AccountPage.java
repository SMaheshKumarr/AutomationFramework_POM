package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.constants.WebConstant;
import com.qa.utils.ElementUtil;

public class AccountPage {
	
	private WebDriver driver;
	private ElementUtil eUtil;
	
	By headers=By.xpath("//h2");
	By search = By.xpath("//input[@name='search']");

	public AccountPage(WebDriver driver) {
		this.driver=driver;
		eUtil=new ElementUtil(driver);
	}

	
	public String getAccountPageTitle() {
		String accountPageTitle = eUtil.waitForTitle(WebConstant.WAIT_MIN_TIMEOUT, WebConstant.ACCOUNT_PAGE_TITLE);
		System.out.println("Account Page Title:" + accountPageTitle);
		return accountPageTitle;
	}
	
	public String getAccountPageUrl() {
		String accountPageUrl = eUtil.waitForUrl(WebConstant.WAIT_MIN_TIMEOUT, WebConstant.ACCCOUNT_PAGE_PATH_URL);
		System.out.println("Acc Page Url:"+accountPageUrl);
		return accountPageUrl;
	}
	
	public List<String> acccHeaderLinks() {
		List<WebElement> headerValues = eUtil.waitForElementsVisible(headers, WebConstant.WAIT_MEDIUM_TIMEOUT);
		List<String> al=new ArrayList<String>();
		for(WebElement e:headerValues) {
			String headerText = e.getText();
			//System.out.println("Headers:"+headerText);
			al.add(headerText);
		}
		return al;
	}
	
	public boolean verifySearchExist() {
		return eUtil.waitForElementVisible(search, WebConstant.WAIT_MEDIUM_TIMEOUT).isDisplayed();
	}
}
