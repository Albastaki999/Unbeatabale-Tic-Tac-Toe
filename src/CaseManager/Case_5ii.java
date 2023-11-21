package CaseManager;

import static main.Main.*;
import static main.Main.computerInput;

public class Case_5ii {
    public void choice1() {
        if (board[2][0].getIcon().equals(computer) && board[1][1].getIcon().equals(user)) {
            computerInput(0,2);
        }
    }
}
