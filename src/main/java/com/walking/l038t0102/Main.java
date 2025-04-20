package com.walking.l038t0102;

public class Main {


    static Car[] initArrayCars() {
        Car car1 = new Car("Mercedes_E350", 2017, "100RR31", "RED");
        Car car2 = new Car("BMW_i30", 2019, "100RR33", "BLUE");
        Car car3 = new Car("Mazda_MX5", 2012, "100RR32", "GREY");
        Car car4 = new Car("Lexus_ls500", 2023, "100RR34", "WHITE");
        return new Car[]{car1, car4, car2, car3};
    }

    public static void main(String[] args) {
        CarService carService = new CarService(initArrayCars());
        System.out.println(carService.getCars());
        System.out.println("[eq");
        carService.sort();
        System.out.println(carService.getCars().reversed());

    }

}
