package com.parallel;

import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test
	public void testmethod1()
	{
		System.out.println("TestClass2 >> testmethod4 >>"+ Thread.currentThread().getId());
	}

	
	@Test
	public void testmethod2()
	{
		System.out.println("TestClass2 >> testmethod5 >>"+ Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod3()
	{
		System.out.println("TestClass2 >> testmethod6 >>"+ Thread.currentThread().getId());
	}
}
