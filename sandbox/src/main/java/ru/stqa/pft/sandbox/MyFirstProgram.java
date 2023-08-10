package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        String somebody = "world";
        System.out.println("Hello, " + somebody + "!");

        int l = 4;
        int s = l * l;
        System.out.println("Площадь квадрата со стороной " + l + "=" + s);

        double ll = 4.0;
        double ss = ll * ll;
        System.out.println("Площадь квадрата со стороной " + ll + "=" + ss);
    }
}