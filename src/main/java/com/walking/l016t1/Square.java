package com.walking.l016t1;

public class Square implements RightShape {
    @Override
    public void drawFigure(int height) {
        createHorizontal(height);
        createVertical(height, height);
        createHorizontal(height);
    }

    @Override
    public void getFigure() {
        System.out.println("This is Square!");
    }

    // метод создания горизонтальных линий
    private void createHorizontal(int x) {
        System.out.printf(" "); // создание левого верхнего угла пробела
        final String HLINE = "--";
        String lines = "";
        for (int a = 0; a < x; a++) { // создание горизонтальных линий
            lines += HLINE;
        }
        System.out.print(lines);
    }

    // метод создания вертикальных линий
    private void createVertical(int x, int y) {

        System.out.printf("\n"); // смещение по строке
        for (int j = 0; j < y - 1; j++) { // создание вертикальных линий
            final String VLINE = "|";
            System.out.printf(VLINE);
            for (int i = 0; i < x + 5; i++) { // создание пробелов между вертикальными линиями

                System.out.printf(" ");
            }
            System.out.println(VLINE); // смещение по строке`
        }
    }
}
