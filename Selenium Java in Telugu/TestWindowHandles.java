package com.SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * How to handle multiple windows or tabs using Selenium WebDriver?
 */
public class TestWindowHandles {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		//Single window
		//		String parentWindowHandle = driver.getWindowHandle();
		//		System.out.println("Parent window handle - "+parentWindowHandle + driver.getTitle());
		//		driver.findElement(By.id("newWindowBtn")).click();
		//		Set<String> windowHandles = driver.getWindowHandles();
		//		for (String windowHandle : windowHandles) {
		//			if(!windowHandle.equals(parentWindowHandle)) {
		//				driver.switchTo().window(windowHandle);
		//				driver.manage().window().maximize();
		//				driver.findElement(By.id("firstName")).sendKeys("Yadagiri");
		//				Thread.sleep(3000);
		//				driver.close();
		//				Thread.sleep(2000);
		//			}
		//		}
		//		
		//		driver.switchTo().window(parentWindowHandle);
		//		driver.findElement(By.id("name")).sendKeys("HYR TUtorials");

		// Single Tab
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle - "+parentWindowHandle + driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				System.out.println(driver.findElement(By.id("output")).getText());
				driver.findElement(By.id("alertBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("output")).getText());
				Thread.sleep(3000);
				driver.close();
			}
		}

		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("HYR TUtorials");

		Thread.sleep(3000);
		driver.quit();
	}
}