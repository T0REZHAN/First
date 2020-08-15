package com.tore;

import java.util.Scanner;

public class iii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//1
//        int n = in.nextInt();
//
//        int mass[] = new int[n];
//
//        for(int i = 0;i<mass.length; i++){
//            mass[i]=in.nextInt();
//        }
//        for(int i = mass.length-1;i>=0; i--){
//            System.out.println(mass[i]+" ");
//        }
//2
//        int n = in.nextInt();
//
//        int mass[] = new int[n];
//
//        for(int i = 0;i<mass.length; i++){
//           mass[i]=in.nextInt();
//       }
//        int sum = 0;
//        for(int i = 0; i < mass.length; i++){
//            sum = sum + mass[i];
//        }
//        int avg = sum/mass.length;
//        System.out.println(sum);
//        System.out.println(avg);
//3
//        int n = in.nextInt();
//
//        int mass[] = new int[n];
//
//        for(int i = 0; i < mass.length; i++){
//            mass[i]=in.nextInt();
//        }
//        int max = 0;
//        for(int i = 0; i<mass.length; i++){
//            if(mass[i] > max){
//                max = mass[i];
//            }
//        }
//        System.out.println(max);
//        int min = 999999;
//        for(int i = 0; i<mass.length; i++){
//            if(mass[i] < min){
//                min = mass[i];
//            }
//        }
//        System.out.println(min);
//4
//        int n = in.nextInt();
//
//        int mass[] = new int[n];
//
//        for(int i = 0; i<mass.length;i++){
//            mass[i]=in.nextInt();
//        }
//        int max = 0;
//        for(int i = 0; i<mass.length; i++){
//            if(mass[i] > max){
//                max = mass[i];
//            }
//        }
//        System.out.println(max);
//        int min = 999999;
//        for(int i = 0; i<mass.length; i++){
//            if(mass[i] < min){
//                min = mass[i];
//            }
//        }
//        System.out.println(min);
//        int sum = 0;
//        for(int i = 0; i < mass.length; i++) {
//            sum = sum + mass[i];
//        }
//        System.out.println(sum-max-min);
        int n = in.nextInt();

        int mass[] = new int[n];

        for(int i = 0; i<mass.length;i++){
            mass[i]=in.nextInt();
        }
        int m = in.nextInt();
        for (int i = 0; i<mass.length; i++){
            if(m==mass[i]){
                System.out.println("YES" + " Index: " + i + ",Number: " + mass[i]);
            }
            else{
                System.out.println("NO");
            }
        }
    }
}