package com.walking.l028t03;

public class FindNumAtList <T>{
    private T[] array;

    public FindNumAtList(T[] array) {
        this.array = array;
    }

    public T findAtList(T num) throws Exception{
        for(T t : array) if (t.equals(num)) return t;
        throw new Exception("Element not found");
    }
}
