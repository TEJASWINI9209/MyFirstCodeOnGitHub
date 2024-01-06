package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FirstSeleniumScript {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	     ChromeOptions co= new ChromeOptions();
	     co.setBinary("C:\\Users\\Lenovo\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	     
	     WebDriver driver=new ChromeDriver(co);
	     driver.get("https://www.google.com");
	     driver.findElement(By.name("q")).sendKeys("naveen automation Labs");
	     System.out.println(driver.getTitle());
	}

}
