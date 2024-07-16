package com.serv.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SL_CheckoutCustDetails {
	public static WebElement element = null;
	
	public static WebElement Input_Firstname(WebDriver driver) 
	{
		element = driver.findElement(By.xpath("//*[@id='first-name']"));
		return element;
	}
	public static WebElement Input_Lastname(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='last-name']"));
		return element;
	}
	public static WebElement Input_Postal(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='postal-code']"));
		return element;
	}
	public static WebElement Continue(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='continue']"));
		return element;
	}
	
	public static void FirstName(WebDriver driver, String firstname)
	{
		SL_CheckoutCustDetails.Input_Firstname(driver).click();
		SL_CheckoutCustDetails.Input_Firstname(driver).clear();
		SL_CheckoutCustDetails.Input_Firstname(driver).click();
		SL_CheckoutCustDetails.Input_Firstname(driver).sendKeys(firstname);
	}	
	public static void LastName(WebDriver driver, String lastname)
	{
		SL_CheckoutCustDetails.Input_Lastname(driver).click();
		SL_CheckoutCustDetails.Input_Lastname(driver).clear();
		SL_CheckoutCustDetails.Input_Lastname(driver).click();
		SL_CheckoutCustDetails.Input_Lastname(driver).sendKeys(lastname);
	}	
	public static void Postal(WebDriver driver, String postal)
	{
		SL_CheckoutCustDetails.Input_Postal(driver).click();
		SL_CheckoutCustDetails.Input_Postal(driver).clear();
		SL_CheckoutCustDetails.Input_Postal(driver).click();
		SL_CheckoutCustDetails.Input_Postal(driver).sendKeys(postal);	
	}
	public static void submit(WebDriver driver) 
	{
		SL_CheckoutCustDetails.Continue(driver).click();
	}
	public void SubmitDetails(WebDriver driver, String firstname, String lastname, String postal)
	{
		SL_CheckoutCustDetails.FirstName(driver,firstname);
		SL_CheckoutCustDetails.LastName(driver,lastname);
		SL_CheckoutCustDetails.Postal(driver,postal);
		SL_CheckoutCustDetails.submit(driver);
	}
}
