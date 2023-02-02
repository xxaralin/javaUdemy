import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int inputSize=sc.nextInt();
        for(int i=0;i<inputSize;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        int choiceSize=sc.nextInt();
        for(int k=0;k<choiceSize;k++){
            String choice=sc.nextLine();

            switch(choice){
                case "Insert":
                    int index = sc.nextInt();
                    int num=sc.nextInt();
                    System.out.println(index+" "+num);
                    list.add(index,num);
                    break;
                case "Delete":
                    int indexDel=sc.nextInt();
                    System.out.println("dcfghjofvghjk");
                    list.remove(indexDel);
                    break;
            }
        }
        System.out.println(list);
    }
}