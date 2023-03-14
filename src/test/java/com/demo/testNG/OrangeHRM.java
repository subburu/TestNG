package com.demo.testNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OrangeHRM {
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void InitialiseBrowser(@Optional ("Chrome")String browserName)
	{
		switch(browserName.toLowerCase())
		{
		case "chrome":
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     break;
		case "firefox":
			 WebDriverManager.firefoxdriver().setup();
		     driver = new FirefoxDriver();
		     break;
		case "edge":
			 WebDriverManager.edgedriver().setup();
		     driver = new EdgeDriver();
		     break;
		     default:
		    	 System.err.println("InvalidBrowser Name");
		}
	   
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	
	@Parameters("url")
	@Test
	public void launchApp(String url) throws InterruptedException
	{
		
		driver.get(url);
		Thread.sleep(5000);
		
	}

	@Parameters({"userName" , "password"})
	@Test
	public void enterLoginDetails(String userName,String password) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(userName);
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(password);
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		 Actions a = new Actions(driver);
	     a.moveToElement(login).click().build().perform();
		Thread.sleep(5000);
	}
	
	@Test
	public void navigateToMyInfo()
	{
		driver.findElement(By.id("menu_pim_viewDetails")).click();		
		
	}
	
	@Test
	public void verifyMyInfo()
	{
		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
	
	}
	
	@Test
	public void verifyLogin() throws InterruptedException
	{
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		wait.until(ExpectedConditions.visibilityOf(element)); 
		assertTrue(element.isDisplayed());
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		
		
	}
	
}
