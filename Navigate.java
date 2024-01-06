package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Testing\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
	    co.setBinary("C:\\Drivers\\Testing\\chrome-win64\\chrome-win64\\chrome.exe");
	   
	    WebDriver driver=new ChromeDriver(co);
	    driver.get("https://www.amazon.com/");
	    
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	     driver.findElement(By.xpath("//a[text()='Registry']")).click();
	     
	     driver.navigate().back();
	     Thread.sleep(4000);
	     
	     driver.navigate().forward();
	     Thread.sleep(4000);
	     
	    // driver.navigate().refresh();
	     
	     

	}

}
