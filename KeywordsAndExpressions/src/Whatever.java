public class Whatever {
    public static void main( String[] args){
    int highScore1=calculateScore(true,800,5,100);
    int highScore2=calculateScore(true,10000,8,200);
        System.out.println("your first score is "+highScore1);
        System.out.println("your second score is "+highScore2);

    }
    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
       int finalScore=score;
        if(gameOver){
            finalScore+=(levelCompleted*bonus);

        }
        return finalScore;
    }
}
