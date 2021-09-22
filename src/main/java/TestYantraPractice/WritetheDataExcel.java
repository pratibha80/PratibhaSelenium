package TestYantraPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritetheDataExcel {
	
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Pratibha\\eclipse-workspace\\SeleniumProject_Maven\\TestData.xlsx");
		
		//Open Woorkbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		Cell cel = row.getCell(8);
		cel.setCellValue("PASS");
		
		
		//Open same workBook in write mode & save the file
			FileOutputStream fos=new FileOutputStream("C:\\Users\\Pratibha\\eclipse-workspace\\SeleniumProject_Maven\\TestData.xlsx");
		wb.write(fos);
		
		
	}

}
