package dataTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateCellCol {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	
      public void Another(String SheetName, String cellValue, int row, int col) throws Exception {
	
	  File file = new File("C:\\\\Users\\\\PERFECT.DESKTOP-HCSN4U9\\\\eclipse-workspace\\\\ApachePOI\\\\DataTable\\\\Scored.xlsx");
	
	  FileInputStream fis = new FileInputStream(file);
	  
	  wb = new XSSFWorkbook(fis);
	  
	  sheet = wb.getSheet(SheetName);
	  sheet.getRow(row).createCell(col).setCellValue(cellValue);
	
	  FileOutputStream fos = new FileOutputStream(file);
	
	  wb.write(fos);
	
	  wb.close();
} 
	
}
