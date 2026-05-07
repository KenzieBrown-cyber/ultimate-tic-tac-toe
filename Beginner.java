import java.util.Scanner;

public class Beginner {
    
    
    public void newBeginnerGame() {
        Scanner scanner = new Scanner(System.in);
        boolean newBeginnerGameLoop = true;
        char[][][] board = new char[9][3][3];
        // Initialize the board with dashes
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    board[i][j][k] = '-';
                }
            }
        }

        while(newBeginnerGameLoop) {
        char mark = 'X';
        System.out.println("\nStarting a new Beginner game...");

        System.out.println("\nUltimate Tic-Tac-Toe Board:");
        printBoard(board);
        System.out.println("\nPlayer X, you will go first: ");
        int choice1 = readIntInRange(scanner, 1, 9, "\nPick a internal grid (1-9) to select your internal game: ");
        int choice2 = readIntInRange(scanner, 1, 9, "\nSelect a position (1-9) on the internal grid to place your mark" + mark + ": ");

        switch(choice1) {
            case 1:
                switch(choice2) {
                    case 1:
                        board[0][0][0] = mark;
                        break;
                    case 2:
                        board[0][0][1] = mark;
                        break;
                    case 3:
                        board[0][0][2] = mark;
                        break;
                    case 4:
                        board[0][1][0] = 'X';
                        break;
                    case 5:
                        board[0][1][1] = 'X';
                        break;
                    case 6:
                        board[0][1][2] = 'X';
                        break;
                    case 7:
                        board[0][2][0] = 'X';
                        break;
                    case 8:
                        board[0][2][1] = 'X';
                        break;
                    case 9:
                        board[0][2][2] = 'X';
                        break;
                }
                break;
            case 2:
                switch(choice2) {
                    case 1:
                        board[1][0][0] = 'X';
                        break;
                    case 2:
                        board[1][0][1] = 'X';
                        break;
                    case 3:
                        board[1][0][2] = 'X';
                        break;
                    case 4:
                        board[1][1][0] = 'X';
                        break;
                    case 5:
                        board[1][1][1] = 'X';
                        break;
                    case 6:
                        board[1][1][2] = 'X';
                        break;
                    case 7:
                        board[1][2][0] = 'X';
                        break;
                    case 8:
                        board[1][2][1] = 'X';
                        break;
                    case 9:
                        board[1][2][2] = 'X';
                        break;
                }
                break;
            case 3:
                switch(choice2) {
                    case 1:
                        board[2][0][0] = 'X';
                        break;
                    case 2:
                        board[2][0][1] = 'X';
                        break;
                    case 3:
                        board[2][0][2] = 'X';
                        break;
                    case 4:
                        board[2][1][0] = 'X';
                        break;
                    case 5:
                        board[2][1][1] = 'X';
                        break;
                    case 6:
                        board[2][1][2] = 'X';
                        break;
                    case 7:
                        board[2][2][0] = 'X';
                        break;
                    case 8:
                        board[2][2][1] = 'X';
                        break;
                    case 9:
                        board[2][2][2] = 'X';
                        break;
                }
                break;
            case 4:
                switch(choice2) {
                    case 1:
                        board[3][0][0] = 'X';
                        break;
                    case 2:
                        board[3][0][1] = 'X';
                        break;
                    case 3:
                        board[3][0][2] = 'X';
                        break;
                    case 4:
                        board[3][1][0] = 'X';
                        break;
                    case 5:
                        board[3][1][1] = 'X';
                        break;
                    case 6:
                        board[3][1][2] = 'X';
                        break;
                    case 7:
                        board[3][2][0] = 'X';
                        break;
                    case 8:
                        board[3][2][1] = 'X';
                        break;
                    case 9:
                        board[3][2][2] = 'X';
                        break;
                }
                break;
            case 5:
                switch(choice2) {
                    case 1:
                        board[4][0][0] = 'X';
                        break;
                    case 2:
                        board[4][0][1] = 'X';
                        break;
                    case 3:
                        board[4][0][2] = 'X';
                        break;
                    case 4:
                        board[4][1][0] = 'X';
                        break;
                    case 5:
                        board[4][1][1] = 'X';
                        break;
                    case 6:
                        board[4][1][2] = 'X';
                        break;
                    case 7:
                        board[4][2][0] = 'X';
                        break;
                    case 8:
                        board[4][2][1] = 'X';
                        break;
                    case 9:
                        board[4][2][2] = 'X';
                        break;
                }
                break;
            case 6:
                 switch(choice2) {
                    case 1:
                        board[5][0][0] = 'X';
                        break;
                    case 2:
                        board[5][0][1] = 'X';
                        break;
                    case 3:
                        board[5][0][2] = 'X';
                        break;
                    case 4:
                        board[5][1][0] = 'X';
                        break;
                    case 5:
                        board[5][1][1] = 'X';
                        break;
                    case 6:
                        board[5][1][2] = 'X';
                        break;
                    case 7:
                        board[5][2][0] = 'X';
                        break;
                    case 8:
                        board[5][2][1] = 'X';
                        break;
                    case 9:
                        board[5][2][2] = 'X';
                        break;
                 }
                break;
            case 7:
                switch(choice2) {
                    case 1:
                        board[6][0][0] = 'X';
                        break;
                    case 2:
                        board[6][0][1] = 'X';
                        break;
                    case 3:
                        board[6][0][2] = 'X';
                        break;
                    case 4:
                        board[6][1][0] = 'X';
                        break;
                    case 5:
                        board[6][1][1] = 'X';
                        break;
                    case 6:
                        board[6][1][2] = 'X';
                        break;
                    case 7:
                        board[6][2][0] = 'X';
                        break;
                    case 8:
                        board[6][2][1] = 'X';
                        break;
                    case 9:
                        board[6][2][2] = 'X';
                        break;
                }
                break;
            case 8:
                switch(choice2) {
                    case 1:
                        board[7][0][0] = 'X';
                        break;
                    case 2:
                        board[7][0][1] = 'X';
                        break;
                    case 3:
                        board[7][0][2] = 'X';
                        break;
                    case 4:
                        board[7][1][0] = 'X';
                        break;
                    case 5:
                        board[7][1][1] = 'X';
                        break;
                    case 6:
                        board[7][1][2] = 'X';
                        break;
                    case 7:
                        board[7][2][0] = 'X';
                        break;
                    case 8:
                        board[7][2][1] = 'X';
                        break;
                    case 9:
                        board[7][2][2] = 'X';
                        break;
                }
                break;
            case 9:
                switch(choice2) {
                    case 1:
                        board[8][0][0] = 'X';
                        break;
                    case 2:
                        board[8][0][1] = 'X';
                        break;
                    case 3:
                        board[8][0][2] = 'X';
                        break;
                    case 4:
                        board[8][1][0] = 'X';
                        break;
                    case 5:
                        board[8][1][1] = 'X';
                        break;
                    case 6:
                        board[8][1][2] = 'X';
                        break;
                    case 7:
                        board[8][2][0] = 'X';
                        break;
                    case 8:
                        board[8][2][1] = 'X';
                        break;
                    case 9:
                        board[8][2][2] = 'X';
                        break;
                }
                break;
        }
    }
}
    private void printBoard(char[][][] board) {
        for (int bigRow = 0; bigRow < 3; bigRow++) {
            for (int smallRow = 0; smallRow < 3; smallRow++) {
                for (int bigCol = 0; bigCol < 3; bigCol++) {
                    if (bigCol > 0) System.out.print(" | ");
                    int subgrid = bigRow * 3 + bigCol;
                    for (int col = 0; col < 3; col++) {
                        System.out.print(board[subgrid][smallRow][col] + " ");
                    }
                }
                System.out.println();
            }
            if (bigRow < 2) {
                System.out.println("------------------------");
            }
        }
    }

    public String getPrompt() {
        
    }
    public static int readIntInRange(Scanner scanner, int min, int max, String prompt) {
    while (scanner.hasNextLine()) { 
        String input = scanner.nextLine().trim();
        System.out.print(prompt);
        
        
        if (input.isEmpty()) continue;

        try {
            int value = Integer.parseInt(input);
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Numbers Only.");
        }
    }
    return -1; 
}
}
