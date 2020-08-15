package com.tore;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
////1
//        int n = in.nextInt();
//
//        for(int i=1;i<=n;i++){
//            System.out.println(i+" "+Math.pow(i,2));
//        }
////2
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = 0;
//        for(int i=0;i<b;i++) {
//            c = c + a;
//        }
//        System.out.println(c);
////3
//        int d = in.nextInt();
//        int e = in.nextInt();
//        for(int i=0; i<=e; i++){
//            System.out.println(Math.pow(d,i));
//        }
////4
//        int a;
//        int sum = 0;
//        int counter = -1;
//        do {
//            counter++;
//            a = in.nextInt();
//            sum += a;
//        }while(a!=0);
//        System.out.println(counter);
//        System.out.println(sum/counter);
////5
        int a;
        int max = 0;
        do {
            a = in.nextInt();
            if (a > max) {
                max = a;
            }
        } while (a != 0);
        System.out.println(max);
    }
}
