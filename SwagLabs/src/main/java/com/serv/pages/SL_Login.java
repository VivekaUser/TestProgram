package com.serv.pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SL_Login{ // extends BasePage{
	public static WebElement element = null;
	//public static WebElement element = driver.findElement(By.name("user-name"));

	public static WebElement login_username(WebDriver driver)
	{
		element = driver.findElement(By.name("user-name"));
		return element;
	}
	
	public static WebElement login_password(WebDriver driver)
	{
		element = driver.findElement(By.name("password"));
		return element;
	}
	public static WebElement login_button(WebDriver driver)
	{
		element = driver.findElement(By.name("login-button"));
		return element;
	}
	public void SL_LoginTest(WebDriver driver, String username, String password) {	
		SL_Login.login_username(driver).clear();
		SL_Login.login_username(driver).click();
		SL_Login.login_username(driver).sendKeys(username);
		SL_Login.login_password(driver).clear();
		SL_Login.login_password(driver).click();
		SL_Login.login_password(driver).sendKeys(password);
		SL_Login.login_button(driver).submit();
	}
	public void SL_LoginTest1(Map<String, String> testData,WebDriver driver) {
		String username = testData.get("Username");
		String password = testData.get("Password");
		System.out.println("\nUsername: "+username+"\nPassword: "+password+" \n");
		SL_Login.login_username(driver).clear();
		SL_Login.login_username(driver).click();
		SL_Login.login_username(driver).sendKeys(username);
		SL_Login.login_password(driver).clear();
		SL_Login.login_password(driver).click();
		SL_Login.login_password(driver).sendKeys(password);
		SL_Login.login_button(driver).submit();
	}
}

/*
String methodName1 = Thread.currentThread().getStackTrace()[2].getMethodName();
System.out.println("Method1: "+methodName1);
*/