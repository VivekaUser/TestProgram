package com.serv.TestData;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestData {

	/*
	 * TestData for the First scenario
	 * 
	 */
	@DataProvider(name = "excelData_tc01")
	public Object[][] exceldataprovider_tc01() {
		Object[][] testdata = getExcelData_tc01("C:\\Users\\viveka.s\\OneDrive - HCL TECHNOLOGIES LIMITED\\Desktop\\TrainingSDET\\AspireLearningJourney_Training\\Eclipse_Workspace\\SwagLabs\\src\\test\\resources\\SwagLabsScenarios.xlsx","LoginData");
		return testdata;
	}

	public String[][] getExcelData_tc01(String Filename, String Sheetname) {
		String[][] data = null;
		try {
			
			FileInputStream file = new FileInputStream(Filename);

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheets = workbook.getSheet(Sheetname);

			XSSFRow row = sheets.getRow(0);

			int numRows = sheets.getPhysicalNumberOfRows();
			int numCols = row.getLastCellNum();

			Cell cell;

			//System.out.println("Rows- " + numRows + "  Cols- " + numCols);
			data = new String[numRows - 1][numCols];
			for (int i = 1; i < numRows; i++) 
			{
				for (int j = 0; j < numCols; j++) 
				{
					row = sheets.getRow(i);
					cell = row.getCell(j);
					data[i - 1][j] = cell.getStringCellValue();
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("Error is: " + e);
		}
		return data;
	}
	
	/*
	 * TestData for the Second scenario
	 * 
	 */
	
	@DataProvider(name = "excelData_tc02")
	public Object[][] exceldataprovider_tc02() {
		Object[][] testdata = getExcelData_tc02("C:\\Users\\viveka.s\\OneDrive - HCL TECHNOLOGIES LIMITED\\Desktop\\TrainingSDET\\AspireLearningJourney_Training\\Eclipse_Workspace\\SwagLabs\\src\\test\\resources\\SwagLabsScenarios.xlsx","InventoryData");
		return testdata;
	}

	public String[][] getExcelData_tc02(String Filename, String Sheetname) {
		String[][] data = null;
		try {
			
			FileInputStream file = new FileInputStream(Filename);

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheets = workbook.getSheet(Sheetname);

			XSSFRow row = sheets.getRow(0);

			int numRows = sheets.getPhysicalNumberOfRows();
			int numCols = row.getLastCellNum();

			Cell cell;

			//System.out.println("Rows- " + numRows + "  Cols- " + numCols);
			data = new String[numRows - 1][numCols];
			
			for (int i = 1; i < numRows; i++) 
			{
				for (int j = 0; j < numCols; j++) 
				{
					row = sheets.getRow(i);
					cell = row.getCell(j);
					data[i - 1][j] = cell.getStringCellValue();
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("Error is: " + e);
		}
		return data;
	}

	/*
	 * TestData for the Third TestCase
	 * 
	 */

	@DataProvider(name = "excelData_tc03")
	public Object[][] exceldataprovider_tc03() {
		Object[][] testdata = getExcelData_tc03("C:\\Users\\viveka.s\\OneDrive - HCL TECHNOLOGIES LIMITED\\Desktop\\TrainingSDET\\AspireLearningJourney_Training\\Eclipse_Workspace\\SwagLabs\\src\\test\\resources\\SwagLabsScenarios.xlsx","BookOrder");
		return testdata;
	}

	public String[][] getExcelData_tc03(String Filename, String Sheetname) {
		String[][] data = null;
		try {
			
			FileInputStream file = new FileInputStream(Filename);

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheets = workbook.getSheet(Sheetname);

			XSSFRow row = sheets.getRow(0);

			int numRows = sheets.getPhysicalNumberOfRows();
			int numCols = row.getLastCellNum();

			Cell cell;

			//System.out.println("Rows- " + numRows + "  Cols- " + numCols);
			data = new String[numRows - 1][numCols];
			
			for (int i = 1; i < numRows; i++) 
			{
				for (int j = 0; j < numCols; j++) 
				{
					row = sheets.getRow(i);
					cell = row.getCell(j);
					data[i - 1][j] = cell.getStringCellValue();
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("Error is: " + e);
		}
		return data;
	}
}