package com.popups.proj.Capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupPage {
	
	@FindBy(id="button1")
	private WebElement javaScriptAlertButton;
	
	@FindBy(id="button2")
	private WebElement modalPopupButton;
	
	@FindBy(xpath="//a[@href='../Ajax-Loader/index.html']")
	private WebElement ajaxLoaderButton;
	
	@FindBy(id="button4")
	private WebElement javaScriptConfirmationButton;
	
	public PopupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickjavaScriptAlertButton()
	{
		javaScriptAlertButton.click();
		
	}
	
	public void clickmodalPopupButton()
	{
		modalPopupButton.click();
	}
	
	public void clickajaxLoaderButton()
	{
		ajaxLoaderButton.click();
	}
	
	public void clickjavaScriptConfirmationButton()
	{
		javaScriptConfirmationButton.click();
	}
	

}