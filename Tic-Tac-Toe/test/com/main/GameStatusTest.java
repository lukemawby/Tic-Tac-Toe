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
public class GameStatusTest extends TestCase {
    
    public GameStatusTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GameStatusTest.class);
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
     * Test of checkConditions method, of class GameStatus.
     */
    public void testCheckConditions() {
        System.out.println("checkConditions");
        String[] currentBoard = null;
        GameStatus instance = new GameStatus();
        boolean[] expResult = null;
        boolean[] result = instance.checkConditions(currentBoard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
