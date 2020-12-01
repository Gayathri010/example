package com.Jpetstore.Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {

	public static void main(String[] args) throws InterruptedException, AWTException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/automation-practice-form");
	    
	    
	    
	    WebElement subject = driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",subject);
	    Robot r1 = new Robot();
		   r1.keyPress(KeyEvent.VK_DOWN);
		 
		   r1.keyPress(KeyEvent.VK_ENTER);
		   r1.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    
	  /*  WebElement state = driver.findElement(By.xpath("//div[text()='Select State']"));
	    JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    js1.executeScript("arguments[0].scrollIntoView();",state);
	    state.click();
		   Robot r1 = new Robot();
		   r1.keyPress(KeyEvent.VK_DOWN);
		 
		   r1.keyPress(KeyEvent.VK_ENTER);
		   r1.keyRelease(KeyEvent.VK_ENTER);*/
	    
	
	
}
}
