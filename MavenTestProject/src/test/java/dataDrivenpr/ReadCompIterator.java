package dataDrivenpr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadCompIterator {

	@Test
	public void readComp() throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\file1.xlsx");
		//XSSFWorkbook workbook=new XSSFWorkbook();
				//OR
		Workbook workbook=new XSSFWorkbook(fis);
		//get the required sheet
		Sheet sheet=workbook.getSheet("Sheet1");
		int sheetCt=workbook.getNumberOfSheets();
		System.out.println("Sheet count is: "+sheetCt);
		
		Iterator iterator=sheet.iterator();
		
		while(iterator.hasNext()) {
			XSSFRow row=(XSSFRow) iterator.next(); 
			Iterator cellIt=row.cellIterator();
			while(cellIt.hasNext()) {
				XSSFCell cell=(XSSFCell) cellIt.next();
				
				switch(cell.getCellType()) {
				case XSSFCell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case XSSFCell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case XSSFCell.CELL_TYPE_BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				default:
					System.out.print("No valid input");
				}
				System.out.print(" || ");
			}	
            System.out.println();
			}
		}
		
	}

