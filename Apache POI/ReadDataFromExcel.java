package com.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Data\\Personal\\Selenium Course\\SeleniumJavaMaven\\ExcelFiles\\Test.xls");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
//		String cellValue = sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(cellValue);

		int rowCount = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);

			int cellCount = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = getCellValue(cell);
				System.out.print("||"+cellValue);
			}
			System.out.println();
		}

		workbook.close();
		fis.close();
	}

	public static String getCellValue(Cell cell) {
		switch (cell.getCellType()) {
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return cell.getStringCellValue();
		case BLANK:
			return "";
		default:
			return cell.getStringCellValue();
		}
	}
}