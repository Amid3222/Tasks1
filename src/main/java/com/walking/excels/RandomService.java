package com.walking.excels;

import com.github.javafaker.Faker;

public class RandomService {
  private Faker faker = new Faker();
  private String namePlayer;
  private int valueOfPoints;

  public String createRandomName() {
    return this.namePlayer = faker.name().firstName();
  }

  public int createRandomPoints() {
    return this.valueOfPoints = faker.number().numberBetween(1, 150_000);
  }
}
