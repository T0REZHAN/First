package Lesson83;

public class Student {
    String name;
    String surname;
    double gpa;

    public Student(){
        this.name = "Noname";
        this.surname = "Noname";
        this.gpa = 0.0;
    }
    public Student(int id, String name, String surname, double gpa){
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    public void getStudentData(){
        System.out.println("Name: " + name+" " + "Surname: " + surname+" " + "GPA: " + gpa);
    }
    public String toString(){
        return name+" "+surname+" "+gpa;
    }
}