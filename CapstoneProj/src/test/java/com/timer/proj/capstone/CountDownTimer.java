package com.timer.proj.capstone;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CountDownTimer {
	
	private WebDriver driver;
	private String baseURL;
	
	@DataProvider(name="timer")
	public static Object[][] val()
	{
		return new Object[][] {
			{"15"}
		};
	}
	
	@BeforeMethod
	  public void beforeMethod() {
		  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			baseURL="https://testpages.herokuapp.com/styled/javascript-countdown-test.html";
	  }
	
  @Test(dataProvider="timer")
  public void timer(String time) throws InterruptedException {
	  driver.get(baseURL);
	  TimerPage tp = new TimerPage(driver);
	  tp.enterTimeInSeconds(time);
	  Thread.sleep(2000);
	  tp.clickResetTimer();
	  tp.clickStartTimer();
	  try {
		  Alert a=driver.switchTo().alert();
		  a.accept();
	  }
	  catch(NoAlertPresentException e)
	  {
		  System.out.println("there is no alert");
	  }
	  tp.getCountdownTime();
	  

	  
  }
  
  @AfterMethod
  public void afterMethod() {
	//  driver.quit();
  }
}
