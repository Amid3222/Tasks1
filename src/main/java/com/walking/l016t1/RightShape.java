package com.walking.l016t1;

/*public abstract class RightShape {
    public abstract void drawFigure(int height);
} */

interface RightShape {
    void drawFigure(int height);

    default void getFigure() {
        System.out.println("Default figure");
    }
}
