//package com.tore;
//
//import java.util.Scanner;
//
//public class Domashka6 {
////1-zadanie
//    public static void main(String[] args){
//        String[] input = {"Askar", "aaaa", "ala", "alala"};
//        String []output = filter(input[input[]]);
//        for (int i = 0; i<output.length; i++){
//            if (output[i] != null){
//                System.out.println(output[i]);
//            }
//        }
//
//    }
//    public static String filter(String[] strings){
//        String[] result = new String[strings.length];
//        int index = 0;
//        for (int i = 0; i<strings.length; i++){
//            int count = 0;
//            for (int j = 0; j<strings[i].length(); j++){
//                if (strings[i].charAt(j) == 'a' || strings[i].charAt(j) == 'o' || strings[i].charAt(j) == 'u' || strings[i].charAt(j) == 'e' || strings[i].charAt(j) == 'i'){
//                    count++;
//
//                    if (count>3){
//                        result[index] = strings[i];
//                        index++;
//                        break;
//                    }
//                }
//            }
//        }
//        return result[index];
//    }
//}