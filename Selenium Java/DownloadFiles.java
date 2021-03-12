package com.Ex1;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import com.microsoft.edge.seleniumtools.EdgeDriver;
import com.microsoft.edge.seleniumtools.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yadagiri Reddy
 * How to download files in chrome, firefox & edge browsers using selenium webdriver?
 */
public class DownloadFiles {

	public static void main(String[] args) {
		String fileType = "PDF";

		//Chrome
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> prefs = new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", "C:\\Users\\yhanuman.ORADEV\\Music\\TestDownloads");
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);

		//Edge Browser
		//		WebDriverManager.edgedriver().setup();
		//		EdgeOptions options = new EdgeOptions();
		//		HashMap<String, Object> prefs = new HashMap<>();
		//		prefs.put("plugins.always_open_pdf_externally", true);
		//		prefs.put("download.default_directory", "C:\\Users\\yhanuman.ORADEV\\Music\\TestDownloads");
		//		options.setExperimentalOption("prefs", prefs);
		//		WebDriver driver = new EdgeDriver(options);

		//Firefox
		//		WebDriverManager.firefoxdriver().setup();		
		//		FirefoxOptions options = new FirefoxOptions();
		//		FirefoxProfile profile = new FirefoxProfile();		
		//		profile.setPreference("pdfjs.disabled", true);
		//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf,application/doc,application/ms-doc,application/msword,application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		//		profile.setPreference("browser.download.dir","C:\\Users\\yhanuman.ORADEV\\Music\\TestDownloads");
		//		profile.setPreference("browser.download.folderList", 2);
		//		options.setProfile(profile);		
		//		WebDriver driver = new FirefoxDriver(options);

		driver.manage().window().maximize();
		driver.get("https://file-examples.com/");
		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
		driver.findElement(By.xpath("//td[text()='"+fileType+"']/following-sibling::td[2]/a")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Download sample')]")).click();
	}
}