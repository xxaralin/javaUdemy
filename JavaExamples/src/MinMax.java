import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String num;
        int inputNum,loopCount=0;
        int min=0, max=0;
        do {
            System.out.println("Enter a number, or any character to exit");
            num=scanner.nextLine();

            try{
                inputNum=Integer.parseInt(num);

                if(loopCount==0||min>inputNum){
                    min=inputNum;
                }
                if(loopCount==0||inputNum>max){
                    max=inputNum;
                }
                System.out.println("max number is: "+max+" min number is : "+min);
                loopCount++;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid Number");
                break;
            }
        }while(true);
    }
}
