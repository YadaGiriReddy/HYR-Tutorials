package com.SeleniumInterviewQuestions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * What is the difference between findElement & findElements in Selenium WebDriver?
 */
public class Program5 {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		//FindElement
		WebElement firstNameTxt = driver.findElement(By.xpath("//input[@name='name']"));
		firstNameTxt.sendKeys("HYR Tutorials");
		
		//FindElements
		List<WebElement> elements = driver.findElements(By.xpath("//div/h1"));
		System.out.println(elements.size());
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
		
		driver.quit();
	}
}