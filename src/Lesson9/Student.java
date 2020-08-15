package Lesson9;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
