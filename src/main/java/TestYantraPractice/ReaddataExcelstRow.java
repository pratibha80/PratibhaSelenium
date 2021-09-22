package TestYantraPractice;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddataExcelstRow {

	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Pratibha\\eclipse-workspace\\SeleniumProject_Maven\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int count = sh.getLastRowNum();
		for(int i=1; i<count;i++)
		{
			Row row = sh.getRow(i);
			String firstcolData = row.getCell(0).getStringCellValue();
			String secondcolData = row.getCell(1).getStringCellValue();
			System.out.println(firstcolData + "\t" +secondcolData);
		}
		
		
		
	}
	
	
}
