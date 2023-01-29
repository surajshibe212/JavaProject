package dataDrivenpr;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDiifType {
	@Test
	public void CellOps2() throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\file1.xlsx");
		//XSSFWorkbook workbook=new XSSFWorkbook();
				//OR
		Workbook workbook=new XSSFWorkbook(fis);
		//get the required sheet
		Sheet sheet=workbook.getSheet("Sheet1");
		//get specified row
		Row row=sheet.getRow(3);
		//get cell count on a particular row
		int cellCt=row.getLastCellNum();
		System.out.println("Cell count on row 1: "+cellCt);
		//print all cell data present in 1st row
		for(int i=0;i<cellCt;i++) {
			//get particular cell from the row
			Cell cell=row.getCell(i);
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
			default:
				System.out.print("No valid input");
			}
			System.out.print(" ||");
		}
		System.out.println();

}
}