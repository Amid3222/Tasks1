package com.walking.l031l032t03;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CarService carService = new CarService();
        carService.createNewCarInList("тест118", 2398, "0234r8");
        carService.getCarRepository().getListFromFile();
        carService.deleteCarByName("тест118");
        carService.getCarRepository().getListFromFile();
    }

}
