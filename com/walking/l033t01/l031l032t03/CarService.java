package com.walking.l033t01.l031l032t03;

import java.util.Arrays;

public class CarService {

    private Car[] cars;

    private CarRepository carRepository = new CarRepository();

    public CarService() {

        Car[] cars = {
                new Car("Mercedes_E350", 2017, "100RR31"),
                new Car("BMW_i30", 2019, "100RR33"),
                new Car("Mazda_MX5", 2012, "100RR32"),
                new Car("Lexus_ls500", 2023, "100RR34")};
        this.cars = cars;
        carRepository.saveListToFile(cars);
       // carRepository.getListFromFile();
    }

    public void deleteCarByName(String name) {
        for (int i = 0; i < cars.length; i++) {
            Car c = cars[i];
            if (c.getName().equals(name)) {
                carRepository.deleteCarFromFile(i, cars);
                return;
            }
        }
        System.out.println("такое авто не существует");
    }

    public CarRepository getCarRepository() {
        return carRepository;
    }

    public Car[] getCars() {
        return cars;
    }

    public void createNewCarInList(String name, int year, String number) {
        Car[] newCar = Arrays.copyOf(getCars(), getCars().length + 1);
        newCar[newCar.length - 1] = new Car(name, year, number);
        setCars(newCar);
        carRepository.saveNewCarToFile(carInfoToString(newCar[newCar.length - 1]));
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public static String carInfoToString(Car car) {
        if (car == null) return "";
        return """              
                Марка: %s
                Год: %d
                Номер: %s
                """.formatted(car.getName(), car.getYear(), car.getNumber());
    }
}

