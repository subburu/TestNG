package com.demo.testNG;

import org.testng.annotations.Test;

public class AlwaysTrue_Enabled {
	
	@Test
	public void addToCard()
	{
		System.out.println("Add to Cart");
		int i=9/0;
	}
	
	@Test (enabled=true,alwaysRun=true, dependsOnMethods="addToCard")
	public void payment()
	{
		System.out.println("Add to Cart");
	}

	
}
