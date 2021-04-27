package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriverManager {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().proxy("testhost:8080").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}
}