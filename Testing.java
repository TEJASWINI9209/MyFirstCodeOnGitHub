package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testing {
	public static void main(String args[]) {
		//open Browser
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Testing\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	     ChromeOptions co= new ChromeOptions();
	     co.setBinary("C:\\Drivers\\Testing\\chrome-win64\\chrome-win64\\chrome.exe");
	    
	     WebDriver driver=new ChromeDriver(co);
	     
	//enter url application
	     driver.get("https://www.amazon.in/");
	     
	     driver.manage().window().maximize();
	     
	     //Identify web element
	     WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
	     
	     //Perform action on that element
	     searchBox.sendKeys("Oneplus");
	     
	     WebElement searcLink =  driver.findElement(By.id("nav-search-submit-button"));
	     searcLink.click();
	     
	     WebElement searchLink = driver.findElement(By.className("hm-icon-label"));
	     searchLink.click();
	     
	  
	     
	     
	     //Validate outcome(Identify web element)
	     
	     
	     
	     //close Browser
	     //driver.close();	     
   }
}
