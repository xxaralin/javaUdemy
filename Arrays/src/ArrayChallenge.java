import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] randomArray=getRandomArray(10);
        int[] reversedArray=reversed(randomArray,10);
        System.out.printf("bla");
    }
    public static int[] getRandomArray(int len){
        Random random=new Random();
        int [] randomArray=new int[len];

        for(int i=0;i<len;i++){
            randomArray[i]=random.nextInt(1000);
        }
        return randomArray;
    }
    public static int[] reversed(int[] randomArray,int len){
        System.out.println("random array:");
        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);

        System.out.println("sorted array:");
        System.out.println(Arrays.toString(randomArray));

        int[] reversedArray=new int[len];
        for(int i=0;i<len;i++){
            reversedArray[i]=randomArray[len-1-i];
        }
        System.out.println("reversed array:");
        System.out.println(Arrays.toString(reversedArray));
        return reversedArray;
    }
}
