package com.acme;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class APITest {
	
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.s");
	
	@Test
	public void postJira() {
		
		String date = simpleDateFormat.format(new Date());
		System.out.println("I have posted JIRA code");
		System.out.println("This change has been posted from the original MavenJava project in GITstuff");
		System.out.println("202003051537 :: GITercise - And I have tidied up your timeline and added this code");
		System.out.println("202003051554 :: MavenJava update.");
	}
	
	@Test(groups= {"smoke"})
	public void deleteTwitter() {
		
		System.out.println("I have deleted Twitter");
		System.out.println("202003051537 :: Added date formatting");
		System.out.println("202003051554 :: MavenJava update.");
	}
}
