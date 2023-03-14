package com.demo.dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest5 {
	
	WebDriver driver;

	@Test(dataProvider="getdata",dataProviderClass= ExcelDataSupplier.class)
	public void login (String username,String password) throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(5000);
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys(password);
			 WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
			 Actions a = new Actions(driver);
		     a.moveToElement(login).click().build().perform();
			 Thread.sleep(5000);
			 driver.quit();
			
	}

}
