package com.Jpetstore.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://demoqa.com/automation-practice-form");
		    
		    WebElement firstname = driver.findElement(By.id("firstName"));
		    firstname.sendKeys("Gayu");
		    
		    WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		    lastname.sendKeys("Murugan");
		    WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		    email.sendKeys("gayumkg1702@gmail.com");
		    WebElement phone = driver.findElement(By.xpath(" //input[@id='userNumber']"));
		    phone.sendKeys("9003147845");
		    Thread.sleep(2000);

		    WebElement dob = driver.findElement(By.xpath(" //input[@id='dateOfBirthInput']"));
		    dob.click();
		    Thread.sleep(2000);

		    
		    WebElement month = driver.findElement(By.xpath(" //select[@class='react-datepicker__month-select']"));
		    Select m = new Select(month);
		    m.selectByValue("5");
		    Thread.sleep(2000);
		    

		    WebElement year = driver.findElement(By.xpath(" //select[@class='react-datepicker__year-select']"));
		    Select y = new Select(year);
		    y.selectByVisibleText("1997");
		    Thread.sleep(2000);
		    
		    WebElement date = driver.findElement(By.xpath(" //*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[7]"));
		    Select x = new Select(date);
		    x.selectByIndex(17);
		    Thread.sleep(2000);

		    WebElement subject = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		    subject.sendKeys("English");
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
