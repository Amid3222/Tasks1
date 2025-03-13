package com.walking.l014t1;

public class Triangle extends RightShape {

    @Override
    public void drawFigure(int width, int height) {
        //
        System.out.println(drawWidth(width));

    }

    private String drawWidth(int width) {
        return "-".repeat(width);
    }

    private String drawHeight(int height) {

        String space = " ";
        String HeaderOfTrinage = space.repeat(height) + "/\\\n";
        StringBuilder lines = new StringBuilder(space.repeat(height) + "/\\\n");
        int counterLeftSpace = 1;
        int counterMiddleSpace = 2;

        for (int i = 1; i <= height; i++) {
            lines.append(space.repeat(height - counterLeftSpace++)).append("/").append(space.repeat(counterMiddleSpace)).append("\\\n");
            counterMiddleSpace += 2;
            //space.repeat(1);
        }

        return null;


    }
}
