public class MainBank {
    public static void main(String[] args) {
        //BankAccount account1 = new BankAccount("1234",800.50,"Nil Lara Tan","blabla@hotmail.com","05337106845");
        BankAccount account1 = new BankAccount();
        account1.deposit(150);
        account1.withdraw(300);
        account1.withdraw(800);

    }


}
