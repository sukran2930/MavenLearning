package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	/*
	// Method-1
	public WebElement username(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='username']"));
	}

	public WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='password']"));
	}

	public WebElement loginBtn(WebDriver driver) {
		return driver.findElement(By.id("login"));
	}
	*/

	
	 //Method-2
	  
	 @FindBy(xpath="//input[@name='username']") 
	 public static WebElement username;
	 
	 @FindBy(xpath="//input[@type='password']") 
	 public static WebElement password;
	  
	 @FindBy(id="login") 
	 public static WebElement loginBtn;
	
	  
	/*
	// Method-3
	public LoginPage username(WebDriver driver, String username) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		return this;
	}

	public LoginPage password(WebDriver driver, String password) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		return this;
	}

	public LoginPage loginBtn(WebDriver driver) {
		driver.findElement(By.id("login")).click();
		return this;
	}
*/
}
