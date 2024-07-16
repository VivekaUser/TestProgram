package com.serv.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.serv.TestData.*;
import com.serv.pages.*;
import com.serv.Methods.*;

public class SwagLabScenarios{
	public WebDriver driver;	
	@Test(dataProvider = "excelData_tc01", dataProviderClass = TestData.class)
	public void TestCredentials(String Username, String Password) 
	{
		ApplicationMethods am = new ApplicationMethods();
		SL_Environment envObject = new SL_Environment();
		envObject.InitializeWeb();
		envObject.NavigateToSite("https://www.saucedemo.com/");
		driver = envObject.webdriverCall();

		am.ThreadSleep(800); //commented by -Viveka(G00488)
		am.DisplayMethodName();
		SL_Login login_obj = new SL_Login();
		login_obj.SL_LoginTest(driver,Username,Password);
		//am.ThreadSleep(1000);
		if(driver.getPageSource().contains("Products")) 
		{
			System.out.println(" *** LOGIN SUCCESSFUL *** ");
			SL_LeftNavigation leftNav_Obj = new SL_LeftNavigation();
			leftNav_Obj.openMenu(driver);
			am.ThreadSleep(800);
			leftNav_Obj.Logout(driver);
		}
		else
		{
			System.out.println("-- CREDENTIALS ERROR --\nUsername: "+Username+"\nPassword: "+Password+"\n");
		}
		am.ThreadSleep(400);		
		driver.quit();	
	}	
	@Test(dataProvider = "excelData_tc02", dataProviderClass = TestData.class)
	public void verifyInventory(String Username, String Password, String filter, String product)
	{
		ApplicationMethods am = new ApplicationMethods();
		SL_Environment envObject = new SL_Environment();
		envObject.InitializeWeb();
		envObject.NavigateToSite("https://www.saucedemo.com/");
		driver = envObject.webdriverCall();
		
		am.ThreadSleep(800);
		am.DisplayMethodName();
		
		SL_Login login_obj = new SL_Login();
		login_obj.SL_LoginTest(driver,Username,Password);
		//am.ThreadSleep(800);
		
		SL_Inventory Inventory_Obj = new SL_Inventory();
		Inventory_Obj.filterSortBy(driver, filter);
		Inventory_Obj.scrollPage(driver);
		Inventory_Obj.Product(driver,product);
		//am.ThreadSleep(800);
		
		SL_Product product_Obj = new SL_Product();
		product_Obj.chooseProduct(driver);
		product_Obj.NavigateToCart(driver);
		//am.ThreadSleep(800);
		
		SL_Cart cart_Obj = new SL_Cart();
		cart_Obj.verifyDetails(driver, product);
		//am.ThreadSleep(1000);
		SL_LeftNavigation nav_obj = new SL_LeftNavigation();
		nav_obj.openMenu(driver);
		am.ThreadSleep(800);
		nav_obj.Logout(driver);
		am.ThreadSleep(400);
		driver.quit();
	}
	@Test(dataProvider = "excelData_tc03", dataProviderClass = TestData.class)
	public void bookOrder(String Username, String Password, String product, String firstname, String lastname, String postal) throws InterruptedException
	{
		ApplicationMethods am = new ApplicationMethods();
		SL_Environment envObject = new SL_Environment();
		envObject.InitializeWeb();
		envObject.NavigateToSite("https://www.saucedemo.com/");
		driver = envObject.webdriverCall();
		am.ThreadSleep(800);
		
		am.DisplayMethodName();
		SL_Login login_obj = new SL_Login();
		login_obj.SL_LoginTest(driver,Username,Password);
		//am.ThreadSleep(500);
		
		SL_Inventory Inventory_Obj = new SL_Inventory();
		Inventory_Obj.Product(driver,product);
		//am.ThreadSleep(800);
		
		SL_Product product_Obj = new SL_Product();
		product_Obj.chooseProduct(driver);
		product_Obj.NavigateToCart(driver);
		//am.ThreadSleep(800);
		
		SL_Cart cart_Obj = new SL_Cart();
		cart_Obj.verifyDetails(driver, product);
		cart_Obj.Checkout(driver);
		//am.ThreadSleep(800);
		
		SL_CheckoutCustDetails cust_Obj = new SL_CheckoutCustDetails();
		cust_Obj.SubmitDetails(driver,firstname,lastname,postal);
		//am.ThreadSleep(800);
		
		SL_CheckoutOverview checkout_Obj = new SL_CheckoutOverview();
		checkout_Obj.getPaymentDetails(driver);
		checkout_Obj.getShipping(driver);
		checkout_Obj.getTotalAmount(driver);
		checkout_Obj.Finish(driver);
		//am.ThreadSleep(800);
		
		SL_ConfirmOrder confirm_Obj = new SL_ConfirmOrder();
		confirm_Obj.orderSuccess(driver);
		confirm_Obj.getBackToHome(driver);
		//am.ThreadSleep(1000);
		
		SL_LeftNavigation nav_Obj = new SL_LeftNavigation();
		nav_Obj.openMenu(driver);
		am.ThreadSleep(800);
		nav_Obj.Logout(driver);
		am.ThreadSleep(400);
		driver.quit();
	}
}
