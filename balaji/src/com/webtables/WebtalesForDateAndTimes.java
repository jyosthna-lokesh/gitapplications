package com.webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebtalesForDateAndTimes {

	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java-Eclipse\\balaji\\libraries\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		//WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[9]/section[2]/div[1]/table"));
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[1]
     	//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[36]/td[1]/a
		for(int i=1;i<=36;i++)
		{
		String tr=driver.findElement(By.xpath("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+i+"]/td[1]/a")).getText();
		System.out.println(tr);
		
		
		}
		
	}

}