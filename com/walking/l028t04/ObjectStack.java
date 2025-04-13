package com.walking.l028t04;

import com.sun.jdi.InvalidStackFrameException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectStack<T> {

    public List<T> stack = new ArrayList<>();

    public void addToStack(T t) {
        stack.add(t);
    }


    public void removeFromStack() throws InvalidStackFrameException {
        //if (!stack.contains(t)) throw new InvalidStackFrameException("Element does not exist"); <- нужно ли? ведь по LIFO мы поидее ток послдений/первый удалить можем.
        stack.removeLast();
    }

    public int getDeep() {
        return stack.size();
    }

    public T findInStack(T t) throws InvalidStackFrameException {
        if (stack.contains(t)) return t;
        throw new InvalidStackFrameException("Element does not exist");
    }

    @Override
    public String toString(){
        return Arrays.toString(stack.toArray());
    }
}
