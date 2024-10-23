package org.dropdown;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.OutputType;

public class Demodropdown {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\Demodropdown\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/SelectHotel.php");
		
		driver.manage().window().maximize();
		
		String pageTittle = driver.getTitle();
		System.out.println(pageTittle);
			
		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);
		
//		WebElement crt = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		crt.click();
//		Thread.sleep(3000);
		
//		WebElement day = driver.findElement(By.id("day"));
//		
//		Select s = new Select(day);
//		List<WebElement> coun = s.getOptions();
//		for (int i = 1; i <= coun.size(); i++)     
//			if (i % 2 == 0)                                         //printhing the even numbers
//				System. out. println(i);
//		
		
		
		
//		WebElement cou = driver.findElement(By.name("country"));
//		
//		Select s = new Select(cou);
//		
//		List<WebElement> coun = s.getOptions();
//		
//		for (int i = 0; i < coun.size(); i++) {
//			WebElement count = coun.get(i);
//			String country = count.getText();
//			System.out.println(country);
			
//		}
		
		WebElement id = driver.findElement(By.id("username"));
		id.click();
		id.sendKeys("mahabca004");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.click();
        pass.sendKeys("7048JW");
		
		WebElement log = driver.findElement(By.id("login"));
		log.click();
		Thread.sleep(3000);
		
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByVisibleText("New York");
		Thread.sleep(3000);
		
		WebElement ho = driver.findElement(By.name("hotels"));
		Select s1 = new Select(ho);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement room = driver.findElement(By.name("room_type"));
		Select s2 = new Select(room);
		s2.selectByValue("Deluxe");
		
		WebElement adrm = driver.findElement(By.id("adult_room"));
		Select s3 = new Select(adrm);
		s3.selectByIndex(2);
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		Thread.sleep(3000);
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\vigne\\eclipse-workspace\\Demodropdown\\screenshot\\Payment.png");
		FileUtils.copyFile(img, f);
		
	}
    
}
