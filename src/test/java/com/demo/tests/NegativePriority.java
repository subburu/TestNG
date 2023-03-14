package com.demo.tests;

import org.testng.annotations.Test;

public class NegativePriority {

	@Test (priority =1)
	public void m1(int a )
	{ 
		 a =20;
		System.out.println(a);
	}
	
	@Test (priority = -1)
	public void m1(String s)
	{
		s="negative priority";
		System.out.println(s);
		
	}
	
}
