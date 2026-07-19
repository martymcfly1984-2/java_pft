package ru.stqa.pft.sandbox;

import ru.stqa.pft.sandbox.homework.Point;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alex");
        hello("go!");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со тороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Плащадь прямоугольника со старанами " + r.a + " и " + r.b + " = " + r.area());

        int cr = 5;
        double p = 3.14;
        System.out.println("Площадь круга c радиусом " + cr + " = " + area(cr, p));

        double x = 2;
        double y = 4;
        double h = 3;
        System.out.println("Площадь трапеции равна " + area(x, y, h));

        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(4.0, 8.0);
        System.out.println("Растояние между точками равно " + p1.distance(p2));
    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }

    // Круг Сircle
    public static double area(int r, double p) {
        return p * r * r;
    }

    // Трапеция trapezoid
    public static double area(double x, double y, double h) {
        return (x + y) / 2 * h;
    }

}