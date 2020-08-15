package Mers;

public class Car extends Thread{
    private int speed;
    private double distance;

    public Car() {
    }

    public Car(ThreadGroup threadGroup, String name, int speed, double distance) {
        super(threadGroup, name);
        this.speed = speed;
        this.distance = distance;
    }
    public void run(){
        try{
            double distance1 = 0;
            for (int i = 0; i<5; i++){
                distance1 = distance1 + speed;
                System.out.println(getName() + " " + i + " is in " + distance1 + " meters");
                if (distance1 >= distance){
                    Thread.interrupted();
                }else{
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
