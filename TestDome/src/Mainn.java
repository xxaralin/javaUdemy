import java.util.Scanner;

public class Mainn {

        public class MathUtils {
            public static double average(int a, int b) {
                return (double)(a + b) / 2;
            }

            public static void main(String[] args) {
                System.out.println(average(2,1));
            }
        }


    public class Solution {

        public static void main(String[] args) {


        }
        public void paralellelogram(){
            Scanner scanner = new Scanner(System.in);
            int breadth=Integer.parseInt(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());

            if(breadth<=0 || height<=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");

            }else{
                System.out.println(breadth*height);
            }
        }

    }

}