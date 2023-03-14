package com.demo.testNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test (priority=1)
	public void signUp()
	{
		System.out.println("SignUp");
	}
	
	@Test  //  befault priority will be zero 
	public void Login()
	{
		System.out.println("Login");
	}
	
	@Test (priority =2) // Same priority for 2 testcases
	public void SearchForTheFlight()
	{
		System.out.println("SearchForTheFlight");
	}
	
	@Test (priority =2)
	public void BookTheFlight()
	{
		System.out.println("BookTheFlight");
	}
	

	@Test (priority =3)
	public void SaveTheTicket()
	{
		System.out.println("SaveTheTicket");
	}
	
	@Test (priority =4)
	public void Logout()
	{
		System.out.println("Logout");
	}
	

}
