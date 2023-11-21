package SubCaseManager;

import static main.Main.*;
import static main.Main.computerInput;

public class SubCase_5ii_d {
    public void choice1(){
        if (board[2][0].getIcon().equals(computer) && board[1][1].getIcon().equals(user) && board[0][2].getIcon().equals(computer)){
            computerInput(1,2);
        }
    }
    public void choice2(){
        if (board[2][0].getIcon().equals(computer) && board[1][1].getIcon().equals(user) && board[0][2].getIcon().equals(computer) && board[1][2].getIcon().equals(computer)){
            if(board[2][2].getIcon().equals(user)){
                computerInput(0,0);
            }
            else {
                computerInput(2,2);
            }
        }
    }

    public void choice3() {
        if (board[2][0].getIcon().equals(computer) && board[1][1].getIcon().equals(user) && board[0][2].getIcon().equals(computer) && board[1][2].getIcon().equals(computer) && board[0][0].getIcon().equals(computer)) {
            if (board[0][1].getIcon().equals(user)) {
                computerInput(2, 1);
            } else {
                computerInput(0, 1);
            }
        }
    }
}
