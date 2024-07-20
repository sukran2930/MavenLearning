package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FazinLoginPage {

	/*Method -1
//	userName
	public WebElement userName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='username']"));
	}

//	password
	public WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='password']"));
	}

//	loginButton
	public WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.id("login"));
	}
	*/
	
//Method-2
	@FindBy(xpath="//input[@name='username']")
	public static WebElement userName;
	
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement password;
	
	@FindBy(id = "login")
	public static WebElement loginButton;

}
