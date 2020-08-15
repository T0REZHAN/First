package Project;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];

    static{

        allAccounts[3] = new CityBankAccount("Ilyas","Zhuanyshev",1000,"0102", "20000");

        allAccounts[1] = new CityBankAccount("Erbol","Assanbek",5000,"0101", "10000");

        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev",6000,"01023", "2000");

        allAccounts[0] = new CityBankAccount("Tore", "Zhan", 5000, "1597", "0000");

    }
}

