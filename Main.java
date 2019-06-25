package com.company;

// Дано любое натуральное 4-х значное чило. Верно, ли все цифры числа различны?*/



public class Main {

    public static void main(String[] args) {
        int a = 1000;
        int b = 8999;
        int rn1 = a + (int) (Math.random() * b);

        System.out.println("случайное число: " + rn1);
        int f = rn1 / 1000;
       // System.out.println("первое  чило  для сравнения  " + f);
        int s = (rn1 % 1000 - rn1 % 100) / 100;
       // System.out.println("второе  чило  для сравнения  " + s);
        int t = (rn1 % 100) / 10;
       // System.out.println("третье число для сравнения   " + t);
        int f1 = rn1 % 10;
       // System.out.println("четвертое число для сравнения " + f1);
        if (f != s && s != t && t != f1 && t != f)
            System.out.println(" Verno ");
    else

    {
        //if (f == s && s == t && t == f) ;
        System.out.println(" ne Verno");
    }

    }
}
