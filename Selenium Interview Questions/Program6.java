package com.SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * What is the difference between driver.close() and driver.quit() in Selenium WebDriver?
 */
public class Program6 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.id("newWindowBtn")).click();
		for (String windowHandle : driver.getWindowHandles()) {
			if(!windowHandle.equals(parentWindow))
				driver.switchTo().window(windowHandle);
		}

		driver.findElement(By.id("firstName")).sendKeys("HYR");
		Thread.sleep(3000);

		driver.quit();
		driver.close();
	}
}