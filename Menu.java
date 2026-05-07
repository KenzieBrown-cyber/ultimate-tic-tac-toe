import java.util.Scanner;

public class Menu {

    Beginner beginner = new Beginner();

    private int beginnerWins;
    private int beginnerGames;
    private int beginnerTies;
    private int advancedWins;
    private int advancedGames;
    private int advancedTies;
    private int totalGames;
    private int totalWins;
    private int totalTies;
    
    public Menu() {
        this.beginnerWins = 0;
        this.beginnerGames = 0;
        this.beginnerTies = 0;
        this.advancedWins = 0;
        this.advancedGames = 0;
        this.advancedTies = 0;
        this.totalGames = 0;
        this.totalWins = 0;
        this.totalTies = 0;
    }

    public void MainMenu() {
            boolean mainMenuLoop = true;
            while (mainMenuLoop) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nUltimate Tic-Tac-Toe!");
        System.out.println("1. New Beginner Game");
        System.out.println("2. Beginner Game Instructions");
        System.out.println("3. New Advanced Game");
        System.out.println("4. Advanced Game Instructions");
        System.out.println("5. Scoreboard");
        System.out.println("6. Quit");
        int choice = readIntInRange(scanner, 1, 6, "\nPlease select an option (1-6): ");
        
        switch (choice) {
            case 1:
                beginner.newBeginnerGame();
                totalGames++;
                beginnerGames++;
                break; 
            case 2:
                System.out.println("\n===Beginner Game Instructions===");
                System.out.println("1. The game is played on a 3x3 external grid with 3x3 internal grids inside of each spot on the external grid.");
                System.out.println("2. Players take turns placing their marks (X or O) on a internal grid of choice within the external grid.");
                System.out.println("3. The player who wins an internal grid game (by getting 3 in a row horizontally, vertically, or diagonally) gets to place their mark on the corresponding spot of the external grid.");
                System.out.println("4. The first player to get 3 of their marks on the external grid game in a row (horizontally, vertically, or diagonally) wins.");
                System.out.println("5. The boards are set up as follows:\n");
                System.out.println("    1 | 2 | 3");
                System.out.println("    4 | 5 | 6");
                System.out.println("    7 | 8 | 9");
                System.out.println("\nIntput the corresponding number to select your internal grid, then the position on the internal grid to place your mark.");
                pressEnterToContinue(scanner);
                break;
            case 3:
                System.out.println("\nStarting a new advanced game...");
                totalGames++;
                advancedGames++;
                break;
            case 4:
                System.out.println("\n===Advanced Game Instructions===");
                System.out.println("1. The game is played on a 3x3 external grid with 3x3 internal grids inside of each spot on the external grid.");
                System.out.println("2. Players take turns placing their marks (X or O) on a internal grid of choice within the external grid.");
                System.out.println("3. Wherever player A places their mark, player B must play in the internal game in the external grid corresponding to player A's internal mark.");
                System.out.println("For Example: Player A places an X in the center of the top-right internal game. Player B must now place their O somewhere on the internal center game.");
                System.out.println("4. The player who wins an internal grid game (by getting 3 in a row horizontally, vertically, or diagonally) gets to place their mark on the corresponding spot of the external grid.");
                System.out.println("5. The first player to get 3 of their marks on the external grid game in a row (horizontally, vertically, or diagonally) wins.");
                System.out.println("5. The boards are set up as follows:\n");
                System.out.println("    1 | 2 | 3");
                System.out.println("    4 | 5 | 6");
                System.out.println("    7 | 8 | 9");
                System.out.println("\nIntput the corresponding number to select your internal grid, then the position on the internal grid to place your mark.");
                pressEnterToContinue(scanner);
                break;
            case 5:
                displayScoreboard();
                pressEnterToContinue(scanner);
                break;
            case 6:
                System.out.println("\nThanks for playing. Goodbye!");
                mainMenuLoop = false;
                break;
        
        }
    }  
        
    
}

    public void displayScoreboard() {
        System.out.println("\n===Scoreboard===");
        System.out.println("Beginner Games Played: " + beginnerGames);
        System.out.println("Beginner Wins: " + beginnerWins);
        System.out.println("Beginner Ties: " + beginnerTies);
        System.out.println("Advanced Games Played: " + advancedGames);
        System.out.println("Advanced Wins: " + advancedWins);
        System.out.println("Advanced Ties: " + advancedTies);
        System.out.println("Total Games: " + totalGames);
        System.out.println("Total Wins: " + totalWins);
        System.out.println("Ties: " + totalTies);
    }



 public static int readIntInRange(Scanner scanner, int min, int max, String prompt) {
    while (scanner.hasNextLine()) { 
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        
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

public void pressEnterToContinue(Scanner scanner) {
   
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    
}
}