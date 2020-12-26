package com.syntax.class36;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path="/Users/Elias_iMac/Desktop/TestData.xlsx";
        System.out.println(path);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();//used to manipulate the file with extension xlsx
        Sheet sheet=xssfWorkbook.getSheet("PersonData");
        
        List<PersonInfo> personInfoList=new ArrayList<>();
        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
            Row row=sheet.getRow(i);

        }
    }
}
