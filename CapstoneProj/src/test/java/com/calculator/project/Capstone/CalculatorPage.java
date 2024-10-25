package com.calculator.project.Capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
	
	@FindBy(id="calculated-display")
	private WebElement value;
	
	@FindBy(id="button01")
	private WebElement one;
	
	@FindBy(id="button02")
	private WebElement two;
	
	@FindBy(id="button03")
	private WebElement three;
	
	@FindBy(id="button04")
	private WebElement four;
	
	@FindBy(id="button05")
	private WebElement five;
	
	@FindBy(id="button06")
	private WebElement six;
	
	@FindBy(id="button07")
	private WebElement seven;
	
	@FindBy(id="button08")
	private WebElement eight;
	
	@FindBy(id="button09")
	private WebElement nine;
	
	@FindBy(id="button00")
	private WebElement zero;
	
	@FindBy(id="buttondot")
	private WebElement dot;
	
	@FindBy(id="buttonplus")
	private WebElement plus;
	
	@FindBy(id="buttonminus")
	private WebElement minus;
	
	@FindBy(id="buttonmultiply")
	private WebElement multiply;
	
	@FindBy(id="buttondivide")
	private WebElement divide;
	
	@FindBy(id="buttonequals")
	private WebElement equals;
	
	@FindBy(id="buttonallclear")
	private WebElement allClear;
	
	@FindBy(id="buttonclearentry")
	private WebElement clearEntry;
	
	@FindBy(id="buttonmemoryplus")
	private WebElement memoryplus;
	
	@FindBy(id="buttonmemoryrecall")
	private WebElement memoryRecall;
	
	@FindBy(id="buttonmemoryin")
	private WebElement memoryIn;
	
	public CalculatorPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void number1() throws InterruptedException
	{
		one.click();
		
	}
	
	public void number2() throws InterruptedException
	{
		two.click();
		
	}
	public void number3() throws InterruptedException
	{
		three.click();
		
	}
	public void number4() throws InterruptedException
	{
		four.click();
		
	}
	public void number5() throws InterruptedException
	{
		five.click();
		
	}
	public void number6() throws InterruptedException
	{
		six.click();
		
	}
	public void number7() throws InterruptedException
	{
		seven.click();
		
	}
	public void number8() throws InterruptedException
	{
		eight.click();
		
	}
	public void number9() throws InterruptedException
	{
		nine.click();
		
	}
	public void number0() throws InterruptedException
	{
		zero.click();
		
	}
	public void clickdot() throws InterruptedException
	{
		dot.click();
		
	}
	public void clickplus() throws InterruptedException
	{
		plus.click();
		
	}
	public void clickminus() throws InterruptedException
	{
		minus.click();
		
	}
	public void clickmul() throws InterruptedException
	{
		multiply.click();
		
	}
	public void clickdiv() throws InterruptedException
	{
		divide.click();
		
	}
	public void clickEquals() throws InterruptedException
	{
		equals.click();
		
	}
	public void clickAllClear() throws InterruptedException
	{
		allClear.click();
		
	}
	public void clickclearEntry() throws InterruptedException
	{
		clearEntry.click();
		
	}
	public void clickmemoryplus() throws InterruptedException
	{
		memoryplus.click();
		
	}
	public void clickmemoryRecall() throws InterruptedException
	{
		memoryRecall.click();
		
	}
	public void clickmemoryIn() throws InterruptedException
	{
		memoryIn.click();
		
	}
	
	public String getCalculatedValue()
	{
		String calValue=value.getText();
		System.out.println(value.getTagName());
		return calValue;
	}

}

