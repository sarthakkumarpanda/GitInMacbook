package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestValid {
	
	public WebDriver driver;
	
	@Test
	public void loginWithValidCredentials() {
		driver = new ChromeDriver();
	}

}
