package com.mindtree.srcc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData 
{
	public static void main(String[] args) throws IOException {
		ExcelData ob = new ExcelData();
		ob.getDataFromExcel("D:\\KeywordDriven\\flipkartRelectionxlsx.xlsx");

	}

	public String[][] getDataFromExcel(String path) throws IOException {
		File file = new File(path);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook myfile = new XSSFWorkbook(inputStream);
		Sheet mysheet = myfile.getSheet("Sheet1");
		
		myfile.close();
		inputStream.close();
	
	}


}
