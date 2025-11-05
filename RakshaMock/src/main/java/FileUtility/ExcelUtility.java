package FileUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String readdatafromExcel1(String Sheet, int row, int cell) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\aaven\\AdvanceSeleniumTekPyramid\\RakshaMock\\src\\test\\java\\TestData\\Advancemock1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		wb.close();
		return data;

	}

	public void writeDatabackToExcel1(String Sheet, int row, int cell, String Price) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\aaven\\AdvanceSeleniumTekPyramid\\RakshaMock\\src\\test\\java\\TestData\\Advancemock1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheet);
		Cell Row = sh.getRow(row).createCell(cell);
		Row.setCellValue(Price);

		FileOutputStream fos = new FileOutputStream("C:\\Users\\aaven\\AdvanceSeleniumTekPyramid\\RakshaMock\\src\\test\\java\\TestData\\Advancemock1.xlsx");
		wb.write(fos);
		wb.close();
	}
	public int getRowcount(String sheet) throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\aaven\\AdvanceSeleniumTekPyramid\\RakshaMock\\src\\test\\java\\TestData\\Advancemock1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet(sheet).getLastRowNum();
		wb.close();
		
		return rowcount;
	}

}
