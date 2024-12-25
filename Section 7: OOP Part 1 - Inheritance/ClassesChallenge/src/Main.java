/* 1st
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




 */


public class Main {

    public static void main(String[] args) {

//Account account = new Account(20250240844L, 100000, "Kumar Nitin", "kumarnitin10081999@gmail.com", 7667183048L);

        Account account = new Account();

        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountBalance());

        Account timsAccount = new Account("Tim","tim@email.com", 12345L);
        System.out.println("Account No: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getCustomerName());

    }

}