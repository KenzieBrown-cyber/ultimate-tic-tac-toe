import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        MainMenu();
    }

    public static void MainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nUltimate Tic-Tac-Toe!");
        System.out.println("1. New Beginner Game");
        System.out.println("2. Beginner Game Instructions");
        System.out.println("3. New Advanced Game");
        System.out.println("4. Advanced Game Instructions");
        System.out.println("5. Scoreboard");
        System.out.println("6. Quit");
        System.out.print("\nPlease select an option: ");
        
        int choice = scanner.nextInt();
        
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
                System.out.println("For Example: Player A places an X in the center of the top-right internal game. Player B must now place their O somewhere on the internal center game.")
                System.out.println("4. The player who wins an internal grid game (by getting 3 in a row horizontally, vertically, or diagonally) gets to place their mark on the corresponding spot of the external grid.");
                System.out.println("5. The first player to get 3 of their marks on the external grid game in a row (horizontally, vertically, or diagonally) wins.");
                break;
            case 5:
                // Display scoreboard
                System.out.println("\nScoreboard:");
                
                break;
            case 6:
                // Quit the program
                System.out.println("\nThanks for playing. Goodbye!");
                break;
                
            default:
                System.out.println("\nInvalid option. Please try again.");
                break;
        }
        
        scanner.close();
    
}
}