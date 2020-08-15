package com.tore;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
////1
//        int n = in.nextInt();
//
//        if(n>=10 && n<=20){
//
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//
////2
//        System.out.println("Введите сумму в тенге: ");
//        double amount = in.nextDouble();
//
//        System.out.println("Выберите валюту: \n [1]USD \n [2]EUR \n [3]GBP");
//        int choice = in.nextInt();
//
//        if(choice==1){
//            System.out.println(amount/320 +" USD");
//        }else if(choice==2){
//            System.out.println(amount/360 +" EUR");
//        }else if(choice==3){
//            System.out.println(amount/420 +" GBP" );
//        }
//
////3
//
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        if(a%b==0){
//            System.out.println("Divisible");}
//        else{
//            System.out.println("NOT Divisible");}

//6

        System.out.println("Choose your branch:" +
                "1 - Science, 2 - Humanitarian subjects:");

        int Choose = in.nextInt();

        if(Choose==1){
            System.out.println("1 - Math, 2 - Physics:");
            int Choose2 = in.nextInt();
            if(Choose2==1){
                System.out.println("You are Financier");
            }
            else if(Choose2==2){
                System.out.println("You are Engineer");
            }
        }
        if(Choose==2){
            System.out.println("1 - History, 2 - Foreign Languages:");
            int Choose3 = in.nextInt();
            if(Choose3==1){
                System.out.println("You are Historic or Diplomat");}
            else if(Choose3==2){
                System.out.println("You are Translator");}
            }
        }
        }


