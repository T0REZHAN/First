package Lesson83;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("PRESS [1] TO ADD STUDENT \nPRESS [2] TO LIST STUDENT \nPRESS [0] TO EXIT");
            int a = in.nextInt();
            if (a == 1){
                System.out.println("Insert name?");
                String name = in.next();


            }
        }
    }
}

