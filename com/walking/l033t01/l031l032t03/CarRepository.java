package com.walking.l033t01.l031l032t03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;


public class CarRepository {

    private File file = new File("./resource/CarCatalog.txt");

    public void getListFromFileVar2() {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)), StandardCharsets.UTF_8)) {
            int data;
            StringBuilder sb = new StringBuilder();
            while ((data = inputStreamReader.read()) != -1) sb.append(Character.toString(data));
            System.out.println("\nСписок из файла:\n" + sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getListFromFileVar3() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            int data;
            StringBuilder stringBuilder = new StringBuilder();
            while ((data = bufferedReader.read()) != -1) stringBuilder.append((char) data);
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void getListFromFile() {
        try (FileReader fileReader = new FileReader(file)) {
            char[] buffer = new char[2048];
            StringBuilder stringBuilder = new StringBuilder();
            int readCounts;
            while ((readCounts = fileReader.read(buffer)) != -1) {
                stringBuilder.append(buffer, 0, readCounts);
            }
            System.out.println(stringBuilder);
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
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8)) {
            outputStreamWriter.write(carString);
            System.out.println("Авто добавлено!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveListToFile(Car[] cars) {
        StringBuilder sb = new StringBuilder();
        for (Car c : cars) sb.append(CarService.carInfoToString(c)).append("\n");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(sb.toString());
            System.out.println("Список сохранен\n" + sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveListToFileVar1(Car[] cars) {
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(file)))) {
            for (Car c : cars) outputStreamWriter.write(CarService.carInfoToString(c));
            outputStreamWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
