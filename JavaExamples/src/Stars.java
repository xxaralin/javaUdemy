public class Stars {
    public static void printSquareStar(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==0 || j==0|| i==num-1 || j==num-1 || i==j|| j==(num-1-i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        printSquareStar(5);
    }
}
