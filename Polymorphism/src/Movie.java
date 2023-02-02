public class Movie {
    private String title;
    public Movie(String title){
        this.title=title;
    }
    public void watchMovie(){
        String instanceType=this.getClass().getSimpleName();
        System.out.println(title+" is a "+instanceType+" film");
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A'-> new Adventure(title);
            case 'C'-> new Comedy(title);
            case 'S'-> new Sci_fi(title);
            default -> new Movie(title);
        };
    }
}
class Adventure extends Movie{
    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant scene",
                "Scary Music",
                "Something bad happens");
    }
    public void watchAdventure(){
        System.out.println("Watching adventure");
    }
}
class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Funny scene",
                "Funny Music",
                "Something fun happens");
    }
    public void watchComedy(){
        System.out.println("Watching Comedy");
    }
}
class Sci_fi extends Movie{
    public Sci_fi(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Aliens comes",
                "Eerie Music",
                "Doctor comes with Tardis");
    }
    public void watchScifi(){
        System.out.println("Watching Fictionn");
    }
}
