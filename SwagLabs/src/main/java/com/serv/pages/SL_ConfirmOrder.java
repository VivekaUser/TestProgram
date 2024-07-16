package com.serv.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SL_ConfirmOrder {
	public static WebElement element = null;
	
	public static WebElement backHome(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='back-to-products']"));
		return element;
	}
	public void orderSuccess(WebDriver driver)
	{
		if(driver.getPageSource().contains("Thank you for your order!"))
		{
			System.out.println(" *** Order Booked Successfully *** ");
		}
	}
	public void getBackToHome(WebDriver driver)
	{
		SL_ConfirmOrder.backHome(driver).click();
	}
	
}
