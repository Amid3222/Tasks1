package com.walking.excels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandStorage {

  private RandomService randomService = new RandomService();
  public final Map<Integer, String> namesAndPointsHashMap = new HashMap<>();
  private String nameKeys;
  public List<Integer> keysPoints = new ArrayList<>();
  public List<String> namesAndPointsList = new ArrayList<>();



  public void sortDecrementMap() {
    keysPoints.sort(Comparator.reverseOrder());
  }

  public void putToStorageNameAndCounts() {
    int tempVarPoints = randomService.createRandomPoints();
    keysPoints.add(tempVarPoints);
    namesAndPointsHashMap.put(
        tempVarPoints, randomService.createRandomName() + " " + tempVarPoints);
  }

  public void printMapTester() {
    System.out.println(namesAndPointsHashMap);
  }
}
