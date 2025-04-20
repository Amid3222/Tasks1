package com.walking.l20t2;

/*public abstract class RightShape {
    public abstract void drawFigure(int height);
} */

import java.util.Scanner;

interface RightShape {
    void drawFigure(int height);

    default void getFigure() {
        System.out.println("Default figure");
    }
}
