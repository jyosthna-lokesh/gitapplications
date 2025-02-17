package com.Annotations1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_register_Username {
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumFW\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	@Test(priority=0)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Narendra");
	}
	@Test(priority=1)
	public void enterRegisterFields()
	{
		
		driver.findElement(By.name("lastName")).sendKeys("kumar");
		driver.findElement(By.name("phone")).sendKeys("9908004328");
		driver.findElement(By.id("userName")).sendKeys("run2narendrakumar@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("2-36/1,varadarajapuram");
		driver.findElement(By.name("city")).sendKeys("Ganapavaram");
		driver.findElement(By.name("state")).sendKeys("andhra pradesh");
		driver.findElement(By.name("postalCode")).sendKeys("534198");
	    WebElement countryName=driver.findElement(By.name("country"));
		Select sel=new Select(countryName);
		
		sel.selectByValue("5");
		driver.findElement(By.id("email")).sendKeys("narendra11");
		driver.findElement(By.name("password")).sendKeys("12345645");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345645");
		driver.findElement(By.name("register")).click();
		String expet_result="narendra";
	     String actul_result=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]"
	     		+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		if(actul_result.contains(expet_result))
		{
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		
		
		
		
	}
	//@AfterTest
	//public void TearDown()
//	{
//		driver.close();
//	}

}
