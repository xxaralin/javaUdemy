import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        int currentYear = 2022;
        getInput(2022);

    }
    public static String getInput(int currentYear) {
            Scanner scanner=new Scanner(System.in);

            System.out.println("Hi what is your name ");
            String name=scanner.nextLine();
            System.out.println("Hi "+name+" ,nice to meet you");

            System.out.println("When were you born? ");
            String birthYear=scanner.nextLine();
            int age=currentYear-Integer.parseInt(birthYear);
            System.out.println("so you are "+age+" years old");
            return "";




    }
}
