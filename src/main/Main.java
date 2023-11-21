package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Main implements MouseListener, ActionListener{
    public static JLabel[][] board;
    public static int player = 1;
    public static ImageIcon computer ;
    public static ImageIcon user;
    public static ImageIcon background ;
    JMenuBar menubar;
    JMenu game;
    JMenuItem restart;
    int caseNO=0;
    Case c = new Case();


    Main(){
        computer = new ImageIcon(getClass().getResource("/images/X.png"));
        user = new ImageIcon(getClass().getResource("/Images/O.png"));
        background = new ImageIcon(getClass().getResource("/Images/Background.png"));
        JFrame f = new JFrame("TicTacToe");
        f.setLayout(new GridLayout(3, 3));
        menubar = new JMenuBar();
        game = new JMenu("Game");
        restart = new JMenuItem("Restart");

        menubar.add(game);
        game.add(restart);
        restart.addActionListener(this);
        f.setJMenuBar(menubar);

        board = new JLabel[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = new JLabel();
                board[row][col].setHorizontalAlignment(JLabel.CENTER);
                board[row][col].setBorder(BorderFactory.createLineBorder(Color.gray));
                board[row][col].setIcon(background);
                board[row][col].addMouseListener(this);
                f.add(board[row][col]);
            }
        }

        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeGame();

    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if(player%2==0){
            JLabel clickedCell = (JLabel) e.getSource();
            if (clickedCell.getIcon().equals(background)) {
                clickedCell.setIcon(user);
                clickedCell.setOpaque(true);
                player++;
            }

            if(player!=1 && player%2!=0){
                if(player==3){
                    caseNO = c.caseChecker();
                }
                c.choiceMaker(caseNO);
                int result = checkWin();
                if (result == 1) {
                    JOptionPane.showMessageDialog(null,"Computer wins");

                } else if (result == 0) {
                    JOptionPane.showMessageDialog(null,"It's a Draw");

                }
                if(result==1 || result==0){

                    player=1;
                    initializeGame();
                }else{
                    player++;
                }

            }

        }
    }

    public void actionPerformed(ActionEvent e){
            if(e.getSource()==restart){
                player = 1;
                initializeGame();
            }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void initializeGame(){
        if(player==1){
            for (int i = 0 ; i<3 ;i++){
                for(int j=0 ; j<3; j++){
                    board[i][j].setIcon(background);
                }
            }
            int cornerX[] = { 0, 2 };
            int cornerY[] = { 0, 2 };
            Random rand = new Random();
            int randomNumberX = rand.nextInt(0, 2);
            int randomNumberY = rand.nextInt(0, 2);
            computerInput(cornerX[randomNumberX],cornerY[randomNumberY]);
            player++;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());

    }

    public static int checkWin(){
        if(!board[0][0].getIcon().equals(background) && board[0][0].getIcon().equals(board[0][1].getIcon()) && board[0][1].getIcon().equals(board[0][2].getIcon())){
            return 1;
        }
        if(!board[1][0].getIcon().equals(background) && board[1][0].getIcon().equals(board[1][1].getIcon()) && board[1][1].getIcon().equals(board[1][2].getIcon())){
            return 1;
        }
        if(!board[2][0].getIcon().equals(background) && board[2][0].getIcon().equals(board[2][1].getIcon()) && board[2][1].getIcon().equals(board[2][2].getIcon())){
            return 1;
        }
        if(!board[0][0].getIcon().equals(background) && board[0][0].getIcon().equals(board[1][0].getIcon()) && board[1][0].getIcon().equals(board[2][0].getIcon())){
            return 1;
        }
        if(!board[0][1].getIcon().equals(background) && board[0][1].getIcon().equals(board[1][1].getIcon()) && board[1][1].getIcon().equals(board[2][1].getIcon())){
            return 1;
        }
        if(!board[0][2].getIcon().equals(background) && board[0][2].getIcon().equals(board[1][2].getIcon()) && board[1][2].getIcon().equals(board[2][2].getIcon())){
            return 1;
        }
        if(!board[0][0].getIcon().equals(background) && board[0][0].getIcon().equals(board[1][1].getIcon()) && board[1][1].getIcon().equals(board[2][2].getIcon())){
            return 1;
        }
        if(!board[0][2].getIcon().equals(background) && board[0][2].getIcon().equals(board[1][1].getIcon()) && board[1][1].getIcon().equals(board[2][0].getIcon())){
            return 1;
        }
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!board[i][j].getIcon().equals(background)) {
                    count++;
                }
            }
        }
        if (count == 9) {
            return 0;
        }
        return -1;
    }
    public static void computerInput(int row, int col){
        board[row][col].setIcon(computer);
        board[row][col].setOpaque(true);
    }
}


