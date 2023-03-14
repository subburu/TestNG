package com.demo.testNG;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test 
	public void openGoogle() throws InterruptedException {

		// Hard Assert
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Testing", Keys.ENTER);
		String expectedtile = "Testing - Google Search";
		String actualtitle = driver.getTitle();
		System.out.println(driver.getTitle());
		// import static org.testng.Assert.*; import static so we no need to use
		// Assert.assertEquals(expectedtile, actualtitle,"Verify Title");
		assertEquals(expectedtile, actualtitle, "Verify Title");
		/*
		 * assertEquals("test", "test"); assertNotEquals("test", "test1");
		 * assertTrue(true); assertFalse(false); assertNull(driver);
		 * assertNotNull(driver);
		 */

		Thread.sleep(5000);
		driver.quit();

	}

	@Test
	public void faceBookLogin() throws InterruptedException {
     // Soft Assert
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Testing", Keys.ENTER);
		String expectedtile = "Testing - Google Search";
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		//  Soft Asssert Creation 
		 SoftAssert softAssert=new SoftAssert();
		 

		// Title Assertion
		String actualTitle = driver.getTitle();
		String execptedTitle = "Log in to Facebook";
		softAssert.assertEquals(actualTitle, execptedTitle, "verify Title");

		// URL Assertion
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		String execptedURL = "https://www.facebook.com/login/?\"";
		softAssert.assertNotEquals(actualURL, execptedURL, "verify url");

		

		//Border Assertion  // Converting Hex to RGB to get the validation of color
		String actualborder = driver.findElement(By.name("email")).getCssValue("border");
		String execptedborder= "1px solid rgb(240, 40, 73)";
		softAssert.assertEquals(actualborder, execptedborder, "verify border");
		
		//Error Message -- Xpath using last method
		String actualMsg = driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String execptedMsg= "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		softAssert.assertEquals(actualMsg, execptedMsg, "verify message");
		
		// it will not throw exception if all assertions are passed
		softAssert.assertAll();
		
		
	}
	
	@Test (enabled=false)
	public class B {

	    @Test
	    public void btest1() {
	        System.out.println("B.btest1");
	    }

	}
}
