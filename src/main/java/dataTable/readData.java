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

//Process-2

public class readData{

@DataProvider(name = "data_Provider")

public Object [][] readSheet(Method method) throws Exception{
	
	File fileName = new File("C:\\\\Users\\\\PERFECT.DESKTOP-HCSN4U9\\\\eclipse-workspace\\\\ApachePOI\\\\DataTable\\\\Scored.xlsx");
	FileInputStream fis = new FileInputStream(fileName);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
     
	XSSFSheet sheet = wb.getSheet(method.getName());
	
	int rowcount = sheet.getPhysicalNumberOfRows();
	int colcount= sheet.getRow(1).getLastCellNum();
	
	Object [][] array = new Object [rowcount-1] [colcount-1];
	
	DataFormatter formatter = new DataFormatter();
	
	for (int i=1; i<rowcount; i++) {
		XSSFRow row = sheet.getRow(i);
		for(int j = 1; j<colcount; j++) {
			XSSFCell cell = row.getCell(j);
			array[i-1][j-1]=formatter.formatCellValue(cell);
		}
		
	}
	wb.close();
	fis.close();
	return array;
}
}
