package com.tore;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//111
//        String string = in.next();
//        boolean b = false;
//        for (int i = 0; i<string.length()/2;i++){
//            if(string.charAt(i) != string.charAt(string.length()-1-i)){
//                b=false;
//                break;
//            }
//        }
//        if (b){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }
//333
        String s1 = in.next();
        String s2 = in.next();
        if(s1.indexOf(s2)!=-1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}