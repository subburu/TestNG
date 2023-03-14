package com.demo.groups;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void test4() {
	  System.out.println("Test4");
  }
  
  @Test (groups = {"smoke","regression","sanity"})
  public void test5() {
	  System.out.println("Test5");
  }
  
  
  @Test (groups = {"functional"})
  public void test6() {
	  System.out.println("Test6");
  }
  
  public void test7() {
	  System.out.println("Test7");
  }

  
}
