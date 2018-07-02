public class Match {

    static int COUNT_PLAY = 0;
    static int COUNT_WIN = 0;
    static int COUNT_LOSE = 0;
    static int COUNT_DRAW = 0;

    public int play(String userChoice) {
        COUNT_PLAY++;
        double random = Math.random();

        String computerChoice;
        if (random < 0.33) {
            computerChoice = "paper";
        } else if (random < 0.66) {
            computerChoice = "sciss";
        } else {
            computerChoice = "rock";
        }
        System.out.println("userChoice:" + userChoice);
        System.out.println("computerChoice:" + computerChoice);

        if (computerChoice == userChoice){
            COUNT_DRAW++;
            return 0;
        } else if (
                (userChoice == "paper" && computerChoice == "rock") ||
                 (userChoice == "sciss" && computerChoice == "paper") ||
                        (userChoice == "rock" && computerChoice == "sciss")
                ) {
            COUNT_WIN++;
            return 1;
        } else {
            COUNT_LOSE++;
            return -1;
        }
    }
}
