package com.demo.testNG;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BaseTest2 {

	// Single Dimensional Array 

	@Test (dataProvider ="getdata4")
	public void TestLogin(Object[] s)
	{
	   for (int i=0;i<s.length;i++)
	   {   
		System.out.println(i);
	   }
	}
	
	@DataProvider()
	public Object[] getdata()
	{
		Object[] data =new Object[] {1,"Hello",2,"Test"};
		return data;
		
	}
	
	
	//Here data type is string , it will accept only string

	@DataProvider()
	public String[] getdata1()
	{
		String[] data =new String[] {"Test","Hello","Testing"};
		return data;
		
	}
	//Here data type is Integer , it will accept only Integer 
	// To accept all the data types definded and predefined we use object 
	// Object is the super class of all the data types 
	@DataProvider()
	public Integer[] getdata2()
	{
		Integer[] data =new Integer[] {1,2,3,4};
		return data;
		
	}
	
	// Jagged Array -- Multiple set of data
	@DataProvider()
	public Object [][] getdata4()
	{
		Object[][] data=new Object[][]	{ {"Hyd",123,"Test"} ,
			{"Testing",10},{"Hello",15}};
			
			return data;
		
		}
	
	@DataProvider()
	   public Iterator <String > dp1()
	   {
		   Set<String> data=new HashSet<>();
		   data.add("Sravan");
		   data.add("Testing");
		   return data.iterator();
		   
		   
	   }
	
	
	
		
				}
	
	

	
	
	
	
	

