package com.serv.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SL_LeftNavigation {
	
	public static Actions action;
	public static WebElement element = null;
	
	public static WebElement menuButton(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
		return element;
	}	
	public static WebElement btn_logout(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
		return element;
	}
	public static WebElement close(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='react-burger-cross-btn']"));
		return element;
	}

	public static WebElement about(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='about_sidebar_link']"));
		return element;
	}
	public static WebElement resetAppStore(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='reset_sidebar_link']"));
		return element;
	}
	public static WebElement allItems(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='inventory_sidebar_link']"));
		return element;
	}
	public void openMenu(WebDriver driver)
	{
		SL_LeftNavigation.menuButton(driver).click();
	}
	public void Logout(WebDriver driver)
	{
		SL_LeftNavigation.btn_logout(driver).click();
	}
	public void About(WebDriver driver)
	{
		SL_LeftNavigation.menuButton(driver).click();
		SL_LeftNavigation.about(driver).click();
	}
	public void ResetAppState(WebDriver driver)
	{
		SL_LeftNavigation.menuButton(driver).click();
		SL_LeftNavigation.resetAppStore(driver).click();
	}
	public void AllItems(WebDriver driver)
	{
		SL_LeftNavigation.menuButton(driver).click();
		SL_LeftNavigation.allItems(driver).click();
	}
	public void Close(WebDriver driver)
	{
		SL_LeftNavigation.close(driver).click();
	}
}