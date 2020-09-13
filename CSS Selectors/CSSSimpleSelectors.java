package com.cssSelectors;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSimpleSelectors {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		System.out.println(driver.findElement(By.cssSelector("button")).getAttribute("id"));
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Yadagiri");
		driver.findElement(By.cssSelector(".gender")).sendKeys("Male");
		System.out.println(driver.findElements(By.cssSelector("*")).size());
	}
}