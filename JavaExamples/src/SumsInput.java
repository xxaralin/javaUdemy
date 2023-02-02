import java.util.Scanner;

public class SumsInput {
    public static void main(String[] args) {
        String input;
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int num=1,inputNum=0;
        do {
            System.out.println("enter number "+num);
            input=scanner.nextLine();
            try{
                inputNum=Integer.parseInt(input);
                sum+=inputNum;
                num++;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid Number");
            }

        }while(inputNum>0 && num<=5);

        System.out.println(sum);

    }
}
