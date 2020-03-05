package com.acme;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class APITest {
	
	@Test
	public void postJira() {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.s");
		String date = simpleDateFormat.format(new Date());
		System.out.println("I have posted JIRA code");
		System.out.println("This change has been posted from the original MavenJava project in GITstuff");
		System.out.println(date + "::GITercise - And I have tidied up your timeline and added this code");
	}
	
	@Test(groups= {"smoke"})
	public void deleteTwitter() {
		
		System.out.println("I have deleted Twitter");
	}
}
