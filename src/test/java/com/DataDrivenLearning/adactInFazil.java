package com.DataDrivenLearning;

import java.io.File;

import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.ui.Select;

public class adactInFazil {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String localpath = System.getProperty("user.dir");
		System.out.println(localpath);
		String driverPath = localpath +"\\Drivers\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver",driverPath);
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mohammedfazil");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("fazil12345");
		driver.findElement(By.id("login")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File destinatiom = new File(System.getProperty("user.dir") + "\\Screenshot\\login.png");
		FileHandler.copy(file, destinatiom);
		
		WebElement loca = driver.findElement(By.xpath("//select[@name='location']"));
	
		Select locasel = new Select(loca);
		List<WebElement> locOptions = locasel.getOptions();
		System.out.println("locations options to select -");
		for (WebElement locations : locOptions) {
			
			System.out.print( "," +locations.getText());
			}
		
		locasel.selectByValue("Paris");
		
		Thread.sleep(1000);
		WebElement hol = driver.findElement(By.id("hotels"));
		Select holsel = new Select(hol);
		holsel.selectByValue("Hotel Hervey");
		
		Thread.sleep(1000);
		WebElement roomtyp = driver.findElement(By.id("room_type"));
		Select roomtypsel = new Select(roomtyp);
		roomtypsel.selectByValue("Deluxe");
		
		
		Thread.sleep(1000);
		WebElement room = driver.findElement(By.id("room_nos"));
		Select roomsel = new Select(room);
		roomsel.selectByValue("4");
		
		Thread.sleep(1000);
		WebElement ckin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		ckin.clear();
		ckin.sendKeys("05/02/2024");
		
		Thread.sleep(1000);
		WebElement ckout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		ckout.clear();
		ckout.sendKeys("09/02/2024");
		
		Thread.sleep(1000);
		WebElement adroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select adroomsel = new Select(adroom);
		adroomsel.selectByVisibleText("4 - Four");
		
		Thread.sleep(1000);
		WebElement chlroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select chlroomsel = new Select(chlroom);
		chlroomsel.selectByVisibleText("2 - Two");
		
		Thread.sleep(1000);
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File file1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(System.getProperty("user.dir") + "\\Screenshot\\selected.png");
//		File destination1 = new File("C:\\Users\\fazil\\eclipse-workspace\\SeleniumTool\\Screenshot\\selected.png");
		FileHandler.copy(file1, destination1);
		
		Thread.sleep(3000);
		driver.findElement(By.id("Submit")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("mohammed");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("fazil");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("No:38, kadharbai street, Ranganthapuram");
		Thread.sleep(2000);
		
		driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		Thread.sleep(2000);
		
		WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select cardtypesel = new Select(cardtype);
		cardtypesel.selectByValue("AMEX");
		
		Thread.sleep(2000);
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select expmonthsel = new Select(expmonth);
		expmonthsel.selectByVisibleText("September");
		
		Thread.sleep(2000);
		WebElement expyr = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select expyrsel = new Select(expyr);
		expyrsel.selectByValue("2025");
		
		Thread.sleep(2000);
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		
		Thread.sleep(2000);
		driver.findElement(By.id("book_now")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("my_itinerary")).click();
		driver.quit();
		
		
		
		
		
//		driver.navigate().back();
//		
//		driver.findElement(By.id("Reset")).click();
//		
//		
//		TakesScreenshot ts2 = (TakesScreenshot)driver;
//		File file2 = ts2.getScreenshotAs(OutputType.FILE);
//		File destination2 = new File("C:\\Users\\fazil\\eclipse-workspace\\SeleniumTool\\Screenshot\\reset.png");
////		FileHandler.copy(file2, destination2);
//		FileUtils.copyFile(file2, destination2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		

	}

}
