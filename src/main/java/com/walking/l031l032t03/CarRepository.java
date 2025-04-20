package com.walking.l031l032t03;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;


public class CarRepository {

    public void getListFromFile() {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("./resource/CarCatalog.txt"), StandardCharsets.UTF_8);) {
            int data;
            StringBuilder sb = new StringBuilder();
            while ((data = inputStreamReader.read()) != -1) sb.append(Character.toString(data));
            System.out.println("\nСписок из файла:\n" + sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCarFromFile(int carIndex, Car[] cars) {
        String carName = cars[carIndex].getName();
        cars[carIndex] = null;
        saveListToFile(cars);
        System.out.printf("Авто %s удалено", carName);
    }

    public void saveNewCarToFile(String carString) {
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("./resource/CarCatalog.txt", true), StandardCharsets.UTF_8)) {
            outputStreamWriter.write(carString);
            System.out.println("Авто добавлено!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveListToFile(Car[] cars) {
        StringBuilder sb = new StringBuilder();
        for (Car c : cars) sb.append(CarService.carInfoToString(c)).append("\n");
        try (FileWriter fileWriter = new FileWriter("./resource/CarCatalog.txt")) {
            fileWriter.write(sb.toString());
            System.out.println("Список сохранен\n" + sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
