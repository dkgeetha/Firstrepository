
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.gson.Gson;

public class JavaClass {
		

	public static void main(String[] args) throws IOException{
		

ReadFromExcel a=new ReadFromExcel();
//a.readfromexcelmethod();
System.out.println(a.readfromexcelmethod());

// called fromJson() method and passed incoming buffer from json file
// passed obj3 class reference to convert converted result as obj3 object
//obj3 = gson.fromJson(br, POJOClass.class);
		/*
		System.setProperty("webdriver.chrome.driver", "F:\\DriversForBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://investpunjab.gov.in/Account/Login");
	//driver.wait(1000);
		
		Properties pro=new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\ORNew.properties");
		
		//user.div - current directory
		pro.load(file);
		String user= pro.getProperty("Username");
		
		driver.findElement(By.xpath(pro.getProperty("Username"))).sendKeys("user");*/
		

         }
}

		 
		
		 

	
	

	


