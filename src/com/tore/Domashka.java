package com.tore;

import java.util.Scanner;

public class Domashka {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        //1-задание
        int a = 100;
        int b = 200;

        System.out.println(a+b);
        //2-задание
        int c = in.nextInt();
        int d = in.nextInt();

        System.out.println(c*d);
        //3-задание
        System.out.println("Университет:");
        String university = in.next();
        System.out.println("Факультет:");
        String faculty = in.next();
        System.out.println("Предмет:");
        String subject = in.next();

        System.out.println("University: " + university);
        System.out.println("Faculty: " + faculty);
        System.out.println("Subject: " + subject);
        //4-задание
        System.out.println("a=");
        int e = in.nextInt();
        System.out.println("b=");
        int f = in.nextInt();
        System.out.println("c=");
        int g = in.nextInt();
        boolean q = e+f>g;

        System.out.println(q);
        //5-задание
        System.out.println("x=");
        double x = in.nextInt();
        System.out.println("y=");
        double y = in.nextInt();
        System.out.println("z=");
        double z = in.nextInt();
     //x4 + 4xy2 – 4yz + z4
        System.out.println(Math.pow(x,4)+4*x*Math.pow(y,2)-4*y*z+Math.pow(z,4));
    }
}