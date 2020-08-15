package Lesson8;

public class Main {
    public static void main(String[] args){
        Student[] students = new Student[3];
        students[0] = new Student(1, "Dana", "Akimova", 5 );
        students[1] = new Student(2, "Askar", "Askarov", 4);
        students[2] = new Student(3, "Akim", "Aidosov", 3);
        for (int i = 0; i<students.length; i++){
            students[i].getStudentData();
        }
    }
    public static void topStudent(Student students[]){

    }
}
