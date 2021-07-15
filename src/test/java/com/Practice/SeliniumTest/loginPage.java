package com.Practice.SeliniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage extends BaseClass{

//	public void login(String Username, String Password) {
//		driver.findElement(By.name("username")).sendKeys(Username);
//		driver.findElement(By.name("Password")).sendKeys(Password);
//	}

	WebDriver driver;

	public loginPage(WebDriver driver)

	{

		this.driver=driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//input[@id='mat-input-0']")
	private WebElement un;

	@FindBy(xpath="//input[@id='mat-input-1']")
	private WebElement  pwd;

	@FindBy(xpath="//span[text()='Login'] ")
	private WebElement loginbt;

	public void login(String Username, String Password)
	{
		un.sendKeys(Username);
		pwd.sendKeys(Password);
		loginbt.click();

	}
	public void VerifyLogin() {
	//testgit
	}


}
