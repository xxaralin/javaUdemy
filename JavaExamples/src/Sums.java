public class Sums {
    public static int getEvenDigitSum(int num){
        int sum=0;
        int reminder=0;
        if(num<0){
            return -1;
        }else{
            while (num>0){
                reminder=num%10;
                num/=10;
                if(reminder%2==0){
                    sum+=reminder;
                }

                System.out.println(reminder);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println ( getEvenDigitSum(246824683));

           //System.out.println ( getEvenDigitSum(87654321));

    }
}