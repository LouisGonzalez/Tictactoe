import java.util.Scanner;

public class Logic {
    
    private final Print pr = new Print();
    private final Verify vr = new Verify();
    private int contMovements = 0;
    private boolean gameOver = false;

    public void game(){
        pr.begin();

        do {
            round();
        } while(gameOver != true);
        System.out.println("GAME OVER");
    }

    public void round(){
        turn(1);
        pr.printBoard();
        if(!gameOver){
            turn(2);
            pr.printBoard();    
        }
    }



    public void turn(int player){
        int positionX = askPosition(player);
        int positionY = askPosition(player);
        if(pr.getBoard()[positionX][positionY] == 0){
            pr.getBoard()[positionX][positionY] = player;
            boolean result = vr.verifyWin(positionX, positionY, player, pr);
            contMovements++;
            if(result) {
                gameOver = result;
                System.out.println("HA GANADO EL JUGADOR No. "+player);
            } else gameOver = verifyEmptySpaces();
        } else {
            System.out.println("Invalid move");
            if(contMovements < 8) turn(player);
        }
    }


    public boolean verifyEmptySpaces(){
        if(contMovements >= 9) return true;
        return false;
    }

    
    public int askPosition(int player){
        if(player == 1){
            Scanner sc = new Scanner(System.in);
            System.out.println("Type a number:");
            int number = Integer.parseInt(sc.nextLine());
            if(number < 1 || number > 3){
                System.out.println("Invalid range position");
                return askPosition(player);
            } else {
                return number - 1;
            }
        } else {
            return (int) (Math.floor(Math.random()*3+1))-1;
        }
    }



}
