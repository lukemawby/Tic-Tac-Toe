/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.main;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Your Name <Luke Mawby at luke.mawby@.co.uk>
 */
public class GameStatsTest extends TestCase {
    
    public GameStatsTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GameStatsTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of addWin method, of class GameStats.
     */
    public void testAddWin() {
        System.out.println("addWin");
        GameStats instance = new GameStats();
        instance.addWin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWins method, of class GameStats.
     */
    public void testGetWins() {
        System.out.println("getWins");
        GameStats instance = new GameStats();
        int expResult = 0;
        int result = instance.getWins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLosses method, of class GameStats.
     */
    public void testAddLosses() {
        System.out.println("addLosses");
        GameStats instance = new GameStats();
        instance.addLosses();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLosses method, of class GameStats.
     */
    public void testGetLosses() {
        System.out.println("getLosses");
        GameStats instance = new GameStats();
        int expResult = 0;
        int result = instance.getLosses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDraws method, of class GameStats.
     */
    public void testAddDraws() {
        System.out.println("addDraws");
        GameStats instance = new GameStats();
        instance.addDraws();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDraws method, of class GameStats.
     */
    public void testGetDraws() {
        System.out.println("getDraws");
        GameStats instance = new GameStats();
        int expResult = 0;
        int result = instance.getDraws();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
