package com.Uploadimage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.beans.Visibility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utilities.FileUpload;



public class UploadImageForGmail {
	WebDriver driver;
	@Test
	public void setUp() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java-Eclipse\\SeleniumFW\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://gmail.com/");
		WebDriverWait wait=new WebDriverWait(driver, 60);
		
	       driver.findElement(By.name("identifier")).sendKeys("vemulabalaji856");
	     driver.findElement(By.xpath("//span[text()='Next']")).click();
	     driver.findElement(By.name("password")).sendKeys("chandu856");
	     try {
	    	    WebElement next = driver.findElement(By.xpath("//span[contains( text(),'Next')]"));
	    	    next.click();
	    	    }
    	catch(org.openqa.selenium.StaleElementReferenceException ex)
    	{
    	   driver.findElement(By.xpath("//span[contains( text(),'Next')]")).click();;
    	    
    	}
	     
	     
	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='COMPOSE']")));
	     driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		
//	     java.util.Set<String> handles = driver.getWindowHandles();
//	        System.out.println(handles);

//	        for (String handle1 : driver.getWindowHandles()) {
//
//	               System.out.println(handle1);
	               Actions actions = new Actions(driver);

	               actions.moveToElement(driver.findElement(By.xpath("//div[@data-tooltip='Attach files']"))).click().perform();
//
	               
	              
//	               JavascriptExecutor js=(JavascriptExecutor) driver;
//	               js.executeScript("document.getElementsByName('Filedata')[0].removeAttribute('style')",fileElement);
	               
	               FileUpload.upload("yuva ticket.JPG");
	               
//	               Thread.sleep(6000);
	               
	               actions.moveToElement(driver.findElement(By.xpath("//div[@data-tooltip='Attach files']"))).click().perform();
	               FileUpload.upload("Selenium Tutorial.docx");
	               
	              
	
		
	
}
}

