package com.alert.proj.Capstone;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AlertDemo {
	
	private WebDriver driver;
	private String baseURL;
	
	@DataProvider(name="alert")
	public static Object[][] val()
	{
		return new Object[][] {
			{"Lavanya","Lavanya"}
		};
	}
	
	@BeforeMethod
	  public void beforeMethod() {
		  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			baseURL="https://webdriveruniversity.com/Login-Portal/index.html";
	  }
  @Test(dataProvider="alert")
  public void handleAlert(String un, String pwd) {
	  driver.get(baseURL);
	  LoginPage lp = new LoginPage(driver);
	  lp.enterUserName(un);
	  lp.enterPassword(pwd);
	  lp.clickLogin();
	  try {
		  Alert a=driver.switchTo().alert();
		  a.accept();
	  }
	  catch(NoAlertPresentException e)
	  {
		  e.printStackTrace();
	  }
	  
	  System.out.println("mission successful");
	  
	  
	  
  }
}
