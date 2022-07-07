public class Verify {

    public boolean verifyWin(int positionX, int positionY, int player, Print pr){
        return verifyWinX(positionX, positionY, player, pr);
    }


    public boolean verifyWinX(int positionX, int positionY, int player, Print pr){    
        int auxX = 0;
        while(auxX < 3){
            if(auxX != positionX){
                if(pr.getBoard()[auxX][positionY] != player){
                    return verifyWinY(positionX, positionY, player, pr);
                }
            }
            auxX++;
        }
        return true;
    }        

    public boolean verifyWinY(int positionX, int positionY, int player, Print pr){
        int auxY = 0;
        while(auxY < 3){
            if(auxY != positionY){
                if(pr.getBoard()[positionX][auxY] != player){
                    return verifyWinXY(player, pr);
                }
            }
            auxY++;
        }
        return true;
    }

    public boolean verifyWinXY(int player, Print pr){
        int auxX = 0, auxY = 0;
        while(auxX < 3 && auxY < 3){
            if(pr.getBoard()[auxX][auxY] != player){
                return verifyWinYX(player, pr);
            }
            auxX++;
            auxY++;
        }
        return true;
    }

    public boolean verifyWinYX(int player, Print pr){
        int auxX = 0, auxY = 2;
        while(auxX < 3 && auxY >= 0){
            if(pr.getBoard()[auxX][auxY] != player){
                return false;
            }
            auxX++;
            auxY--;
        }
        return true;
    }
}
