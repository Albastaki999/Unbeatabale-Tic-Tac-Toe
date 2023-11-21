package CaseManager;

import static main.Main.*;

public class Case_2i {
    public void choice1(){
        if (board[2][2].getIcon().equals(computer) && board[0][1].getIcon().equals(user)) {
            board[2][0].setIcon(computer);
        }
    }

    public void choice2(){
        if (board[2][2].getIcon().equals(computer) && board[0][1].getIcon().equals(user) && board[2][0].getIcon().equals(computer)) {
            if (board[2][1].getIcon().equals(user)) {
                board[1][1].setIcon(computer);
            } else {
                board[2][1].setIcon(computer);
            }
        }
    }

    public void choice3(){
        if (board[2][2].getIcon().equals(computer) && board[0][1].getIcon().equals(user) && board[2][0].getIcon().equals(computer) && board[1][1].getIcon().equals(computer)) {
            if (board[0][0].getIcon().equals(user)) {
                board[0][2].setIcon(computer);
            } else {
                board[0][0].setIcon(computer);
            }
        }
    }

}
