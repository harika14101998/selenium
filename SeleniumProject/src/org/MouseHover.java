package org;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void takepicture(WebDriver driver,String filename) throws Exception{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("D:\\harika\\screenshot\\"+filename+".png"));
	}
 public static void main(String[] args) throws Exception{
	 System.setProperty("webdriver.chrome.driver", "D:\\Share\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		
		takepicture(driver,"img1");
		Actions action = new Actions(driver);
		WebElement women = driver.findElement(By.linkText("WOMEN"));
		action.moveToElement(women).build().perform();
		takepicture(driver,"img2");
		
		Thread.sleep(3000);
		
		WebElement  Footwear= driver.findElement(By.linkText("Footwear"));
		action.moveToElement(Footwear).build().perform();
		takepicture(driver,"img3");
		
		Thread.sleep(3000);
		
		Footwear.click();
		takepicture(driver,"img4");
		
 
 }
}
