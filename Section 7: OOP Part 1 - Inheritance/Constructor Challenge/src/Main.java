public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Kumar Nitin", 10000, "kumarnitin10081999@gmail.com");

        System.out.println(customer.getName() + " has credit limit of " + customer.getCreditLimit() + " and email address is: " + customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName() + " has credit limit of " + secondCustomer.getCreditLimit() + " and email address is: " + secondCustomer.getEmail());


        Customer thirdCustomer = new Customer("Anand", "anand.yadav@ba.com");
        System.out.println(thirdCustomer.getName() + " has credit limit of " + thirdCustomer.getCreditLimit() + " and email address is: " + thirdCustomer.getEmail());

    }
}
