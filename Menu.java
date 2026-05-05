import java.util.Scanner;

public class Menu {

    private int beginnerWins;
    private int advancedWins;
    private int ties;
    private int totalGames;
    
    public Menu() {
        this.beginnerWins = 0;
        this.advancedWins = 0;
        this.ties = 0;
        this.totalGames = 0;
    }

    public void MainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nUltimate Tic-Tac-Toe!");
        System.out.println("1. New Beginner Game");
        System.out.println("2. Beginner Game Instructions");
        System.out.println("3. New Advanced Game");
        System.out.println("4. Advanced Game Instructions");
        System.out.println("5. Scoreboard");
        System.out.println("6. Quit");
        int choice = readIntInRange(scanner, 1, 6, "\nPlease select an option 1-6: ");
        
        switch (choice) {
            case 1:
                // Start a new game
                System.out.println("\nStarting a new beginner game...");
                
                break;
            case 2:
                // Display beginner game instructions
                System.out.println("\nBeginner Game Instructions:");
                System.out.println("1. The game is played on a 3x3 external grid with 3x3 internal grids inside of each spot on the external grid.");
                System.out.println("2. Players take turns placing their marks (X or O) on a internal grid of choice within the external grid.");
                System.out.println("3. The player who wins an internal grid game (by getting 3 in a row horizontally, vertically, or diagonally) gets to place their mark on the corresponding spot of the external grid.");
                System.out.println("4. The first player to get 3 of their marks on the external grid game in a row (horizontally, vertically, or diagonally) wins.");
                break;
            case 3:
                // Start a new advanced game
                System.out.println("\nStarting a new advanced game...");
                break;
            case 4:
                // Display advanced game instructions
                System.out.println("\nAdvanced Game Instructions:");
                System.out.println("1. The game is played on a 3x3 external grid with 3x3 internal grids inside of each spot on the external grid.");
                System.out.println("2. Players take turns placing their marks (X or O) on a internal grid of choice within the external grid.");
                System.out.println("3. Wherever player A places their mark, player B must play in the internal game in the external grid corresponding to player A's internal mark.");
                System.out.println("For Example: Player A places an X in the center of the top-right internal game. Player B must now place their O somewhere on the internal center game.");
                System.out.println("4. The player who wins an internal grid game (by getting 3 in a row horizontally, vertically, or diagonally) gets to place their mark on the corresponding spot of the external grid.");
                System.out.println("5. The first player to get 3 of their marks on the external grid game in a row (horizontally, vertically, or diagonally) wins.");
                break;
            case 5:
                // Display scoreboard
                displayScoreboard();
                break;
            case 6:
                // Quit the program
                System.out.println("\nThanks for playing. Goodbye!");
                break;
        
        }
        
        scanner.close();
    }

    public void displayScoreboard() {
        System.out.println("Scoreboard:");
        System.out.println("Beginner Wins: " + beginnerWins);
        System.out.println("Advanced Wins: " + advancedWins);
        System.out.println("Ties: " + ties);
        System.out.println("Total Games: " + totalGames);
    }

    public static int readIntInRange(Scanner scanner, int min, int max, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Invalid input. Please enter a number in between " + min + " and " + max + ".");
                continue;
            }

            int value = scanner.nextInt();
            scanner.nextLine();

            if (value < min || value > max) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
                continue;
            }

            return value;
        }
    }
    }