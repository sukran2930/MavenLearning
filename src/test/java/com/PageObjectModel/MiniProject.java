package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MiniProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		
//		//Method-1
//		LoginPage pageOne = new LoginPage();
//		pageOne.username(driver).sendKeys("mohammedfazil");
//		pageOne.password(driver).sendKeys("fazil12345");
//		pageOne.loginBtn(driver).click();
//			

		//Method-2
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.username.sendKeys("mohammedfazil");
		LoginPage.password.sendKeys("fazil12345");
		LoginPage.loginBtn.click();
		
		
		/*
		//Method-3
		LoginPage pageOne = new LoginPage();
		pageOne.username(driver, "mohammedfazil").password(driver, "fazil12345").loginBtn(driver);
		*/
		
		
		
//		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//		username.sendKeys("mohammedfazil");
			
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("fazil12345");
//		
//		WebElement loginBtn = driver.findElement(By.id("login"));
//		loginBtn.click();

	}

}
