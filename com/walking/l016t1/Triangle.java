package com.walking.l016t1;

public class Triangle implements RightShape {
    private int height;

    @Override
    public void drawFigure(int height) {
        this.height = height;
        System.out.print(drawHeight(height));
        System.out.print(drawWidth());
    }

    @Override
    public void getFigure() {
        System.out.println("This is Triangle!");
    }


    private String drawWidth() {
        return "--".repeat(++height);
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
