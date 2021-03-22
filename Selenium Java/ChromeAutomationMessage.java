package com.Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * How to remove "Chrome is being controlled by automated test software" message?
 */
public class ChromeAutomationMessage {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//Way1
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		//Way2
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		
		//Way3
		options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
		
		//Way4
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		//Way5
		List<String> eSwitches = new ArrayList<>();
		eSwitches.add("enable-automation");	
		options.setExperimentalOption("excludeSwitches", eSwitches);
		
		//Use any of the one way from above 5ways and comment/remove the remaining 4ways
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");		
		
	}
}