package dataDrivenpr;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadComplete {
	
	@Test
	public void readComppleteSheetData() throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\file1.xlsx");
		//XSSFWorkbook workbook=new XSSFWorkbook();
				//OR
		Workbook workbook=new XSSFWorkbook(fis);
		//get the required sheet
		Sheet sheet=workbook.getSheet("Sheet1");
		
		int rows =sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		System.out.println("Total Rows:"+rows);
		System.out.println("Total Columns:"+cols);
		
		for(int r=0;r<=rows;r++) {
			Row row=sheet.getRow(r);
			for(int c=0;c<=cols;c++) {
				Cell cell=row.getCell(c);
				cell=row.getCell(c, org.apache.poi.ss.usermodel.Row.CREATE_NULL_AS_BLANK );

				switch(cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.print("  ");
//				default:
//					System.out.print(" ");
				}
				System.out.print(" || ");
				}
			System.out.println();
			}
		
	
	}
}


