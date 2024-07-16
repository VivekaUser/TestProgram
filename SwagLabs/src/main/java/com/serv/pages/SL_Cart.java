package com.serv.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SL_Cart {
	public static WebElement element = null;
	public static List<WebElement> list = null;
	
	public static WebElement checkout(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='checkout']"));
		return element;
	}
	public static WebElement itemName(WebDriver driver, String name)
	{
		element = driver.findElement(By.partialLinkText(name));
		return element;
	}
	public void Printname(WebDriver driver)
	{
		for(int i=0; i<SL_Cart.list.size(); i++) {
			String str = SL_Cart.list.get(i).getText();
			System.out.println("Text is: " + str);
		}
	}
	public void Checkout(WebDriver driver)
	{
		SL_Cart.checkout(driver).click();
	}
	public static WebElement Quantity(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[1]"));
		return element;
	}
	
	public static WebElement Prices(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[2]/div[2]/div"));
		return element;
	}
	public void verifyDetails(WebDriver driver, String product) {
		// TODO Auto-generated method stub
		if(driver.getPageSource().contains(product))
		{
			System.out.println("* Selected Product Details- "+product+" ");
		}
		String prc, qnty;
		prc = SL_Cart.Prices(driver).getText();
		System.out.println("* Price- "+prc+" ");
		qnty = SL_Cart.Quantity(driver).getText();
		System.out.println("* Quantity- "+qnty+" ");
	}
}