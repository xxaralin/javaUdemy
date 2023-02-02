import java.util.Scanner;

public class Calculator {
    public static void inputThenPrintSumAndAverage() {
        String input;
        int counter = 0,sum = 0, inputInt;
        long  avg = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                input = scanner.nextLine();
                inputInt = Integer.parseInt(input);
                sum += inputInt;
                counter++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        avg =Math.round((double)sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + avg);

    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
        //[-1,5,7,bg,9]
    }
}