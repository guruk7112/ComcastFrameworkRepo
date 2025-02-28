package ad_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ddt_read_multiple_data_from_excel {

	public static void main(String[] args) throws Throwable{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		
		
		
		for(int i=0;i<=20;i++) {
			Row row=sh.getRow(i);
			String column1data=row.getCell(0).toString();
			String column2data=row.getCell(1).toString();
		
		System.out.println(column1data+" "+column2data);
	
		}
		wb.close();
		

	}

}
