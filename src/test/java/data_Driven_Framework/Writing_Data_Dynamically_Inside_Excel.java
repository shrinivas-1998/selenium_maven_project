package data_Driven_Framework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_Dynamically_Inside_Excel 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		// creating excel file 
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\dynamic_file.xlsx");
		
		// creating workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// creating sheet
	    XSSFSheet sheet = workbook.createSheet("Dynamic_data");
	    
	    // taking input by using scanner class 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("how many rows you want?");
	    int NoOfRows = sc.nextInt();
	    
	    System.out.println("how many cells you want?");
	    int NoOfCells = sc.nextInt();
	    
	    for(int r=0; r<=NoOfRows; r++)
	    {
	    	   XSSFRow CurrentRow=sheet.createRow(r);
	    	
	    	for(int c=0; c<NoOfCells; c++)
	    	{
	    	    XSSFCell Cell = CurrentRow.createCell(c);
	    	    Cell.setCellValue(sc.next());
	    	}
	    }
	    
	    workbook.write(file);
	    workbook.close();
	    file.close();
	    
	    System.out.println("File is created.....");
	}
}
