package com.walking.l014t1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Выберите тип фигуры(треугольник/квадрат):");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextLine()) {
            case "треугольник":
                System.out.printf("\nВведите длинну стороны:");
                RightShape triangle = new Triangle();
                triangle.drawFigure(scanner.nextInt());
                break;
            case "квадрат":
                System.out.printf("\nВведите длинну стороны:");
                RightShape square = new Square();
                square.drawFigure(scanner.nextInt());
                break;
        }


    }
}
