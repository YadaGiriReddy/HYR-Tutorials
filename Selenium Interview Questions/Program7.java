package com.SeleniumInterviewQuestions;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * What is the difference between driver.get() and driver.navigate.to() in Selenium WebDriver?
 */
public class Program7 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		
		driver.get("https://google.com/");
		driver.navigate().to("https://hyrtutorials.com/");
		driver.navigate().to(new URL("https://www.youtube.com/hyrtutorials"));
		
	}
}