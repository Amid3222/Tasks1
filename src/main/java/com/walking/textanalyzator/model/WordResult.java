package com.walking.textanalyzator.model;
import lombok.Getter;


import java.time.LocalDateTime;

public final class WordResult {
    @Getter
    private final String word;
    private final LocalDateTime timeStamp;

    public WordResult(String word) {
        this.word = word;
        this.timeStamp = LocalDateTime.now();
    }

}
