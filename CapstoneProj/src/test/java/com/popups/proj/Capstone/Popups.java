package com.popups.proj.Capstone;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Popups {
	private WebDriver driver;
	private String baseURL;
	private Alert a;
	WebDriverWait wait;
	
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
			baseURL="https://webdriveruniversity.com/Popup-Alerts/index.html";
			
	  }
	
	  @AfterMethod
	  public void afterMethod()
	  {
		  driver.quit();
	  }
  @Test
  public void handleAlerts() throws InterruptedException {
	  driver.get(baseURL);
	  PopupPage pp = new PopupPage(driver);
	  pp.clickjavaScriptAlertButton();
	  try
	  {
		   a = driver.switchTo().alert();
		 System.out.println(a.getText());  
		 Thread.sleep(2000);
		 a.accept();
	  }
	  catch(NoAlertPresentException e)
	  {
		  e.printStackTrace();
	  }
	  pp.clickmodalPopupButton();
	  try
	  {
		   wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myModal")));
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@data-dismiss='modal' and @class='btn btn-default']")).click();
	  }
	  catch(NoAlertPresentException e)
	  {
		  e.printStackTrace();
	  }
  pp.clickjavaScriptConfirmationButton();
	  try
	  {
		   a = driver.switchTo().alert();
		 System.out.println(a.getText());  
		 Thread.sleep(2000);
		 a.dismiss();
	  }
	  catch(NoAlertPresentException e)
	  {
		  e.printStackTrace();
	  }
	  
	  pp.clickajaxLoaderButton();
	  try
	  {
		  SoftAssert sa = new SoftAssert();
		  WebElement loader=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //span[@id='button1']/p")));
		//  wait.until(ExpectedConditions.invisibilityOf(loader));
		  loader.click();
		  driver.findElement(By.xpath("//button[@data-dismiss='modal' and @class='btn btn-default']")).click();
		  Thread.sleep(2000);
		  System.out.println("handled Ajax loader");
		  driver.navigate().back();
	  }
	  catch(NoAlertPresentException e)
	  {
		  e.printStackTrace();
	  }
  }
}

