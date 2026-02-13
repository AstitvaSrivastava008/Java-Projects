public class tictactoe {
    private char[][] board;
    private char currentPlayer;
    public tictactoe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    public boolean makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }
    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    public char checkWinner() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return currentPlayer;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return currentPlayer;
            }
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return currentPlayer;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return currentPlayer;
        }
        return '-';
    }
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tictactoe game = new tictactoe();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int moves = 0;
        char winner = '-';
        while (moves < 9 && winner == '-') {
            game.printBoard();
            System.out.println("Player " + game.currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (game.makeMove(row, col)) {
                moves++;
                winner = game.checkWinner();
                if (winner == '-') {
                    game.switchPlayer();
                }
            } else {
                System.out.println("This move is not valid. Try again.");
            }
        }
        game.printBoard();
        if (winner != '-') {
            System.out.println("Player " + winner + " wins!");
        } else {
            System.out.println("The game is a draw.");
        }
        scanner.close();
    }
    
    
}
