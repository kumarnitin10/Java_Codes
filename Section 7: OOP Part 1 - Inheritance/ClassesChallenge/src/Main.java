public class Main {

    public static void main(String[] args) {

        Account account = new Account();


        account.setAccountNumber(20250240844L);
        account.setAccountBalance(100000);
        account.setCustomerName("Kumar Nitin");
        account.setEmail("kumarnitin10081999@gmail.com");
        account.setPhoneNumber(7667183048L);

        account.deposite(20000);
        account.withdraw(10000);


    }

}
