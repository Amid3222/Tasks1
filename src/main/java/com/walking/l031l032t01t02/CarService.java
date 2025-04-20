package com.walking.l031l032t01t02;


import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class CarService {

    private final Car[] cars;

    CarService(Car[] cars) {
        this.cars = cars;
    }

    public void getFromList() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("./resource/CarCatalog.txt"), StandardCharsets.UTF_8);
        int data;
        StringBuilder sb = new StringBuilder();
        while ((data = inputStreamReader.read()) != -1) sb.append((char) data);
        System.out.println(sb);
    }

    public void saveListToFile() {
        StringBuilder sb = new StringBuilder();
        for (Car c : cars) sb.append(CarInfoToString(c)).append("\n");
        try (FileWriter fileWriter = new FileWriter("./resource/CarCatalog.txt")) {
            fileWriter.write(sb.toString());
            System.out.println("Список сохранен\n" + sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String CarInfoToString(Car car) {
        return """              
                Марка: %s
                Год: %d
                Номер: %s
                """.formatted(car.getName(), car.getYear(), car.getNumber());
    }
}
