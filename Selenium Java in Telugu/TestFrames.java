package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * How to handle frames in a web page using Selenium WebDriver?
 */
public class TestFrames {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Text1"); //Main document
		Thread.sleep(5000);
		driver.switchTo().frame("frm1"); //frame1
			
		Select courseName_dd = new Select(driver.findElement(By.id("course")));
		courseName_dd.selectByVisibleText("Java");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();//Main document
		
		driver.switchTo().frame("frm2"); //frame2
		driver.findElement(By.id("firstName")).sendKeys("Yadagiri");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();//Main document
		driver.switchTo().frame("frm1"); //frame1
		
		courseName_dd.selectByVisibleText("Dot Net");
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();//Main document
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Text2");
	}
}