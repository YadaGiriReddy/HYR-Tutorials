package com.Apache.PDFBox;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PDFReader {

	@Test
	public void ReadPDFFile() throws Exception {
		// if the file is available in local machine
		File file = new File("C:\\Users\\Reddy\\Downloads\\file-sample_150kB.pdf");
		FileInputStream fis = new FileInputStream(file);		
		PDDocument pdfDocument = PDDocument.load(fis);

		System.out.println("Number of Pages: " +pdfDocument.getPages().getCount());

		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		pdfTextStripper.setStartPage(1); // comment this line if you want to read the entire document
		pdfTextStripper.setEndPage(3); // comment this line if you want to read the entire document
		String docText = pdfTextStripper.getText(pdfDocument);

		System.out.println(docText);

		Assert.assertTrue(docText.contains("Maecenas"));

		pdfDocument.close();
		fis.close();

		// if the file is available in internet
		//		WebDriverManager.chromedriver().setup();
		//		WebDriver driver = new ChromeDriver();
		//		driver.manage().window().maximize();
		//		driver.get("https://file-examples.com/");
		//		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
		//		driver.findElement(By.xpath("//td[text()='PDF']/following-sibling::td/a")).click();
		//		driver.findElement(By.xpath("//td[text()='150 kB']/following-sibling::td/a")).click();		
		//		String urlString = driver.getCurrentUrl();
		//		
		//		URL url = new URL("https://file-examples-com.github.io/uploads/2017/10/file-sample_150kB.pdf");
		//		PDDocument pdfDocument = PDDocument.load(url.openStream());
		//		
		//		System.out.println("Number of Pages: " +pdfDocument.getPages().getCount());
		//		
		//		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		//		pdfTextStripper.setStartPage(1); // comment this line if you want to read the entire document
		//		pdfTextStripper.setEndPage(3); // comment this line if you want to read the entire document
		//		String docText = pdfTextStripper.getText(pdfDocument);
		//		
		//		System.out.println(docText);
		//
		//		Assert.assertTrue(docText.contains("Maecenas"));
		//		
		//		pdfDocument.close();
		//		driver.quit();
	}
}
