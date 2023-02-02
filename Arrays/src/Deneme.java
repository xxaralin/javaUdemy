import java.util.Arrays;
import java.util.Random;

public class Deneme {
    public static void main(String[] args) {
        int [] myArray= new int[]{1,23,4,5,6,89,9};
        myArray[0]=1;

        double [] doubleArray= new double[10];
        doubleArray[3]=3.5;

        int [] newArray=new int[5];
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+" ");
        }

        System.out.println();

        for(int element : myArray){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.print(Arrays.toString(myArray));

        Object objVar=myArray;
        if(objVar instanceof int[]){
            System.out.println("its int innit");
        }

        Object objArray[]=new Object[3];
        objArray[0]=15;
        objArray[1]=1.5;
        objArray[2]="lol";
        System.out.print(Arrays.toString(objArray));


        int[] firstArray=getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int [] secondArray=new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int [] thirdArray=getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray=Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(thirdArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        String[] sArray={"Able","Jane", "Mark","Ralph","David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray,"Mark")>=0){
            System.out.println("Mark is on the list");
        }

        int[] s1={1,2,3,4,5};
        int[] s2={2,1,3,4,5};
        if(Arrays.equals(s1,s2)){
            System.out.println("thry are the same");
        }else{
            System.out.println("thry are not the same");
        }


    }
    private static int[] getRandomArray(int len){
        Random random=new Random();
        int[] newInt=new int [len];
        for(int i=0;i<len;i++ ){
            newInt[i]=random.nextInt(100);
        }
        return newInt;
    }




}
