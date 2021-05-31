package com.SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * How to perform below operations using Selenium WebDriver?
 * MoveToElement or MouseHover,
 * Click,
 * Double Click, 
 * Right click or Context Click 
 */
public class TestActions {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
//		
//		actions
//		.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule")))
//		.moveToElement(driver.findElement(By.id("menu_admin_Organization")))
//		.moveToElement(driver.findElement(By.id("menu_admin_viewLocations")))
//		.click()
//		.perform();
//		
//		driver.findElement(By.id("searchLocation_name")).sendKeys("Hyderabad");
//		actions.doubleClick(driver.findElement(By.id("searchLocation_name"))).perform();
		
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		actions.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[.='Edit']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}