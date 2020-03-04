package com.acme;

import org.testng.annotations.Test;

public class APITest {
	
	@Test
	public void postJira() {
		
		System.out.println("I have posted JIRA code");
	}
	
	@Test(groups= {"smoke"})
	public void deleteTwitter() {
		
		System.out.println("I have deleted Twitter");
	}
}
