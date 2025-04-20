package com.walking.textanalyzator.service;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
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
            log.info("Файл прочитан");
            return sb.toString();
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        return "";
    }

    public void writeToFile(String string) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeFile))) {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            log.info("Файл записан");
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }
}
