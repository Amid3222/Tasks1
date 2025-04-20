package com.walking.l25t01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Выберите тип фигуры(треугольник/квадрат):");
        Scanner scanner = new Scanner(System.in);

        RightShape triangle = new RightShape() {

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

        };

        RightShape square = new RightShape() {

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
        };

        switch (scanner.nextLine()) {
            case "треугольник":
                System.out.printf("\nВведите длинну стороны:");
                triangle.drawFigure(scanner.nextInt());
                triangle.getFigure();
                break;
            case "квадрат":
                System.out.printf("\nВведите длинну стороны:");
                square.drawFigure(scanner.nextInt());
                square.getFigure();
                break;
        }


    }
}

