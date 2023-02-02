public class Deneme {
    public static void main(String[] args) {
    int position=calculateHighScorePosition(800);
    displayHighScorePosition("nilo",position);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " manages to get into position " + position + " on the highscore list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore < 1000 && playerScore >= 500) {
            return 2;
        } else if (playerScore < 500 && playerScore >= 100) {
            return 3;
        } else
            return 4;
    }
}
