public class Customer {
    private String name;
    private double credit;
    private String address;


    public Customer(){
        this("Default name","Default address");
    }
    public Customer(String name, String address){
        this(name,1000,address);
    }
    public Customer(String name, double credit, String address){
        this.name=name;
        this.credit=credit;
        this.address=address;
    }
    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getAddress() {
        return address;
    }

}
