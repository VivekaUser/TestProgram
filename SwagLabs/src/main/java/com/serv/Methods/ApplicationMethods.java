package com.serv.Methods;

public class ApplicationMethods{

	public void DisplayMethodName()
	{
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println("  * * * * * * TestCase Name: " + methodName+" * * * * * * ");
	}
	public void ThreadSleep(int millisec) 
	{
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
