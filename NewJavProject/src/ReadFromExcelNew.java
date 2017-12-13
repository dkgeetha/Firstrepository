import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelNew {

	public static void main(String[] args) throws IOException {
		
		FileInputStream filepath=new FileInputStream("C:\\Users\\Geetha\\Desktop\\Book1.xlsx");
		XSSFWorkbook excelbook=new XSSFWorkbook(filepath);
		XSSFSheet excelsheet= excelbook.getSheet("Sheet1");
		
		int totalrowcount= excelsheet.getLastRowNum()-excelsheet.getFirstRowNum();
		
		ArrayList <String> storeexcelvlues=new ArrayList<String>();
		
		for(int i=1;i<=totalrowcount;i++)
		{
			int cellcount=excelsheet.getRow(i).getLastCellNum();
			
			for (int j=0;j<=cellcount-1;j++)
			{
		String value= excelsheet.getRow(i).getCell(j).getStringCellValue();
		
		 storeexcelvlues.add(value);
		 
		//continue;
			}
		} 
		
			for(String a:storeexcelvlues)
			{
			//	System.out.println(a);
			}
			
		}
		
		
		

	}

