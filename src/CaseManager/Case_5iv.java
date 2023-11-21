package CaseManager;

import static main.Main.*;
import static main.Main.computerInput;

public class Case_5iv {
    public void choice1() {
        if (board[0][2].getIcon().equals(computer) && board[1][1].getIcon().equals(user)) {
            computerInput(2,0);
        }
    }
}
