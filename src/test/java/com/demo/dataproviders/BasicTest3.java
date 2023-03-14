package com.demo.dataproviders;

import org.testng.annotations.Test;

public class BasicTest3 {
	
	
	@Test(dataProvider="getdata")
	public void Testlogin(String s)
	{
		System.out.println(s);
		
	}

}
