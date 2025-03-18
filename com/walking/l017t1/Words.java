package com.walking.l017t1;

enum Words {
    HELLO("Hi", "Hello"), BYE("Bye", "Good Bye"), HOWAREYOU("How are you", "How are you doing"), UNKOWN("Unknown word", "Гнила");
    private final String word;
    private final String rightWord;

    Words(String word, String rightWord) {
        this.word = word;
        this.rightWord = rightWord;
    }

    public String getWord() {
        return this.word;
    }

    public String getRightWord() {
        return this.rightWord;
    }
}
