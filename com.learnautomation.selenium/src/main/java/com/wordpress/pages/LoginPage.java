package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	By username = By.xpath("//input[@id='identifierId']");
	By passwordToLog = By.xpath("//input[@name='password']");
	By nextButton = By.xpath("//span[contains(text(),'Next')]");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String loginToSite() {

		driver.findElement(username).sendKeys("msanthosh87@gmail.com");
		driver.findElement(nextButton).click();
		//driver.findElement(passwordToLog).click();
		//driver.findElement(passwordToLog).sendKeys("Foolsparadise");
		driver.findElement(nextButton).click();
		String title = driver.getTitle();
		return title;
	}
	
	

}
