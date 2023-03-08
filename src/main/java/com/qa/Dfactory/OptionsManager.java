package com.qa.Dfactory;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariOptions;

public class OptionsManager {
	
	private Properties prop;
	private ChromeOptions co;
	private FirefoxOptions fo;
	private SafariOptions so;
	private EdgeOptions eo;
	
	public OptionsManager(Properties prop) {
		this.prop=prop;
	}
	
	
	public ChromeOptions getChromeOptions() {
		
		co=new ChromeOptions();
		
		if(Boolean.parseBoolean(prop.getProperty("headless").trim())) {
			System.out.println("Running Browser in Headless");
			co.addArguments("--headless");
		}
		
		if(Boolean.parseBoolean(prop.getProperty("incognito").trim())) {
			System.out.println("Running Browser in incognito");
			co.addArguments("--incognito");
		}
		return co;
	}
	
	public FirefoxOptions getFirefoxOptions() {
		fo=new FirefoxOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless").trim())) {
			System.out.println("Running Browser in Headless");
			co.addArguments("--headless");
		}
		if(Boolean.parseBoolean(prop.getProperty("incognito").trim())) {
			System.out.println("Running Browser in incognito");
			co.addArguments("--incognito");
		}
		return fo;
	}
	
	public SafariOptions getSafariOptions() {
		so=new SafariOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless").trim())) co.addArguments("--headless");
		if(Boolean.parseBoolean(prop.getProperty("incognito").trim())) co.addArguments("--incognito");
		return so;
	}
	
	public EdgeOptions getEdgeOptions() {
		eo=new EdgeOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless").trim())) co.addArguments("--headless");
		if(Boolean.parseBoolean(prop.getProperty("incognito").trim())) co.addArguments("--incognito");
		return eo;
	}

}
