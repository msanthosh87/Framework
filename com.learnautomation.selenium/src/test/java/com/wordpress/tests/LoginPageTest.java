package com.wordpress.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

public class LoginPageTest {
	
	WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void verifyLogin() {
		
		LoginPage obj = new LoginPage(driver);
		String title = obj.loginToSite();
		System.out.println(title);
		Assert.assertEquals(title, "Following ‹ Reader — WordPress.com","Expected title is not present");
					
		
	}

}
