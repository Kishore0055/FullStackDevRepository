package com.excel.assignments;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelAssignment1 {
    public static void main(String[] args) {
        writeContents();
    }

    public static void writeContents() {
        String[] flowers = {"rose", "lily", "lotus", "sunflower", "marigold", "hibiscus", "tulip",
                "jasmine", "Diasy", "Lavendar", "Dahlia", "Bluebell", "Waterlily", "Orchid", "Iris",
                "Calendula", "Poppy", "Daffodil", "Snowdrop", "Geranium"};

        try (FileOutputStream fout = new FileOutputStream("D:\\TEMP\\assignments\\Excel1.xlsx");
             Workbook wb = new XSSFWorkbook();
             Sheet sh = wb.createSheet("Flowers")) {

            for (int i = 0; i < 20; i++) {
                Row row = sh.createRow(i);
                Cell cell = row.createCell(0);
                cell.setCellValue(flowers[i]);
            }

            wb.write(fout);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}