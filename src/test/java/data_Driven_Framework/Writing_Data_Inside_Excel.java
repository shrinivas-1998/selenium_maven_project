package data_Driven_Framework;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_Inside_Excel {

    public static void main(String[] args) throws IOException {
        // File path adjustment
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");

        // Create workbook and sheet
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("data");

        // Create rows and cells with proper indices
        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("java");
        row1.createCell(1).setCellValue(19);
        row1.createCell(2).setCellValue("automation");

        XSSFRow row2 = sheet.createRow(1); // Changed index from 0 to 1
        row2.createCell(0).setCellValue("python");
        row2.createCell(1).setCellValue(3);
        row2.createCell(2).setCellValue("automation");

        XSSFRow row3 = sheet.createRow(2); // Changed index from 0 to 2
        row3.createCell(0).setCellValue("C#");
        row3.createCell(1).setCellValue(5);
        row3.createCell(2).setCellValue("automation");

        // Write to file and close resources
        workbook.write(file);
        workbook.close();
        file.close();

        System.out.println("File created successfully!");
    }
}
