public class Sum35Challenge {
    public static void fuck(){
        int sum=0;
        int count=0;
        for(int i=1;i<1000;i++){
            if(i%15==0 && count<5){
                sum+=i;
                System.out.println("number is "+i+", sum is "+sum);
                count++;
            }
        }
    }
    public static void main(String[] args) {
        fuck();

    }
}
