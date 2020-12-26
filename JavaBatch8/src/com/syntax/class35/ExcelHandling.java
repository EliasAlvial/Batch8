package com.syntax.class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHandling {
    public static void main(String[] args) throws IOException {
        String path="/Users/Elias_iMac/Desktop/Syntax/eclipse-workspace/eclipse-workspace/JavaBatch8/src/com/syntax/class35/Test.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);

        Workbook workbook=new XSSFWorkbook(fileInputStream);//these two files are needed to work inside the spreadsheets
        //wokbook comes fist
        Sheet sheet=workbook.getSheet("Sheet1");
        //then sheet
        Row row=sheet.getRow(0);
        //then row
        Cell cell= row.getCell(0);
        System.out.println(cell.toString());

    }
}
