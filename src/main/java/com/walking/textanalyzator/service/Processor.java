package com.walking.textanalyzator.service;

import com.walking.textanalyzator.model.WordResult;
import lombok.Generated;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Slf4j
public class Processor<T extends WordResult> {
    @Getter
    private Logger logger = new Logger();

    @Getter
    public static class Logger {
        private int wordCounter = 0;
    }

    public boolean processString(String word, String regex) {
        if (Pattern.matches(regex, word)) {
            logger.wordCounter++;
            log.debug("%d слово %s добавлено".formatted(logger.wordCounter, word));
            return true;
        }
        return false;

    }

    public List<T> processWordList(List<T> listOfWords, String regex) {
        List<T> tempList = new ArrayList<>();
        for (T word : listOfWords) {
            if (Pattern.matches(regex, word.getWord())) {
                tempList.add(word);

            }
        }
        return tempList;
    }

}
