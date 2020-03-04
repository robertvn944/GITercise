package com.acme;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test(groups= {"smoke"})
	public void browserAutomation() {
		
		System.out.println("My browser has been automated");
	}
	
	@Test
	public void uiElements() {
		
		System.out.println("This is for UI elements");
	}
}
