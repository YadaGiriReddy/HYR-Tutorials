package com.SeleniumInterviewQuestions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * How to find broken links using Selenium WebDriver?
 */
public class Program3 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.theworldsworstwebsiteever.com/");
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			String linkURL = link.getAttribute("href");
			try {
				URL url = new URL(linkURL);
				HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
				httpURLConnection.setConnectTimeout(3000);
				httpURLConnection.connect();
				if(httpURLConnection.getResponseCode()==200)
					System.out.println(linkURL+" - "+httpURLConnection.getResponseMessage());
				else
					System.err.println(linkURL+" - "+httpURLConnection.getResponseMessage());
			} catch (Exception e) {
				System.err.println(linkURL);
			}
		}
		driver.quit();
	}
}