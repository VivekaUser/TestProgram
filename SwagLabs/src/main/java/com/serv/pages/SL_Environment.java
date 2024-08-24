package com.serv.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SL_Environment {

	WebDriver driver;
	
	public void InitializeWeb() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\viveka.s\\OneDrive - HCL TECHNOLOGIES LIMITED\\Desktop\\TrainingSDET\\AspireLearningJourney_Training\\chromedriver_V125\\chromedriver_V125\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void NavigateToSite(String url)
	{
		//driver.get("https://www.saucedemo.com/");
		driver.get(url);
	}
	public WebDriver webdriverCall() {
		return driver;
	}
}
