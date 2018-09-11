package com.mindtree.srcc;

public class Driver {

	public static void main(String[] args)
	{
		String test="ChangePasswordTest";
		ExcelData xls=new ExcelData("C:\\Users\\M1047283\\Documents");
		int rows=xls.getRowCount("Sheet1");

	}

}
