package data_Driven_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class confusion_script 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
	//	FileInputStream file = new FileInputStream("D:\\Users\\HP\\eclipse-workspace\\selenium_maven_project\\testdata\\data.xlsx");
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// XSSFSheet sheet = workbook.getSheetAt(0);
		
        int TotalRows = sheet.getLastRowNum();
        
        int TotalCells =sheet.getRow(0).getLastCellNum();
        
        System.out.println("Total number of rows : "+TotalRows);
        System.out.println("Total number of rows : "+TotalCells);
        
        for(int r=0; r<=TotalRows; r++)
        {
        	  XSSFRow  currentRow = sheet.getRow(r);
        	  
        	for(int c=0; c<TotalCells; c++)
        	{
        		XSSFCell currentcell = currentRow.getCell(c);
        		System.out.print(currentcell.toString()+"\t");
        	}
        }
        
       System.out.println();
       
       workbook.close();
       
       file.close();
	}
}
