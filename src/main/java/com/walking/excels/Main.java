package com.walking.excels;

public class Main {
  public static void main(String[] args) {
    // ExcelService excelService = new ExcelService();
    RandStorage randStorage = new RandStorage();
    for (int i = 0; i < 100; i++) randStorage.putToStorageNameAndCounts();
    randStorage.printMapTester();
    System.out.println(randStorage.keysPoints);




  }
}
