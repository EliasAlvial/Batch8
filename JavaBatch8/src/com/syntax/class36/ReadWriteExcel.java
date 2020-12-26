package com.syntax.class36;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteExcel {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "/Users/Elias_iMac/Desktop/TestData.xlsx";
        System.out.println(inputFilePath);
        String outputFilePath = "/Users/Elias_iMac/Desktop/OutputData.xlsx";
        System.out.println(outputFilePath);

        FileInputStream fileInputStream = new FileInputStream(inputFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);

        XSSFWorkbook inputXSSFWorkbook = new XSSFWorkbook(fileInputStream);

        XSSFWorkbook outputXSSFWorkbook = new XSSFWorkbook();

        Sheet sheet = inputXSSFWorkbook.getSheet("PeronData");
        List<PersonInfo> personInfoList = new ArrayList<>();
        for (int i = 0; i <sheet.getPhysicalNumberOfRows() ; i++) {
            Row row=sheet.getRow(i);
            PersonInfo personInfo=new PersonInfo();
            personInfo.setFirstName(row.getCell(0).getStringCellValue());
            personInfo.setLastName(row.getCell(1).toString());
            personInfo.setAge((int)row.getCell(2).getNumericCellValue());
            personInfo.setSalary(row.getCell(3).getNumericCellValue());
            if(personInfo.getSalary()>100000){
                personInfoList.add(personInfo);
            }


        }
        System.out.println(personInfoList);

        XSSFSheet outputSheet= outputXSSFWorkbook.createSheet("OutputSheet");
        for (int i = 0; i <personInfoList.size() ; i++) {
            XSSFRow row=outputSheet.createRow(i);
            PersonInfo personInfo=personInfoList.get(i);

            row.createCell(0).setCellValue(personInfo.getFirstName());//returns the first line of the excel?
            row.createCell(0).setCellValue(personInfo.getLastName());
            row.createCell(0).setCellValue(personInfo.getAge());
            row.createCell(0).setCellValue(personInfo.getSalary());
        }

        outputXSSFWorkbook.write(fileOutputStream);
    }
}
