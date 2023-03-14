package com.demo.listeners;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners ({ITestListenerClass.class})
public class NewTest1 {
  @Test ()
  public void test4() {
	  System.out.println("test4");
	  Assert.assertTrue(false);
	  
  }
 

@Test (timeOut=100)
  public void test5() {
	  System.out.println("test5");
	  
  }
  @Test
  public void test6() {
	  System.out.println("test6");
	  
  }
}
