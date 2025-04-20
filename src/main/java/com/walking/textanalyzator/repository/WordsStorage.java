package com.walking.textanalyzator.repository;

import com.walking.textanalyzator.model.WordResult;
import lombok.ToString;

import java.util.ArrayList;

import java.util.List;

public class WordsStorage {
    private List<WordResult> wordResults = new ArrayList<>();

    public List<WordResult> getWords() {
        return wordResults;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (WordResult s : wordResults) sb.append(s.getWord());
        return sb.toString();
    }

    public void add(String word) {
        wordResults.add(new WordResult(word));
    }
}
