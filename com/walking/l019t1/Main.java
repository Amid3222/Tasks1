package com.walking.l019t1;

import java.util.Scanner;

public class Main {

    static Car[] initArrayCars() {
        Car car1 = new Car("Mercedes_E350", 2017, "100RR31");
        Car car2 = new Car("BMW_i30", 2019, "100RR33");
        Car car3 = new Car("Mazda_MX5", 2012, "100RR32");
        Car car4 = new Car("Lexus_ls500", 2023, "100RR34");
        return new Car[]{car1, car4, car2, car3};
    }

    public static void main(String[] args) {
        CarService carService = new CarService(initArrayCars());
        String result = carService.carFound(carService.searchCar(carService.carCreate()));
        System.out.println(result);
    }
}
