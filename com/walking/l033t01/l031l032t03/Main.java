package com.walking.l033t01.l031l032t03;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CarService carService = new CarService();
        // carService.createNewCarInList("тест118", 2398, "0234r8");
        System.out.println("Тест Вариант 1");
        carService.getCarRepository().getListFromFile();

        System.out.println("Тест Вариант 2");
        carService.getCarRepository().getListFromFileVar2();
        //carService.deleteCarByName("тест118");


    }
}
