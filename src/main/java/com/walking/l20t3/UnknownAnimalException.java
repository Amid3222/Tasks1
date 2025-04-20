package com.walking.l20t3;

public class UnknownAnimalException extends RuntimeException {
    private int a;

    public UnknownAnimalException(String message, int a) {
        super(message);
        this.a = a;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + a;
    }
}
