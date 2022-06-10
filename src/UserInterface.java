public class UserInterface {

    public void printBoard()
    {
        main main = new main();
        System.out.println("|---|---|---|");
        System.out.println("| " + main.board[0] + " | " + main.board[1] + " | " + main.board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + main.board[3] + " | " + main.board[4] + " | " + main.board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + main.board[6] + " | " + main.board[7] + " | " + main.board[8] + " |");
        System.out.println("|---|---|---|");
    }
}
