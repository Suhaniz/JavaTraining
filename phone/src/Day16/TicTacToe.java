package Day16;

	import java.util.Scanner;

	public class TicTacToe {
	    static char[][] board = new char[3][3];

	    // Initialize board with empty spaces
	    public static void initializeBoard() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                board[i][j] = ' ';
	            }
	        }
	    }

	    // Display board
	    public static void printBoard() {
	        System.out.println("-------------");
	        for (int i = 0; i < 3; i++) {
	            System.out.print("| ");
	            for (int j = 0; j < 3; j++) {
	                System.out.print(board[i][j] + " | ");
	            }
	            System.out.println();
	            System.out.println("-------------");
	        }
	    }

	    // Check for win
	    public static boolean checkWin(char player) {
	        // Rows, Columns, Diagonals
	        for (int i = 0; i < 3; i++) {
	            // Check row and column
	            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
	                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
	                return true;
	            }
	        }
	        // Diagonals
	        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
	            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
	            return true;
	        }

	        return false;
	    }

	    // Check for draw
	    public static boolean isBoardFull() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (board[i][j] == ' ')
	                    return false;
	            }
	        }
	        return true;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        initializeBoard();
	        char currentPlayer = 'X';
	        boolean gameOver = false;

	        System.out.println("Welcome to Tic Tac Toe!");
	        printBoard();

	        while (!gameOver) {
	            int row, col;
	            System.out.println("Player " + currentPlayer + ", enter row and column (0-2):");
	            row = sc.nextInt();
	            col = sc.nextInt();

	            // Check if cell is empty
	            if (row < 0 || row > 2 || col < 0 || col > 2) {
	                System.out.println("Invalid input. Please enter values between 0 and 2.");
	                continue;
	            }

	            if (board[row][col] == ' ') {
	                board[row][col] = currentPlayer;
	                printBoard();

	                if (checkWin(currentPlayer)) {
	                    System.out.println("Player " + currentPlayer + " wins!");
	                    gameOver = true;
	                } else if (isBoardFull()) {
	                    System.out.println("It's a draw!");
	                    gameOver = true;
	                } else {
	                    // Switch players
	                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	                }

	            } else {
	                System.out.println("Cell already taken. Try again.");
	            }
	        }
	    }
	}

