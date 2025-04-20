package com.walking.textanalyzator.repository;

import com.walking.textanalyzator.model.WordResult;

import java.util.ArrayList;

import java.util.List;

public class WordsStorage {
    private List<WordResult> wordResults = new ArrayList<>();

    public List<WordResult> getWords() {
        return wordResults;
    }

    public void add(String word){
        wordResults.add(new WordResult(word));
    }
}
