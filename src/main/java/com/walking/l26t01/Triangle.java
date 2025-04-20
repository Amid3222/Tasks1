package com.walking.l26t01;

public class Triangle implements RightShape {


    @Override
    public void drawFigure(int height) {
        System.out.print(drawHeight(height));
        System.out.print(drawWidth(height));
    }

    @Override
    public void getFigure() {
        System.out.println("This is Triangle!");
    }


    private String drawWidth(int height) {
        return HORIZONTAL_LINE.repeat(++height);
    }

    private String drawHeight(int height) {
        StringBuilder lines = new StringBuilder(" ".repeat(height) + "/\\\n");
        int counterLeftSpace = 1;
        int counterMiddleSpace = 2;

        for (int i = 1; i <= height; i++) {
            lines.append(" ".repeat(height - counterLeftSpace++)).append("/").append(" ".repeat(counterMiddleSpace)).append("\\\n");
            counterMiddleSpace += 2;
        }
        return String.valueOf(lines);
    }
}
