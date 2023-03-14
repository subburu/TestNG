package com.demo.testNG;

import org.testng.annotations.Test;

public class Testdependency {
	static String trackingnumber = null;
	/*
	 * @Ignore
	 * 
	 * @Test public void createShipment() { System.out.println(5 / 0); // test will
	 * passed System.out.println("Create Shipment"); trackingnumber = "ABC123";
	 * 
	 * }
	 */

	@Test(priority = 1, dependsOnMethods = { "createShipment" }, alwaysRun = true,ignoreMissingDependencies=true)
	public void trackShipment() throws Exception {
		if (trackingnumber != null)
			System.out.println("track Shipment");
		else
			throw new Exception("Invalid Tracking number");

	}

	@Test(dependsOnMethods = { "createShipment", "trackShipment" },ignoreMissingDependencies=true)
	public void cancelShipment() throws Exception {
		if (trackingnumber != null)
			System.out.println("cancel Shipment");
		else
			throw new Exception("Invalid Tracking number");

	}

}
