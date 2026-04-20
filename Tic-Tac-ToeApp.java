public class TicTacToe {

    static char[][] board = {
        {'_', '_', '_'},
        {'_', '_', '_'},
        {'_', '_', '_'}
    };

    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1));
        System.out.println(isValidMove(3, 3));
        System.out.println(isValidMove(-1, 0));
    }

    static boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }
        return board[row][col] == '_';
    }
}



