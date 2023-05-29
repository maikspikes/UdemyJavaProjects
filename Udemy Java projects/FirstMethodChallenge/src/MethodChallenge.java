public class MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition;

        highScorePosition = calculateHightScorePosition(1500);
        dislplayHighScorePosition("Maik", highScorePosition);

        highScorePosition = calculateHightScorePosition(1000);
        dislplayHighScorePosition("Maiuk", highScorePosition);

        highScorePosition = calculateHightScorePosition(500);
        dislplayHighScorePosition("Taca", highScorePosition);

        highScorePosition = calculateHightScorePosition(100);
        dislplayHighScorePosition("Thaiza", highScorePosition);

    }

    public static void dislplayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list");
    }

    public static int calculateHightScorePosition(int playerScore) {

    int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}