/* 1st
public class Account {


    private long accountNumber;
    private long accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposite(long amount){
        accountBalance += amount;
        System.out.println("Your current Balance is : " + accountBalance);
    }

    public void withdraw(long amount){
        accountBalance -= amount;

        if(accountBalance < 0){
            System.out.println("Can't process this transaction, Not Sufficient Balance");
        }else{
            System.out.println("Your current Balance is : " + accountBalance);
        }
    }
}
*/







public class Account {


    private long accountNumber;
    private long accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public Account(){
        this(56789, 2, "Default Name", "Default Address", 9430579121L);
        System.out.println("Empty constructor called");
    }
    public Account(long accountNumber, long accountBalance, String customerName, String email, long phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, long phoneNumber) {
        this(99999, 100, customerName,email, phoneNumber);
    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposite(long amount){
        accountBalance += amount;
        System.out.println("Your current Balance is : " + accountBalance);
    }

    public void withdraw(long amount){
        accountBalance -= amount;

        if(accountBalance < 0){
            System.out.println("Can't process this transaction, Not Sufficient Balance");
        }else{
            System.out.println("Your current Balance is : " + accountBalance);
        }
    }
}