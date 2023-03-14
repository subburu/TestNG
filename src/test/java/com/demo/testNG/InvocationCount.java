package com.demo.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCount {
	
	@Test (invocationCount=5 ,timeOut =10000,threadPoolSize = 2)
	public static void testmethod1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://randomuser.me/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		System.out.println("User name : " +driver.findElement(By.id("user_value")).getText());
		driver.quit();
		
		
		
	}

}
