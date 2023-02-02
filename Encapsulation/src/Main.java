public class Main {
    public static void main(String[] args) {
//        Player player1=new Player();
//        player1.name="tim";
//        player1.health=30;
//        player1.weapon="Sword";
//        int damage=15;
//        player1.loseHealth(damage);
//        System.out.println("remaining health= "+ player1.healthRemaining());
//
//        player1.loseHealth(16);
//        System.out.println("remaining health= "+ player1.healthRemaining());

        EnhancedPlayer player2=new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("initial health= "+ player2.healthRemaining());

    }
}