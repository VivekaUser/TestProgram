package com.serv.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SL_CheckoutOverview {
	public static WebElement element = null;
	
	public static WebElement finish(WebDriver driver)
	{
		//element = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
		element = driver.findElement(By.xpath("//*[@id='finish']"));
		return element;
	}
	public static WebElement BillID(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[2]"));
		return element;
	}
	public static WebElement shipping(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[4]"));
		return element;
	}
	public static WebElement BillAmount(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[8]"));
		return element;
	}
	public void Finish(WebDriver driver)
	{
		SL_CheckoutOverview.finish(driver).click();
	}
	public void getPaymentDetails(WebDriver driver)
	{
		String text = SL_CheckoutOverview.BillID(driver).getText();
		String Bill = text.replaceAll("[^0-9]", "");
		System.out.println(" *** Bill Id: SauceCard #"+Bill+" *** ");
	}
	public void getShipping(WebDriver driver)
	{
		String vendor = SL_CheckoutOverview.shipping(driver).getText();
		System.out.println(" *** Vendor is: "+vendor+" *** ");
	}
	public void getTotalAmount(WebDriver driver)
	{
		String TotalAmount = SL_CheckoutOverview.BillAmount(driver).getText();
		String Total = TotalAmount.replaceAll("[^0-9]", "");
		System.out.println(" *** Total: $"+Total+" *** ");
	}
}
