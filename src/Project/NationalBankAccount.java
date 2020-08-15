package Project;

public class NationalBankAccount implements BankAccount{
    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return null;
    }
    public String getPinCode() {
        return null;
    }
    public void setPinCode(String pinCode) {

    }
    public int totalBalance() {
        return 0;
    }
    public void creditBalance(int credit) {

    }
    public void debetBalance(int debet) {

    }
    public String accountData() {
        return null;
    }
}
