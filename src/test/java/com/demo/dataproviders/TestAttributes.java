package com.demo.dataproviders;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAttributes {

	
	//@Test (timeOut=2000)
	@Test(expectedExceptions = {NoSuchElementException.class})
	public  void  testmethod1()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/");
	driver.findElement(By.id("abc")).click();
	driver.manage().window().maximize();
	driver.quit();
	
		

	}

}
