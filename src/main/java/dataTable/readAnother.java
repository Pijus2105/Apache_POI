package dataTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Process-3

public class readAnother {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public readAnother () throws Exception {
		
		
		File file = new File("C:\\\\Users\\\\PERFECT.DESKTOP-HCSN4U9\\\\eclipse-workspace\\\\ApachePOI\\\\DataTable\\\\Scored.xlsx");
		
		FileInputStream fis = new FileInputStream (file);
		
		wb = new XSSFWorkbook(fis);
	}
	
	public void method(String sheet) {
		this.sheet = wb.getSheet(sheet);
		
	}

	
	public String methodTwo(int row, int cell) {
		String data = sheet.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

}
