package com.coordinates.proj.Capstone;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CocodinatesAndDropDown {
	private WebDriver driver;
	private String baseURL;
	
	@DataProvider(name="coOrdinates")
	public static Object[][] val()
	{
		return new Object[][] {
			{"20","50","50","Green","Square"},
			{"150","150","80","Red","Circle"}
			
		};
	}
	 @Parameters("browserType")
  @BeforeMethod
  public void beforeMethod(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  driver = new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  driver = new FirefoxDriver();
	  }
	  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		baseURL="https://testpages.herokuapp.com/styled/canvas-javascript-test.html";
  }
  @Test(dataProvider="coOrdinates")
  public void dropdownandcoordinates(String x,String y, String size, String color, String shape) {
	  driver.get(baseURL);
	  CoordinatesAndDDPage cd = new CoordinatesAndDDPage(driver);
	 //cd.clickOnClearButtom();
	 cd.xCoord(x);
	 cd.yCoord(y);
	 cd.size(size);
	 cd.selectColor(color);
	 cd.shapeSelect(shape);
	 cd.clickOnShowButtom();
  }
  @AfterMethod
  public void afterMethod() {
	 driver.quit();
  }

}
