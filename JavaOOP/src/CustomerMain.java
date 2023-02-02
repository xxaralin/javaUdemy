public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1=new Customer("nil",1000,"nilo@email.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getCredit());
        System.out.println(customer1.getAddress());

        Customer cus2=new Customer();
        System.out.println(cus2.getName());
        System.out.println(cus2.getCredit());
        System.out.println(cus2.getAddress());

        Customer cus3=new Customer("mofet","mofett@who.com");
        System.out.println(cus3.getName());
        System.out.println(cus3.getCredit());
        System.out.println(cus3.getAddress());
    }
}
