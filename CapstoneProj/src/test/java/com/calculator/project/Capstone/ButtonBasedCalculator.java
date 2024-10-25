package com.calculator.project.Capstone;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ButtonBasedCalculator {
	private WebDriver driver;
	private String baseURL;
	
	@DataProvider(name="inputValues")
	public static Object[][] val()
	{
		return new Object[][] {
			{"1234+5687="}
			
		};
	}
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		baseURL="https://testpages.herokuapp.com/styled/apps/calculator.html";
		
	}
  @Test(dataProvider="inputValues")
  public void calculator(String ip) throws InterruptedException {
	  driver.get(baseURL);
	  CalculatorPage cp = new CalculatorPage(driver);
	  Calculations cal = new Calculations();
	 cal.performClickonCalculator(ip,cp);
	System.out.println("completed operation");
	 
	   
  }
  
  @AfterMethod
  public void cleanup()
  {
	  driver.quit();
  }
}