package com.cssSelectors;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSAttributeSelectors {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		System.out.println(driver.findElements(By.cssSelector("input[placeholder]")).size());
		System.out.println(driver.findElements(By.cssSelector("input[placeholder='First Name']")).size());
		System.out.println(driver.findElements(By.cssSelector("input[placeholder~='question']")).size());
		System.out.println(driver.findElements(By.cssSelector("input[placeholder*='que']")).size());
		System.out.println(driver.findElements(By.cssSelector("p[class|='my']")).size());
		System.out.println(driver.findElements(By.cssSelector("p[class^='my']")).size());
		System.out.println(driver.findElements(By.cssSelector("p[class$='lass']")).size());
		driver.quit();
	}
}
