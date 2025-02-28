package ad_selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readdata_From_ExcelTest {
public static void main(String [] args)  throws Throwable, IOException{
	
	//steps1 : get the excel path location and java object of the physical file
	FileInputStream fis=new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
	Properties po=new Properties();
	
	//step2 : open workbook in read mode
	Workbook wb=WorkbookFactory.create(fis);
	
 //step3 : get the control of the "org" sheet
   Sheet sh=wb.getSheet("org");
   
   //step4 : get the control of the "1st" row
  Row ro=  sh.getRow(1);
  
  //step5 : get the control of the "2nd"cell and read the string data
// Cell cll= ro.getCell(2);
// String data=cll.getStringCellValue(); 
// System.out.println(data);
  
  double data=ro.getCell(3).getNumericCellValue();  
  System.out.println(data);
 
 // step6 : close the workBook
 wb.close();
 
	
}
}
