package com.Jpetstore.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		WebElement Enterstore = driver.findElement(By.xpath("//a[text()='Enter the Store']"));
		Enterstore.click();
		WebElement Signin = driver.findElement(By.xpath("//a[text()='Sign In']"));
		Signin.click();
		WebElement Register = driver.findElement(By.xpath("//a[text()='Register Now!']"));
		Register.click();
		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("kokiladevi");
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("Murugan0217");
		WebElement Repeatpass = driver.findElement(By.xpath("//input[@name='repeatedPassword']"));
		Repeatpass.sendKeys("Murugan0217");
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='account.firstName']"));
		Firstname.sendKeys("Gayathri");
		WebElement Lastname = driver.findElement(By.xpath("//input[@name='account.lastName']"));
		Lastname.sendKeys("Murugan");
		WebElement Email = driver.findElement(By.xpath("//input[@name='account.email']"));
		Email.sendKeys("gayumkg1702@gmail.com");
		Repeatpass.sendKeys("Gayu0217");
		WebElement Phone = driver.findElement(By.xpath("//input[@name='account.phone']"));
		Phone.sendKeys("9003147845");
		WebElement Address = driver.findElement(By.xpath("//input[@name='account.address1']"));
		Address.sendKeys("111A");
		Thread.sleep(2000);
		WebElement Address2 = driver.findElement(By.xpath("//input[@name='account.address2']"));
		Address2.sendKeys("kamaraj street");
		WebElement City = driver.findElement(By.xpath("//input[@name='account.city']"));
		City.sendKeys("Chennai");
		WebElement State = driver.findElement(By.xpath("//input[@name='account.state']"));
		State.sendKeys("Tamilnadu");
		WebElement Zip = driver.findElement(By.xpath("//input[@name='account.zip']"));
		Zip.sendKeys("600018");
		WebElement Country = driver.findElement(By.xpath("//input[@name='account.country']"));
		Country.sendKeys("India");
		WebElement lang = driver.findElement(By.xpath("//select[@name='account.languagePreference']"));
		Thread.sleep(2000);
		Select s = new Select(lang);
		s.selectByValue("english");
		WebElement favorite = driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
		Thread.sleep(3000);
		Select s1 = new Select(favorite);
		s1.selectByValue("DOGS");
		Thread.sleep(2000);
		WebElement list = driver.findElement(By.xpath("//input[@name='account.listOption']"));
		list.click();
		WebElement Banner = driver.findElement(By.xpath("//input[@name='account.bannerOption']"));
		Banner.click();
		WebElement save = driver.findElement(By.xpath("//input[@value='Save Account Information']"));
		save.click();
		WebElement Dogs = driver.findElement(By.xpath("//div[@id='MainImageContent']//map//area[3]"));
		WebDriverWait wb = new WebDriverWait(driver, 30);
		wb.until(ExpectedConditions.visibilityOf(Dogs));
		Dogs.click();
		WebElement Lab = driver.findElement(By.xpath("//div[@id='Catalog']/table/tbody/tr[6]/td[1]/a"));
		Lab.click();
		WebElement Labretriver = driver.findElement(By.xpath("//div[@id='Catalog']//table//tbody//tr[4]//td[1]//a"));
		Labretriver.click();
		Thread.sleep(2000);
		WebElement Addtocart = driver.findElement(By.xpath("//a[text()='Add to Cart']"));
		Addtocart.click();
		WebElement Quantity = driver.findElement(By.xpath("//input[@size='3']"));
		Quantity.sendKeys("5");
		Thread.sleep(2000);
		WebElement Update = driver.findElement(By.xpath("//input[@value='Update Cart']"));
		Update.click();
		Thread.sleep(2000);
		WebElement Proceed = driver.findElement(By.xpath("//a[text()='Proceed to Checkout']"));
		Proceed.click();
		WebElement continues = driver.findElement(By.xpath("//input[@value='Continue']"));
		continues.click();
		WebElement confirm = driver.findElement(By.xpath("//a[text()='Confirm']"));
		confirm.click();
		
		
		
		
		
		
	}

}
