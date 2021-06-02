package com.datadriven.test.login;

import org.testng.annotations.Test;

import com.datadriven.base.BaseUI;

public class LoginTest extends BaseUI {
	
	@Test
	public void testOne() {
		invokeBrowser("chrome");
		openURL("https://todoist.com/");
		elementClick("/html/body/div/div/main/div[1]/header/nav/div/ul[2]/li[1]/a");
		enterText("//*[@id=\'email\']", "moinali5599@gmail.com");
		tearDown();
		
		
	}
	
	@Test
	public void testTwo() {
		invokeBrowser("firefox");
		openURL("https://todoist.com/");
		elementClick("/html/body/div/div/main/div[1]/header/nav/div/ul[2]/li[1]/a");
		enterText("//*[@id=\'email\']", "moinali5599@gmail.com");
		tearDown();
		
	}

}
