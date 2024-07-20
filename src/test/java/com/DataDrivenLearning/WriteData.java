package com.DataDrivenLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	//IllegalArgumentException -> if workbook already contains the same sheet name
	public static void main(String[] args) throws IOException {
		File file = new File(".\\DataFile\\StudentsData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
//		int rowCount = 4;
		//Get sheet, create row and cell then set the cell value
		wb.getSheet("JanBatch").createRow(4).createCell(0).setCellValue("Fazil");
		//Get Sheet, Get Row, Create  Cell, set the cell value
		wb.getSheet("JanBatch").getRow(4).createCell(1).setCellValue("Artificial Intelligence");
		wb.getSheet("JanBatch").getRow(4).createCell(2).setCellValue("Goa");
		wb.getSheet("JanBatch").getRow(4).createCell(3).setCellValue(120);
		
		//Create Sheet, Create row, create cell, set the cell value
		wb.createSheet("FebBatch").createRow(0).createCell(0).setCellValue("NAME");
		//Get Sheet, Get Row, Create  Cell, set the cell value
		wb.getSheet("FebBatch").getRow(0).createCell(1).setCellValue("Course");
		wb.getSheet("FebBatch").getRow(0).createCell(2).setCellValue("Location");
		wb.getSheet("FebBatch").getRow(0).createCell(3).setCellValue("Number of Days");
		
		//Write the data in excel
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
//		wb.close();
		
		System.out.println("Write Operation Completed!!!");
		System.exit(0);
		
	}

}
