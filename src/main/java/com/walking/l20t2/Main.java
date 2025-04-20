package com.walking.l20t2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputValidationException {
        System.out.print("Выберите тип фигуры(треугольник/квадрат):");
        RightShape figure;
        Scanner scanner = new Scanner(System.in);
        String figureType = scanner.nextLine();
        if (figureType.equals("треугольник")) figure = new Triangle();
        else if (figureType.equals("квадрат")) figure = new Square();
        else throw new InputValidationException("Такая фигура не существует: ", figureType);
        System.out.printf("\nВведите длинну стороны:");
        figure.drawFigure(scanner.nextInt());
        scanner.close();

     /*   switch (scanner.nextLine()) {
            case "треугольник":
                System.out.printf("\nВведите длинну стороны:");
                RightShape triangle = new Triangle();
                triangle.drawFigure(scanner.nextInt());
                triangle.getFigure();
                break;
            case "квадрат":
                System.out.printf("\nВведите длинну стороны:");
                RightShape square = new Square();
                square.drawFigure(scanner.nextInt());
                square.getFigure();
                break;
        }
*/
    }
}

