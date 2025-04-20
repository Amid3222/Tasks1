package com.walking.textanalyzator.service;

import com.walking.textanalyzator.model.WordResult;
import com.walking.textanalyzator.repository.WordsStorage;

import java.util.Comparator;

public class WordService {

    private WordsStorage wordsStorage = new WordsStorage();
    private Processor<WordResult> processor = new Processor<>();
    private String regex;

    private static class WordLenghtComparator implements Comparator<WordResult> {
        @Override
        public int compare(WordResult o1, WordResult o2) {
            return o1.getWord().length() - o2.getWord().length();
        }
    }

    public void add(String text) {
        String[] words = text.split(" ");
        for (String word : words) if (processor.processString(word, regex)) wordsStorage.add(word);
    }

    public void sort() {
        wordsStorage.getWords().sort(Comparator.comparing(WordResult::getWord).thenComparing(new WordLenghtComparator()));
    }
}
