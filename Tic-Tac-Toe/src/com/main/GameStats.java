/*
 *
 */
package com.main;

/**
 * @author Luke Mawby
 */
public class GameStats {

    int numberOfWins;
    int numberOfLosses;
    int numberOfDraws;

    public void addWin() {
        numberOfWins++;
    }

    public int getWins() {
        return numberOfWins;
    }

    public void addLosses() {
        numberOfLosses++;
    }

    public int getLosses() {
        return numberOfLosses;
    }

    public void addDraws() {
        numberOfDraws++;
    }

    public int getDraws() {
        return numberOfDraws;
    }

}
