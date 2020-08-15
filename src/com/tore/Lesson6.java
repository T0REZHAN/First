package com.tore;

import java.util.Scanner;

public class Lesson6 {
//222
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String text = in.next();
//        int result = result(text);
//        System.out.println(result);
//    }
//    public static int result(String text){
//        int count = 0;
//        for(int i=0;i<text.length();i++){
//            if (text.charAt(i)=='a' ||text.charAt(i)=='e'|| text.charAt(i)=='i'|| text.charAt(i)=='o'||text.charAt(i)=='u' ){
//                count++;
//            }
//        }
//        return count;
//333
//        public static void main(String[] args) {
//            Scanner in  = new Scanner(System.in);
//            int n = in.nextInt();
//            int array[] = new int[n];
//            for (int i = 0; i<array.length; i++){
//                array[i] = in.nextInt();
//            }
//            int result = result(array);
//            System.out.println(result);
//    }
//        public static int result(int[] a){
//            int count = 0;
//            for (int i = 0; i<a.length; i++){
//                if (a[i]!=0){
//                    count++;
//                }
//            }
//            return count;
//        }
//444
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][]array = new int[n][m];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                array[i][j] = in.nextInt();
            }
        }
    }
    public static int zero(int []a) {
        int count = 0;
        return count;
    }
}