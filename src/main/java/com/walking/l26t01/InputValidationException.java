package com.walking.l26t01;

public class InputValidationException extends Exception {
    private String figType;

    InputValidationException(String message, String figType) {
        super(message);
        this.figType = figType;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + figType;
    }


}
