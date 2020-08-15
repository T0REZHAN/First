package Lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("PRESS [1] TO ADD STUDENT \nPRESS [2] TO LIST USERS \nPRESS [0] TO EXIT");
            int choose = in.nextInt();
            if (choose == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT \nPRESS [2] TO ADD TEACHER");
                int choose2 = in.nextInt();
                if (choose2 == 1) {
                    System.out.println("Login:");
                    String login = in.next();
                    System.out.println("Password:");
                    String password = in.next();
                    System.out.println("Name:");
                    String name = in.next();
                    System.out.println("Surname:");
                    String surname = in.next();
                    System.out.println("Group:");
                    String group = in.next();
                    System.out.println("GPA:");
                    double gpa = in.nextDouble();
                    Student student = new Student(0, login, password, name, surname, group, gpa);
                    System.out.println(student);
                } else if (choose2 == 2) {
                    System.out.println("Login:");
                    String login = in.next();
                    System.out.println("Password:");
                    String password = in.next();
                    System.out.println("NickName:");
                    String nickname = in.next();
                    System.out.println("Status:");
                    String status = in.next();
                    System.out.println("PRESS [1] TO ADD SUBJECT \nPRESS [0] TO FINISH ADDING SUBJECT");
                    int choose3 = in.nextInt();
                    if (choose3 == 1) {
                        System.out.println("Subject:");
                        String subject = in.next();
                    } else if (choose3 == 0) continue;
                }
            }
        }
    }
}
