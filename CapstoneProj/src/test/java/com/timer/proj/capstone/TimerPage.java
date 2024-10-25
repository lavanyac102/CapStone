package com.timer.proj.capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimerPage {
	@FindBy(id="timer-seconds")
	private WebElement timerSeconds;
	
	@FindBy(id="reset-timer")
	private WebElement resetTimer;
	
	@FindBy(id="start-timer")
	private WebElement startTimer;

	@FindBy(id="stop-timer")
	private WebElement stopTimer;
	
	@FindBy(id="clear-timer")
	private WebElement clearTimer;
	
	@FindBy(id="javascript_countdown_time")
	private WebElement countDownTime;
	
public TimerPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickStartTimer()
{
	startTimer.click();
}

public void clickStopTimer()
{
	stopTimer.click();
}

public void clickClearTimer()
{
	clearTimer.click();
}

public void clickResetTimer()
{
	resetTimer.click();
}

public void getCountdownTime()
{
	System.out.println("Count down time = "+countDownTime.getText());
}

public void enterTimeInSeconds(String time)
{
	timerSeconds.clear();
	timerSeconds.sendKeys(time);
}
}
