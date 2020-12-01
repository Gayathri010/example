package com.Jpetstore.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day {

	
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://dbankdemo.com/login");

	    driver.findElement(By.xpath("//a[text()=' Sign Up Here']")).click();
	 
			   
			   
		
		   }
	
}