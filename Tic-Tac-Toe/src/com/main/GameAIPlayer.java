/*
 *
 */
package com.main;

import java.lang.Math;

/**
 * @author Your Name <Luke Mawby at luke.mawby@.co.uk>
 */
public class GameAIPlayer {

    public int choosePosition(String[] currentBoard) {
        int randomChoice = (int) (Math.random() * 8 + 1);
        int chosenPosition = -1;

        if (currentBoard[randomChoice].equals("-")) {
            chosenPosition = randomChoice;
        } else {
            for (int i = 0; i <= 8; i++) {
                if (currentBoard[i].equals("-")) {
                    chosenPosition = i;
                }
            }
        }
        
        
        /*
            Zombie Code
        
        int chosenPosition;
        ArrayList spacesLeft = new ArrayList();

        for (int i = 0; i <= 8; i++) {
            if (currentBoard[i].equals("-")) {
                spacesLeft.add(i);
            }
        }
        
        chosenPosition = (int) (Math.random() * spacesLeft.size() + 1);

        return chosenPosition;
        */

        return chosenPosition;
    }

}
