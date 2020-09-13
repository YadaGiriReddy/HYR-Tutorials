package com.ApachePOI;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAndWriteExcel {

	public static void main(String[] args) throws Exception {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet =  workbook.createSheet("TestSheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("World");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("HYR");
		sheet.getRow(1).createCell(1).setCellValue("Tutorials");
		
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellType(CellType.BLANK);
		sheet.getRow(2).createCell(1).setCellValue("Tutorials");

		File file = new File("C:\\Data\\Personal\\Selenium Course\\SeleniumJavaMaven\\ExcelFiles\\Test4.xls");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
//		XSSFWorkbook workbook = new XSSFWorkbook();
//		XSSFSheet sheet =  workbook.createSheet("TestSheet");
//		sheet.createRow(0);
//		sheet.getRow(0).createCell(0).setCellValue("Hello");
//		sheet.getRow(0).createCell(1).setCellValue("World");
//		
//		sheet.createRow(1);
//		sheet.getRow(1).createCell(0).setCellValue("HYR");
//		sheet.getRow(1).createCell(1).setCellValue("Tutorials");
//
//		File file = new File("C:\\Data\\Personal\\Selenium Course\\SeleniumJavaMaven\\ExcelFiles\\Test3.xlsx");
//		FileOutputStream fos = new FileOutputStream(file);
//		workbook.write(fos);
//		workbook.close();
	}

}
