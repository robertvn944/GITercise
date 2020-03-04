package com.acme;

import org.testng.annotations.Test;

public class AppiumTest {

	@Test
	public void nativeApps() {
		
		System.out.println("Native apps are running");
	}
	
	@Test(groups= {"smoke"})
	public void iosApps() {
		
		System.out.println("IOS appsare crap");
	}
		
	
}
