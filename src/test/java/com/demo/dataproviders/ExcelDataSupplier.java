package com.demo.dataproviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {

	@DataProvider (name="getdata")
	public static Object[][] getData() throws IOException {
		
		File excelfile=new File("C:\\Workspace\\TestNG\\resources\\testdata.xlsx");
		System.out.println(excelfile.exists());
		// Raw data 
		FileInputStream fis=new FileInputStream(excelfile);
		// we need to convert raw data in xls or xlsx -- excel format
		XSSFWorkbook wb=new XSSFWorkbook(fis); // pass the raw data 
		XSSFSheet sheet=wb.getSheet("Sheet1");
		sheet.getPhysicalNumberOfRows();
	    int numofrows=sheet.getPhysicalNumberOfRows();
	    int noofcols= sheet.getRow(0).getLastCellNum();
	    Object [] [] data=new Object [numofrows-1][noofcols];
		System.out.println(sheet.getLastRowNum());
		for (int i=0;i<numofrows-1;i++)
		{
			for (int j=0;j<noofcols;j++)	
			{
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			//	System.out.println(	df.formatCellValue(sheet.getRow(i).getCell(j)));
		//	System.out.println(	sheet.getRow(i).getCell(j).getStringCellValue());
			}
		//	System.out.println();
		}
		wb.close();
		fis.close();
		/*
		 * for (Object[] dataarr:data) { System.out.println(Arrays.toString(dataarr)); }
		 */
		
		return data;
	}

}
