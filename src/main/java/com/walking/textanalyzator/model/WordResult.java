package com.walking.textanalyzator.model;
import java.time.LocalDateTime;

public final class WordResult {
    private final String word;
    private final LocalDateTime timeStamp;

    public WordResult(String word) {
        this.word = word;
        this.timeStamp = LocalDateTime.now();
    }

    public String getWord() {
        return word;
    }
}
