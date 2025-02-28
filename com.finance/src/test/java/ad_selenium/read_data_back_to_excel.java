package ad_selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_data_back_to_excel {
public static void main(String [] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("org");
	Row row=sh.getRow(1);
	
	Cell cll=row.createCell(3);
	cll.setCellType(CellType.STRING);
	cll.setCellValue("notk");
	
	//close the excel in downtab / workbook
	FileOutputStream fos =new FileOutputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
	wb.write(fos);
	
	wb.close();
	System.out.println("=====executed=====");
	
	
}
}
