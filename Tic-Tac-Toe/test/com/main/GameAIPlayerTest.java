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
public class GameAIPlayerTest extends TestCase {
    
    public GameAIPlayerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GameAIPlayerTest.class);
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
     * Test of choosePosition method, of class GameAIPlayer.
     */
    public void testChoosePosition() {
        System.out.println("choosePosition");
        String[] currentBoard = null;
        GameAIPlayer instance = new GameAIPlayer();
        int expResult = 0;
        int result = instance.choosePosition(currentBoard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
