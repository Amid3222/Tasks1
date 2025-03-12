package com.walking.excels;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    ExcelService excelService = new ExcelService();
    RandStorage randStorage = new RandStorage();
    for (int i = 0; i < 10; i++) randStorage.putToStorageNameAndCounts();

    randStorage.sortDecrementMap();

    excelService.setHeader("Name", "Points");
    int iterator = 1;
    for (int key : randStorage.keysPoints) {
      excelService.setRowData(iterator++, randStorage.namesAndPointsHashMap.get(key));
    }
    // randStorage.printMapTester();
    excelService.saveFile();
  }
}
