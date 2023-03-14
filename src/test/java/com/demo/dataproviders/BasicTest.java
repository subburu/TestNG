package com.demo.dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {
	
	WebDriver driver ;
	
	
	@Test(dataProvider="loginTestData")
	public void login (String username,String password) throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys(password);
			WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
			 Actions a = new Actions(driver);
		     a.moveToElement(login).click().build().perform();
			Thread.sleep(5000);
			driver.quit();
			
	}
	
	@DataProvider (parallel= true,name="loginTestData")
	public Object[][] loginData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="test123";
		data[1][1]="admin123";
		
		data[0][0]="stage";
		data[0][1]="admin111";
		data[1][0]="Testing124";
		data[1][1]="admin000";
		
		data[0][0]="Parallel";
		data[0][1]="admin222";
		data[1][0]="Testing000";
		data[1][1]="admin222";
		
		
		return data;
		
	}
	
	
	

}
