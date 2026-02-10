public class XoX {

    public int boardSize = 3;
    private int moveCount;
    private String firstPlayer;
    private String secondPlayer;
    private boolean firstPlayerTurn = true;
    private boolean isFinished = false;
    /*
    You are going to use int variables on board to exploit the advantage of integer numbers
    to check win condition
    Initially all of the board filled with 0.
    X character represented with 1
    0 character represented with 2
     */
    private int board[][];

    public XoX(String firstPlayer, String secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.moveCount = 0;
        board = new int[boardSize][boardSize];
        cleanBoard();
    }

    /*
     Marks the given position on board. Uses the boolean variable to decide which player is going to mark.
     Add necessary statements to prevent illegal moves.
     */
    public void mark(int row, int column) {
        boolean validMove;
        if((row >= 0 && row < boardSize) && (column >= 0 && column < boardSize) && board[row][column] == 0) {
            validMove = true;
        }
        else {
            validMove = false;
        }
        if (!isFinished) {
            if (validMove) {
                if(firstPlayerTurn){
                    board[row][column] = 1;
                }
                else{
                    board[row][column] = 2;
                }
                int state = gameState();
                updateGameState(state);
            } else {
                System.out.println("You can not mark this area");
            }
        } else {
            System.out.println("Game Over ! You can not mark");
        }
    }

    /* Since the players use "X" and "O" characters
   you have convert each integer number to corresponding character before print out
    */
    private char maskValues(int value) {
        if(value == 1) {
            return 'X';
        }
        else if(value == 2) {
            return 'O';
        }
        else{
            return '_';
        }
    }

    public void printBoard() {
        System.out.println("---------");
        for(int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                System.out.print(maskValues(board[i][j])+ " ");
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    // Fill the board with 0
    private void cleanBoard() {
        for(int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                board[i][j] = 0;
            }
        }
    }

    /*
     Technically there are eight possible states you have to check (three rows, three columns, two diagonal).
     This function must return if:
       - player1 win 1
       - player2 win 8
       - Game continue 0
     */
    private int gameState() {

        //satır için
        for (int i = 0; i < boardSize; i++) {
            if(board[i][0]*board[i][1]*board[i][2]==1){
                return 1;
            }if (board[i][0]*board[i][1]*board[i][2]==8){
                return 8;
            }
            //sütun için
            if(board[0][i]*board[1][i]*board[2][i]==1){
                return 1;
            }if (board[0][i]*board[1][i]*board[2][i]==8){
                return 8;
            }
        }
            //çapraz için
        if(board[0][0]*board[1][1]*board[2][2]==1){
            return 1;
        }if(board[0][0]*board[1][1]*board[2][2]==8){
            return 8;
        }
        if(board[0][2]*board[1][1]*board[2][0]==1) {
            return 1;
        }if(board[0][2]*board[1][1]*board[2][0]==8){
            return 8;
        }
        return 0;
    }

    //Check if the game is finished and give turn to the next player.
    private void updateGameState(int gameState) {

        if(gameState == 1) {
            isFinished = true;
            System.out.println("Player " +firstPlayer+ " wins!");
        }else if(gameState == 8) {
            isFinished = true;
            System.out.println("Player " +secondPlayer + " wins!");
        }
        else if(gameState == 0) {
            System.out.println("Game continues..");
            firstPlayerTurn = !firstPlayerTurn;
            moveCount++;
            if(moveCount >= boardSize*boardSize) {
                isFinished = true;
            }
        }
        else {
            System.out.println("Corrupt game state: " + gameState);
        }
    }

}
