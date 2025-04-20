package com.walking.textanalyzator.service;

import com.walking.textanalyzator.model.WordResult;
import com.walking.textanalyzator.repository.WordsStorage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;


import java.util.Comparator;

@Slf4j
@AllArgsConstructor
public class WordService {
    @Getter
    private WordsStorage wordsStorage;
    private Processor<WordResult> processor;
    private String regex;

    private static class WordLenghtComparator implements Comparator<WordResult> {
        @Override
        public int compare(WordResult o1, WordResult o2) {
            return o1.getWord().length() - o2.getWord().length();
        }
    }

    public void add(String text) {
        String[] words = text.split(" ");
        log.info("Считано %d исходных слов".formatted(words.length));
        for (String word : words) if (processor.processString(word, regex)) wordsStorage.add(word + " ");
        log.info("Найдено слов %d".formatted(processor.getLogger().getWordCounter()));
    }

    public void sort() {
        wordsStorage.getWords().sort(Comparator.comparing(WordResult::getWord).thenComparing(new WordLenghtComparator()));
        log.info("Слова отсортированы");
    }
}
