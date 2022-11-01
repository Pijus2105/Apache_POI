package dataTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

//Process-1
public class readClass {
	
	@Test
	public void readSheet() throws Exception {
		
		
	String pathExcel = "C:\\Users\\PERFECT.DESKTOP-HCSN4U9\\eclipse-workspace\\ApachePOI\\DataTable\\Scored.xlsx";
		String file = "DataTable";
		String sheet = "Test";
		
		
		
		
	    File fileFetch = new File(pathExcel);		
		
	    FileInputStream fin=new FileInputStream(fileFetch);  
		
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		
	    XSSFSheet sheetTest = wb.getSheet(sheet);
		
	    int countRow = sheetTest.getPhysicalNumberOfRows();
		System.out.println(countRow);

		
		
		String data = sheetTest.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
	
		for(int i=0; i<countRow; i++) {
			Row row = sheetTest.getRow(i);
			
			for(int j=0; j <row.getLastCellNum();j++) {
				String dataNumeric = sheetTest.getRow(i).getCell(j).getStringCellValue();
				
				System.out.println(dataNumeric +"");
			}
			System.out.println();
		}
	
	}

}
