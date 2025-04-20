package com.walking.l038t0102;

import java.util.ArrayList;
import java.util.Arrays;


import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class CarService {

    private List<Car> cars = new ArrayList<>();

    CarService(Car[] cars) {
        this.cars.addAll(Arrays.asList(cars));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void sortReverse() {
        getCars().sort(new CarComparator().thenComparing(Car::getColor).thenComparing(Car::getYear).thenComparing(Car::getName).reversed());
        System.out.println(getCars());
    }

    public void sort() {
        getCars().sort(new CarComparator().thenComparing(Car::getColor).thenComparing(Car::getYear).thenComparing(Car::getName));
        System.out.println(getCars());

    }

    public String carFound(Car car) {
        if (car == null) return "Не найдено";
        return car.toString();
    }

    public Car searchCar(Car car) {
        for (Car carFromList : cars) {
            if (carFromList.hashCode() == car.hashCode() && carFromList.equals(car)) return carFromList;
        }
        return null;
    }

    public Car carCreate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер:");
        String number = scanner.nextLine();
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        scanner.close();
        return new Car(year, number);
    }

}
