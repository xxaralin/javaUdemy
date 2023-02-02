public class BankAccount {
    private String accNumber;
    private double accBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount(){
        this("00001",10.0,"Default Name","Default email","Default phone");
        System.out.println("empty constructor called");
    }

    public BankAccount(String accNumber, double accBalance, String customerName, String customerEmail, String customerPhone) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        System.out.println("non empty constructor called");
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(double amount){
        accBalance+=amount;
        System.out.println("Deposited "+amount+", current balance: "+accBalance);
    }
    public void withdraw(double amount){
        if(amount<0){
            System.out.println("invalid amount");
        }
        if(accBalance<amount){
            System.out.println("Not enough balance");
        }else{
            accBalance-=amount;
            System.out.println("Withdrew "+amount+", current balance: "+accBalance);

        }
    }
}
