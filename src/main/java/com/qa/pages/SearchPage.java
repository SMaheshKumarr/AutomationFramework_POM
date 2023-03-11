package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.constants.WebConstant;
import com.qa.utils.ElementUtil;

public class SearchPage {
	
	private WebDriver driver;
	private ElementUtil eUtil;
	
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		eUtil=new ElementUtil(driver);
	}
	
	public void selectProduct(String productName) {
		By productLocator = By.linkText(productName);
		eUtil.waitForElementsVisible(productLocator, WebConstant.WAIT_MEDIUM_TIMEOUT);
	}

}
