package com.demo.dataproviders;

import org.testng.annotations.DataProvider;

public class DataSupply {
	@DataProvider
	public String [] getData()
	
	{
		String [] data=new String[] {"Test","Test1","Test2"};
		return data;
		
	}
	
}
