package com.Practice.SeliniumTest;

import org.testng.annotations.Test;

public class mainClass extends BaseClass{
	
	@Test
	public void testLogin() throws InterruptedException
	{
		
		loginPage lp = new loginPage(driver);
		Thread.sleep(5000);
		
		lp.login("sumanajois", "test@suktha");
		Thread.sleep(5000);

		
	}
	@Test(priority=1)
	public void masterclick() throws InterruptedException 
	{
		
		homePage hp= new homePage(driver);
		Thread.sleep(5000);
		hp.Mastertab();
	}
	

	
	
	

}
