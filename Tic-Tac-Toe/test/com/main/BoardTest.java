/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.main;

import java.awt.event.MouseEvent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Your Name <Luke Mawby at luke.mawby@.co.uk>
 */
public class BoardTest extends TestCase {
    
    public BoardTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(BoardTest.class);
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
     * Test of textBoxClicked method, of class Board.
     */
    public void testTextBoxClicked() {
        System.out.println("textBoxClicked");
        MouseEvent evt = null;
        Board instance = new Board();
        instance.textBoxClicked(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testConditions method, of class Board.
     */
    public void testTestConditions() {
        System.out.println("testConditions");
        Board instance = new Board();
        instance.testConditions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gameOverOptions method, of class Board.
     */
    public void testGameOverOptions() {
        System.out.println("gameOverOptions");
        String message = "";
        String title = "";
        Board instance = new Board();
        instance.gameOverOptions(message, title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoardPositions method, of class Board.
     */
    public void testGetBoardPositions() {
        System.out.println("getBoardPositions");
        Board instance = new Board();
        String[] expResult = null;
        String[] result = instance.getBoardPositions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBoardPosition method, of class Board.
     */
    public void testSetBoardPosition() {
        System.out.println("setBoardPosition");
        int position = 0;
        Board instance = new Board();
        instance.setBoardPosition(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Board.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Board.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
