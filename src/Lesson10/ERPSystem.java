package Lesson10;

public class ERPSystem {
    private User []memory = new User[1000]; ////максимум 1000 пользователей
    private int sizeOfUsers = 0;
    public void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }
    public void printAllUsers(){
        System.out.println(memory[sizeOfUsers]);
    }
    public void printUser(int index){
        if (index == sizeOfUsers){
            System.out.println(memory[sizeOfUsers]);
        }
        else System.out.println("No user in this index");
    }
}
