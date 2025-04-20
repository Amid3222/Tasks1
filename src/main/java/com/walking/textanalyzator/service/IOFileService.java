package com.walking.textanalyzator.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class IOFileService {
    public File readFile;
    public File writeFile;

    public String readFromFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(readFile))) {
            StringBuilder sb = new StringBuilder();
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                sb.append(string).append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public void writeToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeFile))) {

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
