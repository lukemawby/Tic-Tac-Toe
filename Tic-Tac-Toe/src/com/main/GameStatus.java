/*
 *
 */

package com.main;

import java.util.Arrays;

/**
 * @author Luke Mawby
 */
public class GameStatus {

    private boolean playerWin;
    private boolean playerLose;
    private boolean playerDraw;

    private boolean checkForDraw(String[] currentBoard) {
        if (Arrays.asList(currentBoard).contains("-")) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checkForWinOrLose(String mark, String[] currentBoard) {
        //Horizontal
        if ((currentBoard[0].equals(mark) && currentBoard[1].equals(mark) && currentBoard[2].equals(mark))
                || (currentBoard[3].equals(mark) && currentBoard[4].equals(mark) && currentBoard[5].equals(mark))
                || (currentBoard[6].equals(mark) && currentBoard[7].equals(mark) && currentBoard[8].equals(mark))) {
            return true;
        }//Verticle
        else if ((currentBoard[0].equals(mark) && currentBoard[3].equals(mark) && currentBoard[6].equals(mark))
                || (currentBoard[1].equals(mark) && currentBoard[4].equals(mark) && currentBoard[7].equals(mark))
                || (currentBoard[2].equals(mark) && currentBoard[5].equals(mark) && currentBoard[8].equals(mark))) {
            return true;
        }//Diagional
        else if ((currentBoard[0].equals(mark) && currentBoard[4].equals(mark) && currentBoard[8].equals(mark))
                || (currentBoard[2].equals(mark) && currentBoard[4].equals(mark) && currentBoard[6].equals(mark))) {
            return true;
        }

        return false;
    }

    public boolean[] checkConditions(String[] currentBoard) {
        playerWin = false;
        playerLose = false;
        playerDraw = false;
        boolean[] playerConditions = new boolean[3];

        playerDraw = checkForDraw(currentBoard);
        playerWin = checkForWinOrLose("X", currentBoard);
        playerLose = checkForWinOrLose("O", currentBoard);

        playerConditions[0] = playerWin;
        playerConditions[1] = playerLose;
        playerConditions[2] = playerDraw;

        return playerConditions;
    }

}
