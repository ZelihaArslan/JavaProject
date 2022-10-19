package Methods;

public class CalculateScore {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateStore(true,1000,levelCompleted,bonus);
        calculateStore(true,10000,8,200);

        levelCompleted =2;
        bonus=200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }

    public static void calculateStore(boolean gameOver, int score,int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

}