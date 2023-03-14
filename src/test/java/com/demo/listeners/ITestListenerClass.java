package com.demo.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass  implements ITestListener{
	
	// before java 1.8 , only interfaces no implementaion 
	// we can provide the implementation in interface in java 8 
	
	// before TestNG 7.5 -- testNG was not using Java 8 
	// After 7.5 testNG  started using java 8 features
	// ITestLisner add unlimited methods are not available in the latest version 
	// By default ITestListener have some methods 
	// 
	
	

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("onTestFailure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("onTestSkipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
}
