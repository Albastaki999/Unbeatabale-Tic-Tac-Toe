package CaseManager;

import static main.Main.*;
import static main.Main.computer;

public class Case_2iii {
    public void choice1() {
        if (board[2][0].getIcon().equals(computer) && board[0][1].getIcon().equals(user)) {
            computerInput(2, 2);
        }
    }

    public void choice2() {
        if (board[2][0].getIcon().equals(computer) && board[0][1].getIcon().equals(user) && board[2][2].getIcon().equals(computer)) {
            if (board[2][1].getIcon().equals(user)) {
                computerInput(1, 1);
            } else {
                computerInput(2, 1);
            }
        }
    }

    public void choice3() {
        if (board[2][0].getIcon().equals(computer) && board[0][1].getIcon().equals(user) && board[2][2].getIcon().equals(computer) && board[1][1].getIcon().equals(computer)) {
            if (board[0][0].getIcon().equals(user)) {
                computerInput(0, 2);
            } else {
                computerInput(0, 0);
            }
        }
    }
}
