package com.walking.textanalyzator;

import com.walking.textanalyzator.repository.WordsStorage;
import com.walking.textanalyzator.service.IOFileService;
import com.walking.textanalyzator.service.Processor;
import com.walking.textanalyzator.service.WordService;
import lombok.extern.slf4j.Slf4j;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String regex = "[А-Я]{1}[а-я]{5,}";
        IOFileService ioFileService = new IOFileService();
        ioFileService.readFile = new File("./resources/textToRead.txt");
        ioFileService.writeFile = new File("./resources/textToWrite.txt");
        WordService wordService = new WordService(new WordsStorage(), new Processor<>(), regex);
        wordService.add(ioFileService.readFromFile());
        wordService.sort();
        ioFileService.writeToFile(wordService.getWordsStorage().toString());

    }
}
