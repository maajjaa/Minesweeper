# Minesweeper game


   This is a version of the well known mine game on different platforms (MSDos, Unix, Mac...).
   
### Instruction

GAME CONTROL:
Move the pointer (arrow) with a mouse.


GOAL:
  To find out where all the mines are
hidden on the board as quick as possible.

HOW TO PLAY:
  At start the board are "blank". The first thing
to do is to just click on any square. Now one of the
following happens:
  
   - empty square is shown
   - number is shown (1 - 8)
   - you hit a mine ( GAME OVER).

The empty square means that no mines.
The number means how many mines
in the surrounding squares.

HOW TO WIN:

  Just mark where all the mines are. The best times are kept
in a high score list.

### Example:

Win code example:
```java#
private void win(){
        boolean won = true;
        for(int i=0; i<hei; i++){
            for(int j=0; j<wid; j++){
                if(block[i][j] == 0){
                    won = false;
                    break;
                }
            }
            if(!won)break;
        }
        if(won){
            javax.swing.JOptionPane.showMessageDialog(null, "You win!");
            play = false;
        }
    }
```



