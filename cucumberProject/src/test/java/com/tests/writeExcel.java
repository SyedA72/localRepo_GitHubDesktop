package com.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.utilities.Constants;

public class writeExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String path = "src/test/resources/testdata/DemoFile.xlsx";
		FileInputStream fs = new FileInputStream(Constants.Path_TestData);
		
		Workbook wb = new XSSFWorkbook(fs);
		
		Sheet sheet1 = wb.getSheetAt(0);
		
		int lastRow = sheet1.getLastRowNum();
		
		System.out.println(lastRow);
		
		for (int i = 0; i <= lastRow; i++) {
			Row row = sheet1.getRow(i);
			Cell cell = row.createCell(2);

			cell.setCellValue("Hi Team");

		}
		

		FileOutputStream fos = new FileOutputStream(Constants.Path_TestData);
		wb.write(fos);
		fos.close();
	
	}

}
