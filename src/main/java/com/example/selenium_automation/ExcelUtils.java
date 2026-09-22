package com.example.selenium_automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static String getCellData(String filePath, String sheetName,
                                     int rowNum, int colNum) throws IOException {

        FileInputStream file = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheet(sheetName);

        Row row = sheet.getRow(rowNum);

        Cell cell = row.getCell(colNum);

        String data = cell.toString();

        workbook.close();
        file.close();

        return data;
    }
}