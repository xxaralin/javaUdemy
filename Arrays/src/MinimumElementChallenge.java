import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {
        int[] readArray=readIntegers();
        int min=findMin(readArray);
        System.out.println("min value in array "+ Arrays.toString(readArray)+" is "+min);
    }
    public static int[] readIntegers(){

        /*
        *yani virgülle ayırarak veri girip yazmaca
        * String input=scanner.nextLine();
        * String[] splits=input.split(",");
        * int[] values=new int[splits.length]
        * */
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter size");
        String input=scanner.nextLine();
        int size=Integer.parseInt(input);

        int[] array=new int[size];

        for(int i=0;i<size;i++){
            Scanner inToArray=new Scanner(System.in);
            String getArrayElement=inToArray.nextLine();
            array[i]=Integer.parseInt(getArrayElement);
        }
        return array;
    }
    public static int findMin(int[] array){
        int min=array[0];
        for(int i=0;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
