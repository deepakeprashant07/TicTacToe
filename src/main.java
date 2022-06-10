public class main {
    public static char[] board = new char[9];
    public static void main(String[] args) {
        System.out.println("\t:: WELCOME TO TIC TAC TOE GAME ::");
        for (int i = 0; i < 9; i++) {
            board[i] = 'N';
        }
        main main = new main();
        main.printBoard();
    }
    public void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }
}
