package com.tore;

import java.util.Scanner;

public class Practice56 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

    //5-задание
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//a3 + 2b2 – 3ab + c3
        System.out.println(Math.pow(a,3)+2*Math.pow(b,2)-3*a*b+Math.pow(c,3));
    //6-задание
        int d = in.nextInt();
        int e = in.nextInt();

        System.out.println(Math.sqrt(d*d+e*e));



    }
}