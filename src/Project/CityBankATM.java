package Project;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("AccountNumber:");
            String accountnumber = in.next();
            System.out.println("PinCode:");
            String pincode = in.next();
            int choose = 0;
            for (int i = 0; i<Database.allAccounts.length; i++){
                if (Database.allAccounts[i].getAccountNumber().equals(accountnumber) && Database.allAccounts[i].getPinCode().equals(pincode)){
                    System.out.println("PRESS [1] TO CASH WITHDRAWAL \nPRESS [2] TO VIEW BALANCE \nPRESS [3] TO CHANGE PIN CODE \nPRESS [4] TO CASH IN ACCOUNT \nPRESS [5] TO VIEW ACCOUNT DATA \nPRESS [6] TO EXIT");
                }
                choose = in.nextInt();
                if (choose == 2){
                    System.out.println("Balance:" + Database.allAccounts[i].totalBalance());
                }
                if (choose == 5){
                    System.out.println(Database.allAccounts[i].accountData());
                }
                if (choose == 6){
                    break;
                }
                if (choose == 3){
                    System.out.println("Old PinCode:");
                    String oldpin = in.next();
                    if (oldpin.equals(Database.allAccounts[i].getPinCode())){
                        System.out.println("New PinCode:");
                        String newpin = in.next();
                        Database.allAccounts[i].setPinCode(newpin);
                    }
                    else{
                        break;
                    }
                }
                else if (!Database.allAccounts[i].getAccountNumber().equals(accountnumber) || Database.allAccounts[i].getPinCode().equals(pincode)){
                    System.out.println("Непрвильный номер или пинкод");
                    break;
                }
            }
        }
    }
}
