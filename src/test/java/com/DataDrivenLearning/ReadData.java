package com.DataDrivenLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// 1. File object
		File file = new File(".\\DataFile\\StudentsData.xlsx");
		// 2. FileInputStream
		FileInputStream fis = new FileInputStream(file); // FileNotFoundException
		// 3. Workbook
		Workbook wb = new XSSFWorkbook(fis); // IOException
		
		int NoOfSheets = wb.getNumberOfSheets();
		System.out.println("No. Of Sheets: " + NoOfSheets);
		// sheet
		Sheet sheet = wb.getSheetAt(0);
		
		int NoOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("No. Of Rows: " + NoOfRows);
		for(int i=0; i<NoOfRows; i++) {
			int NoOfCells = sheet.getRow(i).getPhysicalNumberOfCells();
			System.out.println("No Of Cells in Row[" + i + "]:" + NoOfCells); //4
			for(int j=0; j<NoOfCells; j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				CellType cellType = cell.getCellType(); //Row0,Cell0,Row0CELL1...
				if(cellType.equals(cellType.STRING)) {
				   String stringCellValue = cell.getStringCellValue();
				   System.out.println("Row[" + i + "] Cell[" + j + "] value: " + stringCellValue);
				}else if(cellType.equals(cellType.NUMERIC)) {
					double CellValue = cell.getNumericCellValue();
					int NumericCelValue = (int)CellValue;
					System.out.println("Row[" + i + "] Cell[" + j + "] value: " + NumericCelValue);
				}
			}
			System.out.println("===================");
		}
		/*
		// row
		Row row = sheet.getRow(3);
		// Cell
		Cell cell = row.getCell(0);
		// Celltype
		CellType cellType = cell.getCellType(); // STRING || NUMERIC --> Enum
		System.out.println(cellType);
		// Enum Conditions
		if (cellType.equals(cellType.STRING)) {
			String cellValue = cell.getStringCellValue();
			System.out.println("Row3 Cell0 Value: " + cellValue);

		} else if (cellType.equals(cellType.NUMERIC)) {
			double cellValue = cell.getNumericCellValue();
			// Type Casting double -> Int
			int cellValueInt = (int) cellValue;
			System.out.println("Row3 Cell0 Value: " + cellValueInt);
		}

		// If not a String, We will get IllegalStateException
		/*
		 * IllegalStateException: Cannot get a STRING value from a NUMERIC cell Cannot
		 * get a NUMERIC value from a STRING cell
		 */

	}

}
