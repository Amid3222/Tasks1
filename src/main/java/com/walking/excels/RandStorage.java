package com.walking.excels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandStorage {

  private RandomService randomService = new RandomService();
  private final Map<Integer, String> namesAndPointsHashMap = new HashMap<>();
  private String nameKeys;
  public List<Integer> keysPoints = new ArrayList<>();

  public void sortDecrementMap() {
    keysPoints.sort(Comparator.reverseOrder());
  }

  public int getPlayerPoints(int i){
    return keysPoints.get(i);
  }

  public String getPlayerName(int i){
    return namesAndPointsHashMap.get(keysPoints.get(i));
  }

  public void putToStorageNameAndCounts() {
    int tempPointVar = randomService.createRandomPoints();
    this.namesAndPointsHashMap.put(tempPointVar, randomService.createRandomName());
    keysPoints.add(tempPointVar);
  }

  public void printMapTester() {
    System.out.println(namesAndPointsHashMap);
  }

  public List<Integer> getNameKeys() {
    return keysPoints;
  }
}
