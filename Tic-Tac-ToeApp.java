public class Main {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;
    static int moves = 0;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human's Turn");
                playerMove();
            } else {
                System.out.println("Computer's Turn");
                computerMove();
            }

            moves++;

            if (checkWin()) {
                System.out.println((isHumanTurn ? "Human" : "Computer") + " Wins!");
                gameOver = true;
            }
            else if (checkDraw()) {
                System.out.println("Game Draw!");
                gameOver = true;
            }
            else {
                isHumanTurn = !isHumanTurn; // Switch turn
            }
        }
    }

    static void playerMove() {
        System.out.println("Player makes a move...");
        // Add player move logic here
    }

    static void computerMove() {
        System.out.println("Computer makes a move...");
        // Add computer move logic here
    }

    static boolean checkWin() {
        // Replace with actual win condition
        return false;
    }

    static boolean checkDraw() {
        // Example: Draw after 9 moves
        return moves >= 9;
    }
}




