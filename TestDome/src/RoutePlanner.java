public class RoutePlanner {
    static int count=0;
    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn,boolean[][] mapMatrix) {

        while(count<toColumn+toRow){
            if(fromRow!=toRow && mapMatrix[fromRow+1][fromColumn]==true){
                count++;
                System.out.println("aşağı "+count);

                routeExists(fromRow+1,fromColumn,toRow,toColumn,mapMatrix);
            }else if(fromColumn!=toColumn && mapMatrix[fromRow][fromColumn+1]==true){
                count++;
                System.out.println("sağa "+count);

                routeExists(fromRow,fromColumn+1,toRow,toColumn,mapMatrix);
            }else{
                break;
            }
        }
        System.out.println(count);
        return(count==toRow+toColumn);

    }

    public static void main(String[] args) {
        boolean[][] mapMatrix = {
                {true,  false, false},
                {true,  true,  false},
                {false, true,  false}
        };

        System.out.println(routeExists(0, 0, 2, 2, mapMatrix));
    }
}