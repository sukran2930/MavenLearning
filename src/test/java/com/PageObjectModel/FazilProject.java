package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class FazilProject{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

//		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
//		userName.sendKeys("mohammedfazil");
//		
//		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
//		pswd.sendKeys("fazil12345");
//		
//		WebElement loginBtn = driver.findElement(By.id("login"));
//		loginBtn.click();
		
//		//Method-1
//		FazinLoginPage loginPage = new FazinLoginPage();
//		loginPage.userName(driver).sendKeys("mohammedfazil");
//		loginPage.password(driver).sendKeys("fazil12345");
//		loginPage.loginButton(driver).click();
		
		//Method-2
		PageFactory.initElements(driver, FazinLoginPage.class);
		FazinLoginPage.userName.sendKeys("mohammedfazil");
		FazinLoginPage.password.sendKeys("fazil12345");
		FazinLoginPage.loginButton.click();
		
	
		

	}

}
