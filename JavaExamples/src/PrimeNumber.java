public class PrimeNumber {
    public static void main(String[] args) {
        for(int a=0;a<50;a++){
            if(isPrime(a)){
                System.out.println(a+" is prime");
            }

        }
    }
    public static boolean isPrime(int num){
        boolean prime=false;
        int i;
        for(i=2;i<=num;i++){
            if(num%i==0){
                prime=false;
                break;
            }
            else{
                continue;
            }

        }
        if(i==num){
            prime=true;
        }
        return prime;
    }
}
