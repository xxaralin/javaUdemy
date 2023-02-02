import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie movie1=new Movie("Mamma Mia");
        movie1.watchMovie();

        Movie movie2=new Adventure("Bullet Train");
        movie2.watchMovie();

        Movie movie3=Movie.getMovie("S", "Killers");
        movie3.watchMovie();

        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("Enter type(A for action, C for comedy, S for Sci-fi or Q to Quit): ");
            String type=scanner.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter movie Title: ");
            String title = scanner.nextLine();
            Movie movie=Movie.getMovie(type,title);
            movie.watchMovie();

        }


    }
}