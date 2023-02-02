public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone=new Deskphone(123456);

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        ITelephone nilsPhone=new MobilePhone(789456);
        nilsPhone.dial(123456);
        nilsPhone.powerOn();
        nilsPhone.answer();
        nilsPhone.callPhone(789456);
    }
}