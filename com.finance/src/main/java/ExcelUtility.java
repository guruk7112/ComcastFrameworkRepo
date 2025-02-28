

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public String getDataFromExcel(String sheetName , int rowNum , int celNum) throws Exception {
	
	FileInputStream fis=new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String data=wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
	wb.close();
	return data;
}
public int getRowCount(String sheetName) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	int rowNum=wb.getSheet(sheetName).getLastRowNum();
	wb.close();
	return rowNum;
}
public void setDataIntoExcel(String sheetName , int rowNum , int celNum,String data) throws Exception {
	FileInputStream fis=new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(sheetName).getRow(rowNum).createCell(celNum);

	FileOutputStream fos=new FileOutputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
	wb.write(fos);
	wb.close();
	
}
}
