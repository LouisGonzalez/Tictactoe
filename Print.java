public class Print {

    private int[][] board = new int[3][3];

    public void begin(){
        initialValues();
        printBoard();
    }

    private void initialValues(){
        board[0][0] = 0;
        board[0][1] = 0;
        board[0][2] = 0;
        board[1][0] = 0;
        board[1][1] = 0;
        board[1][2] = 0;
        board[2][0] = 0;
        board[2][1] = 0;
        board[2][2] = 0;
    }



    public void printBoard(){
        String boardPrinted = "";
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == 0){
                    boardPrinted += "|   |";
                } else if(board[i][j] == 1){
                    boardPrinted += "| X |";
                } else if(board[i][j] == 2){
                    boardPrinted += "| O |";
                }
            }
            boardPrinted += "\n";
        }
        System.out.println(boardPrinted);
    }

    public int[][] getBoard(){
        return board;
    }

}
