package com.demo.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Indices_Dataprovieder {


		@Test (dataProvider="getData")
		public void TestLogin(String s)
		{
			System.out.println(s);
			
		}
		
		// 100 sets of data -- only 2 are failing 
		//In this case i have to execute only two test cases -
		// to check the failure of test cases
		
		// Using indices we are using partial data - from the dataProvider 
		
		 @DataProvider (indices= {0,2})
        public String [] getData()
        {
			String data[] =new String[] {"Yadaih","John","Rebecca","Smith"};
			return data;
        }


	
		
	
}
