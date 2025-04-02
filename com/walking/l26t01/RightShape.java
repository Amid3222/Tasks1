package com.walking.l26t01;

/*public abstract class RightShape {
    public abstract void drawFigure(int height);
} */

interface RightShape {
    StringBuilder figBuilder = new StringBuilder();
    String HORIZONTAL_LINE = "--";
    String SPACE = " ";
    String VLINE = "|";
    void drawFigure(int height);

    default void getFigure() {
        System.out.println("Default figure");
    }
}
