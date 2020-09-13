package com.SeleniumInterviewQuestions;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * Why we need to typecast the WebDriver instance
 * JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
 * TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
 */
public class Program2 {
	static String browserName = "Chrome";
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
		
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		String title = (String) jsExecutor.executeScript("return document.title");
		System.out.println(title);
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/Image1.png"));
		
		driver.quit();
	}
}