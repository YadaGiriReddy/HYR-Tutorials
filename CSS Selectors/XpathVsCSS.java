package com.cssSelectors;

import java.time.Duration;
import java.time.Instant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathVsCSS {
	public static void main(String[] args) throws Exception {
		WebDriverManager.iedriver().setup();
		InternetExplorerOptions options = new InternetExplorerOptions();
//		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		options.setCapability(InternetExplorerDriver.SILENT,true);
		options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		WebDriver driver = new InternetExplorerDriver(options);
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		Thread.sleep(10000);
		
		
		Instant start = Instant.now();
		System.out.println(start.toString());
		driver.findElement(By.cssSelector("input[placeholder='Enter your security question']")).sendKeys("Test");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your security question']")).sendKeys("Test");
		Instant end = Instant.now();
		System.out.println(end.toString());
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time taken: "+ timeElapsed.toMillis() +" milli seconds");
		driver.quit();
	}
}