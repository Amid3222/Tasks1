package com.walking.l019t1;

import java.util.Scanner;

public class CarService {

    private final Car[] cars;

    CarService(Car[] cars) {
        this.cars = cars;
    }

    public String carFound(Car car) {
        if (car == null) return "Не найдено";
        return """
                Найдено!
                Марка: %s
                Год: %d
                Номер: %s
                """.formatted(car.getName(), car.getYear(), car.getNumber());
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
