package com.alert.proj.Capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="text")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserName(String un)
	{
		userName.sendKeys(un);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
}
