package data_Driven_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reding_Data_From_Exel 
{
    public static void main(String[] args) throws IOException 
    {
        // File path adjustment
   	 // FileInputStream file = new FileInputStream("D:\\Users\\HP\\eclipse-workspace\\selenium_maven_project\\testdata\\data.xlsx");
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\data.xlsx");
        
        // Create workbook instance
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        
        // Access the sheet by name
        Sheet sheet = workbook.getSheet("Sheet1");
        
        // Get total number of rows and cells
        int totalRows = sheet.getLastRowNum();
        int totalCells = sheet.getRow(0).getLastCellNum(); // Accessing the first row to get total cells
        
        System.out.println("Total number of rows : " + totalRows ); //
        System.out.println("Total number of cells in the first row : " + totalCells);
        
        // Iterate through rows and cells
        for (int r = 0; r <= totalRows; r++) 
        {
            Row currentRow = sheet.getRow(r);
            
            if (currentRow != null) 
            { // Check if row is not null
                for (int c = 0; c < totalCells; c++) 
                {
                    Cell currentCell = currentRow.getCell(c);
                    
                    // Handle null cells
                    String cellValue = (currentCell == null) ? "" : currentCell.toString();
                    System.out.print(cellValue + "\t");
                }
                System.out.println(); // Move to the next line after printing a row
            }
        }
        
        // Close resources
        workbook.close();
        file.close();
    }
}
