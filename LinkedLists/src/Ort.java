import java.util.Scanner;

public class Ort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Mat notunuz: ");
        int mat= Integer.parseInt(scanner.nextLine());

        System.out.println("fizik notunuz: ");
        int fizik= Integer.parseInt(scanner.nextLine());

        System.out.println("kimya notunuz: ");
        int kimya= Integer.parseInt(scanner.nextLine());

        System.out.println("turkce notunuz: ");
        int turkce= Integer.parseInt(scanner.nextLine());

        System.out.println("tarih notunuz: ");
        int tarih= Integer.parseInt(scanner.nextLine());

        System.out.println("muzik notunuz: ");
        int muzik= Integer.parseInt(scanner.nextLine());

        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double ort=toplam/6;

        if(ort<60){
            System.out.println("Sınıfta kaldınn");
        }else{
            System.out.println("Sınıfı geçtinn");
        }
    }
}
