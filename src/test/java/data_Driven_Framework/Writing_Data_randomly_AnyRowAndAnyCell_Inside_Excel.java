package data_Driven_Framework;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_randomly_AnyRowAndAnyCell_Inside_Excel 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		        // creating excel file 
				FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\Random_data_file.xlsx");
				
				// creating workbook
				XSSFWorkbook workbook = new XSSFWorkbook();
				
				// creating sheet
			    XSSFSheet sheet = workbook.createSheet("Random_data");
			    
			    XSSFRow row3 = sheet.createRow(3);
			  
		        XSSFCell cell = row3.createCell(5);
		      
		        cell.setCellValue("shrinivas");
		        
		        workbook.write(file);
		        
		        workbook.close();
		        
		        file.close();
		        
		        System.out.println("File created successfully.....");
	}
}
