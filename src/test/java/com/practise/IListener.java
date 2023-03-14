package com.practise;

public interface IListener {
	
	static void duringTest()
	{
		
	};
	
	default void start()
	{
		
	}
	
	default void generate()
	{
		System.out.println(" ");
	}
	
	public static void  end()
	{
		System.out.println("Using java 1.8 implementation possible in Iterface ");
	}

	  

}
