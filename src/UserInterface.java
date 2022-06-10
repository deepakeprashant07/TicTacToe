import java.util.Scanner;

public class UserInterface {
    Scanner scan = new Scanner(System.in);

    public void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + main.board[0] + " | " + main.board[1] + " | " + main.board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + main.board[3] + " | " + main.board[4] + " | " + main.board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + main.board[6] + " | " + main.board[7] + " | " + main.board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public void showBoard() {
        System.out.println("Enter a slot number to place");
        int slot = scan.nextInt();
        main.board[slot-1] = main.userChoice;
        printBoard();
    }
}
