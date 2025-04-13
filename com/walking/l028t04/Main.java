package com.walking.l028t04;

public class Main {
    public static void main(String[] args) {
        ObjectStack<Integer> integerObjectStack = new ObjectStack<>();
        integerObjectStack.addToStack(115);
        integerObjectStack.addToStack(1153);
        integerObjectStack.addToStack(11521);
        integerObjectStack.addToStack(1151);
        System.out.println(integerObjectStack);
        integerObjectStack.removeFromStack();
        System.out.println(integerObjectStack);
        System.out.println(integerObjectStack.findInStack(115));
        System.out.println(integerObjectStack.getDeep());

    xa(integerObjectStack);
    }

    public static void xa(ObjectStack<?> obj){

    }
}
