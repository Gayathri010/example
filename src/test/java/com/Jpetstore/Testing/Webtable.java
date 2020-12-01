package com.Jpetstore.Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
			//*[@id="post-body-5867683659713562481"]/div/div[1]/table/thead/tr/th[1]
			//*[@id="post-body-5867683659713562481"]/div/div[1]/table/tbody/tr[1]/th
			//*[@id="post-body-5867683659713562481"]/div/div[1]/table/tbody/tr[2]/th
			//*[@id="post-body-5867683659713562481"]/div/div[1]/table/tbody/tr[3]/th
			
			List<WebElement> total = driver.findElements(By.xpath("//*[@id='post-body-5867683659713562481']/div/div[1]/table/tbody/tr"));
            int size = total.size();	
            System.out.println(size);
            
			String beforexpath ="//*[@id='post-body-5867683659713562481']/div/div[1]/table/tbody/tr[";
			String afterxpath  ="]/th";
			
			for (int i = 1; i <5; i++) {
				String actualxpath = beforexpath+i+afterxpath;
				WebElement table = driver.findElement(By.xpath(actualxpath));
				System.out.println(table.getText());
			}
			
	}

}
