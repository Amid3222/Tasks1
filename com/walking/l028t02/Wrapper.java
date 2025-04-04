package com.walking.l028t02;

public class Wrapper<T> {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public boolean isObjectNull() {
        return object == null;
    }
}
