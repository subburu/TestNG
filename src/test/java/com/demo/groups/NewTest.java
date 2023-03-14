package com.demo.groups;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test (groups={"all"})
public class NewTest {
	
  @Test (groups = {"sanity"})
  public void test1() {
	  System.out.println("Test1");
  }
  
  @Test (groups = {"smoke","regression","sanity","windows.regression"})
  public void test2() {
	  System.out.println("Test2");
  }
  
  
  @Test (groups = {"functional","sanity","windows.smoke"})
  public void test3() {
	  System.out.println("Test3");
  }
  // no group assigned but due to all at the class level this test case gets executed
  public void test4() {
	  System.out.println("Test4");
	  Assert.assertEquals(true, false);
	  SoftAssert sa= new SoftAssert();
	  sa.assertEquals(false, false);
  }
}
