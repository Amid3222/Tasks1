package com.walking.l26t01;

public class Square implements RightShape {
    @Override
    public void drawFigure(int height) {
        createHorizontal(height);
        createVertical(height);
        createHorizontal(height);
        System.out.println(figBuilder);
    }

    @Override
    public void getFigure() {
        System.out.println("This is Square!");
    }

    // метод создания горизонтальных линий
    private void createHorizontal(int x) {
        figBuilder.append(SPACE + "\n"); // создание левого верхнего угла пробела
        figBuilder.append(HORIZONTAL_LINE.repeat(x));// создание горизонтальных линий
        figBuilder.append("\n");
    }

    // метод создания вертикальных линий
    private void createVertical(int x) {
        for (int j = 0; j < x - 1; j++) { // создание вертикальных линий
            figBuilder.append(VLINE);
            figBuilder.append(SPACE.repeat(x + 5));
            figBuilder.append(VLINE + "\n"); // смещение по строке`
        }
    }
}
