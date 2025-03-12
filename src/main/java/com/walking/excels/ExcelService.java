package com.walking.excels;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;

public class ExcelService {
  RandStorage randStorage;
  private HSSFWorkbook workbook;
  private HSSFSheet sheet = workbook.createSheet("Players Table");
  private HSSFRow row;
  public HSSFCell cel;

  public void setRow(int num) {
    row = sheet.createRow(num);
  }

  public void setCellsData(){

  }

  public void setCel(int num) {
    cel = row.createCell(num);
  }


}
