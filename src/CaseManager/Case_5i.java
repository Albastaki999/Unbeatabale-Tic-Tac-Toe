package CaseManager;

import static main.Main.*;

public class Case_5i {
    public void choice1() {
        if (board[2][2].getIcon().equals(computer) && board[1][1].getIcon().equals(user)) {
            computerInput(0,0);
        }
    }
}
