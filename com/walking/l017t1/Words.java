package com.walking.l017t1;

enum Words {
    HELLO("Hi", "Hello"), BYE("Bye", "Good Bye"), HOWAREYOU("How are you", "How are you doing"), UNKOWN("Unknown word");
    private final String word;
    private String rightWord;

    Words(String word, String rightWord) {
        this.word = word;
        this.rightWord = rightWord;
    }

    Words(String word){
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }

    public String getRightWord() {
        return this.rightWord;
    }
}
