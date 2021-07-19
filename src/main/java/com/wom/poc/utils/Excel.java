package com.wom.poc.utils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class Excel {
    public static int rowCount;
    public static void excelLength(String filepath, String sheetName) throws IOException {
        File excelFile = new File(filepath);
        FileInputStream inputStream = new FileInputStream(excelFile);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
    }

    public void writeExcel(Row currentRow, String value) {
        Cell cell = currentRow.createCell(currentRow.getLastCellNum());
        cell.setCellValue(value);
    }

    public static String getCellValue(String filepath, String sheetName, int rowNumber, int cellNumber) throws IOException {
        excelLength(filepath,sheetName);
        File excelFile = new File(filepath);
        FileInputStream inputStream = new FileInputStream(excelFile);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(cellNumber);
        return cell.getStringCellValue();
    }



}
