package com.tore;

import java.util.Scanner;

public class Domashka2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//1-zadanie
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
//2-zadanie
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        if (c > d && c > e) {
            System.out.println(c);
        } else if (d > c && d > e) {
            System.out.println(d);
        } else if (e > d && e > c) {
            System.out.println(e);
        }
//3-zadanie
        int f = in.nextInt();
        int g = in.nextInt();
        int h = in.nextInt();
        if (f + g > h && f+h>g && g+h>f) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
//4-zadanie
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        if(i>j && i>k && j<k) {
            System.out.println(i - j);
        }
        else if(i>j && i>k && k<j) {
            System.out.println(i - k);
        }
        else if(j>i && j>k && i<k) {
            System.out.println(j - i);
        }
        else if(j>i && j>k && k<i) {
            System.out.println(j - k);
        }
        else if(k>i && k>j && i<j) {
            System.out.println(k - i);
        }
        else if(k>i && k>j && j<i) {
            System.out.println(k - j);
        }
//5-zadanie
        System.out.println("Координаты ладьи(два числа):");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Координаты другой фигуры (два числа):");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if(x1==x2 || y1==y2) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
//6-zadanie
        System.out.println("Координаты слона:");
        int x11 = in.nextInt();
        int y11 = in.nextInt();
        System.out.println("Координаты другой фигуры:");
        int x22 = in.nextInt();
        int y22 = in.nextInt();
        if(x11+x22==y11+y22 || x11-x22==y11-y22) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
     }
    }