import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        List<ArrayList<Integer>> list =new ArrayList<ArrayList<Integer>>();
        Scanner scanner=new Scanner(System.in);

        int rows=scanner.nextInt();
        for(int i=0;i<rows;i++){
            int size=(scanner.nextInt());
            ArrayList<Integer>listRows=new ArrayList<>();
            for(int r=0;r<size;r++){
                listRows.add(scanner.nextInt());
            }
            list.add(listRows);
        }
        int shit=scanner.nextInt();
        for(int i=0;i<shit;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();

            try{
                int num=list.get(x-1).get(y-1);
                System.out.println(num);

            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }


    }
}