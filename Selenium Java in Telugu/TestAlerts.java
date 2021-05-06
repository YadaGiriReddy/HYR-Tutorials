package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * How to handle alerts in a web page using Selenium WebDriver?
 */
public class TestAlerts {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		//Alert Box
		//		System.out.println(driver.findElement(By.id("output")).getText());
		//		driver.findElement(By.id("alertBox")).click();
		//		System.out.println(driver.switchTo().alert().getText());
		//		driver.switchTo().alert().accept();
		//		System.out.println(driver.findElement(By.id("output")).getText());

		//Confirm Box
		//		System.out.println(driver.findElement(By.id("output")).getText());
		//		driver.findElement(By.id("confirmBox")).click();
		//		System.out.println(driver.switchTo().alert().getText());
		//		driver.switchTo().alert().accept();
		//		System.out.println(driver.findElement(By.id("output")).getText());
		//		driver.findElement(By.id("confirmBox")).click();
		//		System.out.println(driver.switchTo().alert().getText());
		//		driver.switchTo().alert().dismiss();
		//		System.out.println(driver.findElement(By.id("output")).getText());


		//Prompt Box
		//		System.out.println(driver.findElement(By.id("output")).getText());
		//		driver.findElement(By.id("promptBox")).click();
		//		System.out.println(driver.switchTo().alert().getText());
		//		driver.switchTo().alert().sendKeys("HYR Tutorials");
		//		driver.switchTo().alert().accept();
		//		System.out.println(driver.findElement(By.id("output")).getText());
		//		driver.findElement(By.id("promptBox")).click();
		//		System.out.println(driver.switchTo().alert().getText());
		//		driver.switchTo().alert().dismiss();
		//		System.out.println(driver.findElement(By.id("output")).getText());

		driver.quit();
	}
}