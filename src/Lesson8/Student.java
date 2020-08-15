package Lesson8;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student(){
        this.id = 0;
        this.name = "Noname";
        this.surname = "Noname";
        this.gpa = 0.0;
    }
    public Student(int id, String name, String surname, double gpa){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    public void getStudentData(){
        System.out.println("ID: " + id+" " + "Name: " + name+" " + "Surname: " + surname+" " + "GPA: " + gpa);
    }
    public String toString(){
        return id+" "+name+" "+surname+" "+gpa;
    }
}
