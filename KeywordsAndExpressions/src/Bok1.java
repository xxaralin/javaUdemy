
public class Bok1 {
    public static boolean hasTeen(int num1, int num2, int num3){
        return (num1>=13 && num1<=19)|| (num2>=13 && num2<=19)||(num3>=13 && num3<=19);
    }


    public static void main(String[] args) {

       System.out.println(hasTeen(10,7,19));
    }
}