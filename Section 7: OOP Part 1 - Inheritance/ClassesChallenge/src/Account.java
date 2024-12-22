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
