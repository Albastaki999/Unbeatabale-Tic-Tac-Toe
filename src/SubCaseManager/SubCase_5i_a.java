package SubCaseManager;

import static main.Main.*;

public class SubCase_5i_a {
    public void choice1(){
        if (board[2][2].getIcon().equals(computer) && board[1][1].getIcon().equals(user) && board[0][0].getIcon().equals(computer)){
            computerInput(2,1);
        }
    }
    public void choice2(){
        if (board[2][2].getIcon().equals(computer) && board[1][1].getIcon().equals(user) && board[0][0].getIcon().equals(computer) && board[2][1].getIcon().equals(computer)){
            if(board[2][0].getIcon().equals(user)){
                computerInput(0,2);
            }
            else {
                computerInput(2,0);
            }
        }
    }

    public void choice3(){
        if (board[2][2].getIcon().equals(computer) && board[1][1].getIcon().equals(user) && board[0][0].getIcon().equals(computer) && board[2][1].getIcon().equals(computer) && board[0][2].getIcon().equals(computer)){
            if(board[1][2].getIcon().equals(user)){
                computerInput(1,0);
            }
            else {
                computerInput(1,2);
            }
        }
    }
}
