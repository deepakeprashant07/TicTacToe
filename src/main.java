import java.util.Scanner;

public class main {
    public static char[] board = new char[9];
    public static char[] choice = new char[]{'X','O'};
    public static char userChoice;
    public static char cpuChoice;
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\t:: WELCOME TO TIC TAC TOE GAME ::");
        UserInterface userInterface = new UserInterface();
        main main = new main();
        for (int i = 0; i < 9; i++) {
            board[i] = 'N';
        }
        main.choiceMethod();
        userInterface.printBoard();
    }

    private void choiceMethod() {
        System.out.println("ENTER 1] TO CHOOSE ' X '\nENTER 2] TO CHOOSE ' O '");
        int input = scan.nextInt();
        userChoice = choice[input-1];
        System.out.println("USER CHOICE : "+userChoice);
        if (userChoice=='X'){
            userChoice='X';
            cpuChoice='O';
        }else {
            cpuChoice='X';
        }
        System.out.println("CPU CHOICE : "+cpuChoice);
    }
}
