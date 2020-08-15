package com.tore;
import java.util.Scanner;

        public class Practice1234 {

            public static void main(String[] args) {


                Scanner in = new Scanner(System.in);
//1
                int a = in.nextInt();
                int b = in.nextInt();

                System.out.println(a+b);
//2
                System.out.println("Имя:");
                String name = in.next();
                System.out.println("Фамилия:");
                String surname = in.next();
                System.out.println("Возраст:");
                int age = in.nextInt();

                System.out.println("Имя: " + name);
                System.out.println("Фамилия: " + surname);
                System.out.println("Возраст: " + age);
                //3
                int q = in.nextInt();
                int w = in.nextInt();
                boolean d = q>w;

                System.out.println(d);

                //4
                int u = in.nextInt();
                int j = in.nextInt();
                int m = in.nextInt();

                int p = u+j+m;
                int e = u-j-m;
                int f = u * j * m;

                System.out.println(p);
                System.out.println(e);
                System.out.println(f);


            }
        }



