package com.tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.utilities.CommonMethods;
import com.utilities.Constants;

public class excelRead {
	CommonMethods cm = new CommonMethods();

	public void get(WebElement searchBar) {
		cm.sendText(searchBar, "macbook");
	}

	public static void main(String[] args) throws IOException {
		DataFormatter objDefaultFormat = new DataFormatter();

		// Path of the excel file
		FileInputStream fs = new FileInputStream(Constants.Path_TestData);
		// Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(1);

////	Row row = sheet.getRow(0);
////	Cell cell = row.getCell(0);
//	System.out.println("1 - " + sheet.getRow(0).getCell(0)); //Useranme1
//
////	Row row1 = sheet.getRow(1);
////	Cell cell1 = row1.getCell(1);
//	System.out.println("2 - " + sheet.getRow(0).getCell(1)); // Password1
//
////	Row row2 = sheet.getRow(1);
////	Cell cell2 = row2.getCell(1);
//	System.out.println("3 - " + sheet.getRow(1).getCell(0)); //Username2
//
////	Row row3 = sheet.getRow(1);
////	Cell cell3 = row3.getCell(1);
//	System.out.println("4 - " + sheet.getRow(1).getCell(1)); //Password2

		System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");

		for (Row row : sheet) {
			for (Cell cell : row) {
				String cellValue = objDefaultFormat.formatCellValue(cell);
				System.out.print(cellValue + "\t");
			}
			System.out.println(" ");
		}
		// Example to explain what we did upward
		// Cell userName = sheet.getRow(1).getCell(0);
//  String orderID1= userName.toString();

	}
}
