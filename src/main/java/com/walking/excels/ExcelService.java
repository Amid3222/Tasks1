package com.walking.excels;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelService {

  RandStorage randStorage;
  private XSSFWorkbook workbook = new XSSFWorkbook();
  private XSSFSheet sheet = workbook.createSheet("Players Table");
  private XSSFRow row;
  public XSSFCell cel;

  private void setRow(int num) {
    row = sheet.createRow(num);
  }

  public void saveFile() throws IOException { //<-я хз че это, но IDE попросила добавить.
    FileOutputStream out = new FileOutputStream("testa3.xlsx");
    workbook.write(out);
    workbook.close();
  }

  public void setRowData(int rowNum, String cellText) {
    setRow(rowNum);
    String[] pointsAndNameString = cellText.split(" ");
    int one = 0;

    for (int i = 0; i < 2; i++) {
      row.createCell(i).setCellValue(pointsAndNameString[one++]);
    }
  }

  public void setHeader(String a, String b) {
    setRow(0);
    row.createCell(0).setCellValue(a);
    row.createCell(1).setCellValue(b);
  }
}
