package com.serv.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SL_Product {
	public static WebElement element = null;
	
	public static WebElement AddToCart(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id='add-to-cart']"));
		return element;
	}
	public static WebElement Cart(WebDriver driver)
	{
		element = driver.findElement(By.className("shopping_cart_link")); 
		return element;
	}
	public void chooseProduct(WebDriver driver)
	{
		SL_Product.AddToCart(driver).click();
	}
	public void NavigateToCart(WebDriver driver)
	{
		SL_Product.Cart(driver).click();
	}
}
