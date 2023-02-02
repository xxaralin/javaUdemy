public class OpChallenge {
    public static void main(String[] args){
        double myDouble1=20.00d;
        double myDouble2=80.00d;

        double myTotal=100.00d*(myDouble1+myDouble2);
        double reminder=myTotal%40.00d;

        boolean check=(reminder==0) ? true : false;

         System.out.println(check);

        if(!check){
            System.out.println("got some reminder");
        }
    }
}
