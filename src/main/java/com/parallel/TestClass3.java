package com.parallel;

import org.testng.annotations.Test;

public class TestClass3 {
	
	@Test
	public void testmethod1()
	{
		System.out.println("TestClass3 >> testmethod7 >>"+ Thread.currentThread().getId());
	}

	
	@Test
	public void testmethod2()
	{
		System.out.println("TestClass3 >> testmethod8 >>"+ Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod3()
	{
		System.out.println("TestClass3 >> testmethod9 >>"+ Thread.currentThread().getId());
	}
}
