package com.Practice.SeliniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	WebDriver driver;

	public homePage(WebDriver driver)

	{

		this.driver=driver;

		PageFactory.initElements(driver, this); //Page Factory in Selenium is an inbuilt Page Object Model framework concept for Selenium WebDriver but it is very optimized. It is used for initialization of Page objects or to instantiate the Page object itself. It is also used to initialize Page class elements without using "FindElement/s."

	}
	

  @FindBy(xpath="//span[text()='Masters']")
  private WebElement master;
	
	
	
	@FindBy(xpath="//span[@ class='ng-star-inserted' and contains( text(), 'Transactions' )]")
	private WebElement transaction;
	
	@FindBy(xpath="//span[@ class='ng-star-inserted' and contains( text(), 'Accounts' )]")
	private WebElement rprt;
	
	@FindBy(xpath="//span[@ class='ng-star-inserted' and contains( text(), 'Reports' )]")
	private WebElement acnt;
	
	@FindBy(xpath="//span[ text() ='Party Master']")
	private WebElement partymaster;
	
	@FindBy(xpath="//span[ text() ='Service Master']")
	private WebElement servicemaster;
	
	@FindBy(xpath="//span[ text() ='Process Master']")
	private WebElement Processmaster;
	
	
	public void Mastertab() throws InterruptedException
	{
		//Thread.sleep(5000);
		master.click();
		Thread.sleep(5000);
	}

}
