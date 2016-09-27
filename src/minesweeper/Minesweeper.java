package minesweeper;


import static minesweeper.MineFrame.hei;
import static minesweeper.MineFrame.wid;

public class Minesweeper {

    public static void main(String[] args) {
      
        MineFrame frame;
        frame = new MineFrame(hei, wid);
        
        
        frame.setVisible(true);
        
         
    }
    
}
