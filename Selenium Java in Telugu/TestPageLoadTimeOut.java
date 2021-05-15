package com.SeleniumPractice;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * PageLoadTimeout in Selenium WebDriver?
 */
public class TestPageLoadTimeOut {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		
		driver.get("https://www.hyrtutorials.com/");
		
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("PageLoad time: "+duration.toMillis() + " milli seconds");
		
		System.out.println(driver.getTitle());
		driver.quit();
	}
}