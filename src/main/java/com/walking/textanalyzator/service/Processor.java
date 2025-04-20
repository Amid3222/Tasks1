package com.walking.textanalyzator.service;

import com.walking.textanalyzator.model.WordResult;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Processor<T extends WordResult> {
//    private List<T> listOfWords;
//    private String regex;
//
//    public Processor(List<T> listOfWords, String regex) {
//        this.listOfWords = listOfWords;
//        this.regex = regex;
//    }

    public boolean processString(String word, String regex) {
        return Pattern.matches(regex, word);
    }

    public List<T> processWordList(List<T> listOfWords, String regex) {
        List<T> tempList = new ArrayList<>();
        for (T word : listOfWords) if (Pattern.matches(regex, word.getWord())) tempList.add(word);
        return tempList;
    }

}
