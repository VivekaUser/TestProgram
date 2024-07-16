package com.serv.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SL_Inventory {
	public static WebElement element = null;
	public static WebElement element2 = null;
	public static JavascriptExecutor js = null;
	
	public void filterSortBy(WebDriver driver, String index)
	{
		element = driver.findElement(By.xpath("//*[@class='product_sort_container']"));
		Select efilter = new Select(element);
		efilter.selectByValue(index); 
	}
	public static WebElement chooseProduct(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']"));
		return element;
		//use & replace by $$
		//*[@id="add-to-cart-sauce-labs-fleece-jacket"]
	}
	public static WebElement chooseItem(WebDriver driver,String item)
	{
		element = driver.findElement(By.partialLinkText(item));
		return element;
		//use & replace by $$
		//*[@id="add-to-cart-sauce-labs-fleece-jacket"]
	}
	public static WebElement Cart(WebDriver driver)
	{
		element = driver.findElement(By.className("shopping_cart_link"));
		return element;
	}
	public void scrollPage(WebDriver driver)
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1200));
	}
	public void Product(WebDriver driver, String item) {
		SL_Inventory.chooseItem(driver, item).click();		
	}
	public void selectProduct(WebDriver driver)
	{
		SL_Inventory.chooseProduct(driver).click();
	}	
	public void NavigateToCart(WebDriver driver)
	{
		SL_Inventory.Cart(driver).click();
	}
}
