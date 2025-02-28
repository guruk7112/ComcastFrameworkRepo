package ad_selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_read_Data_on_expected_Condition {
	public static void main(String[] args) throws Exception {
		
	
        String data1="";
        String data2="";
        String data3="";
		String expecteddata="tc_02";
		boolean flag=false;
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("org");
		
		int rowcount=sh.getLastRowNum();
	//	String data=" ";
		for(int i=0;i<=rowcount;i++) {
			String data;
			try {
			 data=sh.getRow(i).getCell(0).toString();
			 if(data.equals(expecteddata)) {
				 flag=true;
				 data1=sh.getRow(i).getCell(1).toString();
				 data2=sh.getRow(i).getCell(2).toString();
				 data3=sh.getRow(i).getCell(3).toString();
			 }
			}
			catch(Exception e) { 
			}
			if(flag==true) {
				
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
			}
			else{
			System.out.println("test case not found");
		}
	
			wb.close();
			
		}

	}
}


