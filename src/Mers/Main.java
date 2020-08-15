package Mers;

public class Main {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("New Group");
        Car car1 = new Car(threadGroup, "Ferrari", 100, 500);
        Car car2 = new Car(threadGroup, "Mercedes", 120, 500);
        Car car3 = new Car(threadGroup, "Bugatti", 125, 500);

        car1.start();
        car2.start();
        car3.start();

        while (threadGroup.activeCount()>0){
        }

        System.out.println(55);
    }
}
