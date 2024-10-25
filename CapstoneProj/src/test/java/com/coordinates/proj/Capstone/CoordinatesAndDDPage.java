package com.coordinates.proj.Capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoordinatesAndDDPage {
	
	private Select sc;
	
	@FindBy(id="xnum")
	private WebElement xCoordinate;
	
	@FindBy(id="ynum")
	private WebElement yCoordinate;
	
	@FindBy(id="shapesize")
	private WebElement shapesize;
	
	@FindBy(id="colourselect")
	private WebElement color;
	
	@FindBy(id="shapeselect")
	private WebElement shape;
	
	@FindBy(name="gobutton")
	private WebElement showButton;
	
	@FindBy(id="colourselect")
	private WebElement clearButton;
	
	
	
	public CoordinatesAndDDPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void xCoord(String x)
	{
		xCoordinate.clear();
		xCoordinate.sendKeys(x);
	}
	
	public void yCoord(String y)
	{
		yCoordinate.clear();
		yCoordinate.sendKeys(y);
	}
	
	public void size(String si)
	{
		shapesize.clear();
		shapesize.sendKeys(si);
	}
	
	public void selectColor(String col)
	{
		sc= new Select(color);
		sc.selectByVisibleText(col);
	}
	
	public void shapeSelect(String shap)
	{
		sc= new Select(shape);
		sc.selectByVisibleText(shap);
	}
	
	public void clickOnShowButtom()
	{
		showButton.click();
	}
	
	public void clickOnClearButtom()
	{
		clearButton.click();
	}
}

