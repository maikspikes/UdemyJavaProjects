import java.beans.Customizer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Maik", 29293938.93939, "Maikspikes");

        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());


        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());


        Customer thirdCustomer = new Customer("Jake", "Jake@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());



    }
}
