package com.syntax.class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo4 {
    public static void main(String[]args) throws IOException {

        String path="/Users/Elias_iMac/Desktop/Syntax/eclipse-workspace/eclipse-workspace/JavaBatch8/src/com/syntax/class35/Test.xlsx";
        System.out.println(path);

        FileInputStream fileInputStream=new FileInputStream(path);//creating the connection
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);//creating the object
        Sheet sheet= workbook.getSheet("FirstPage");//accessing the sheet
        for (int row = 0; row <sheet.getPhysicalNumberOfRows() ; row++) {
            Row rowData=sheet.getRow(row);
            for (int j = 0; j < rowData.getPhysicalNumberOfCells() ; j++) {
                System.out.print(rowData.getCell(j)+" ");
            }
            System.out.println();
        }
        //Row row= sheet.getRow(1);
       // Cell cell= row.getCell(0);
//        String firstName=row.getCell(0).getStringCellValue();
//        String lastName=row.getCell(1).getStringCellValue();
//        String hobby=row.getCell(2).getStringCellValue();
//        int age= (int) row.getCell(3).getNumericCellValue();
//
//        System.out.println(firstName+" "+lastName+" "+hobby+" "+age);




    }
}
