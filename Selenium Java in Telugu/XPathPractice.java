package com.SeleniumPractice;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * XPath Full Course
 */
public class XPathPractice {
	private static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		chapter2();
	}

	public static void highlight(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

	//Types of xpath
	public static void chapter2() {
		driver.get("https://www.w3schools.com/");

		//Absolute XPath
		highlight(driver.findElement(By.xpath("/html/body/div[3]/a[4]")));

		//Relative XPath
		highlight(driver.findElement(By.xpath("//a[@title='Exercises']")));
	}

	//XPath using Attributes
	public static void chapter3() {
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		driver.findElement(By.xpath("//a[@title=\"Search W3Schools\"]")).click();
	}

	//XPath Operators
	public static void chapter4() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@maxlength!=10]")).sendKeys("Test2");
		List<WebElement> elements = driver.findElements(By.xpath("//input[@maxlength>=10]"));
		for (WebElement element : elements) {
			highlight(element);
		}
	}

	//XPath Conditions
	public static void chapter5() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		List<WebElement> elements = driver.findElements(By.xpath("//input[@maxlength<=15 and @name='name' and @type='text']"));
		System.out.println(elements.size());

		List<WebElement> elementss = driver.findElements(By.xpath("//input[@maxlength<=15 or @name='namgge' or @type='tegggxt']"));
		System.out.println(elementss.size());

		List<WebElement> elementsss = driver.findElements(By.xpath("//input[not(@maxlength=10)]"));
		System.out.println(elementsss.size());
	}

	//XPath with Index
	public static void chapter6() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[15]")));
	}

	//XPath Functions
	public static void chapter7() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		highlight(driver.findElement(By.xpath("//a[text()='Sign in']")));
		highlight(driver.findElement(By.xpath("//a[contains(text(),'account')]")));
		highlight(driver.findElement(By.xpath("//div[contains(@class,'signin')]")));
		highlight(driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into')]")));
		highlight(driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")));
		highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]")));
		System.out.println(driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>2]")).size());
	}

	//XPath Axes
	public static void chapter8() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		highlight(driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")));
		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click();
		highlight(driver.findElement(By.xpath("//label[text()='Password']/following::input")));
		//td[text()='Helen Bennett']/ancestor-or-self::*
		//table[@id='contactList']/descendant-or-self::*
		//label[text()='Password']/preceding::input[1]
	}

	//XPath Shortcuts
	public static void chapter9() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		// text() -> .
		highlight(driver.findElement(By.xpath("//h1[.='Register']")));
		highlight(driver.findElement(By.xpath("//a[contains(.,'account')]")));
		highlight(driver.findElement(By.xpath("//td[starts-with(.,'Maria')]")));
		highlight(driver.findElement(By.xpath("//label[normalize-space(.)='First Name']")));

		// child -> /
		highlight(driver.findElement(By.xpath("//div[@class='container']/h1")));

		//parent - > /..
		highlight(driver.findElement(By.xpath("//h1[.='Register']/..")));

		//descendant -> //
		List<WebElement> elements = driver.findElements(By.xpath("//table[@id='contactList']//td"));
		for (WebElement element : elements) {
			highlight(element);
		}
	}

}
























