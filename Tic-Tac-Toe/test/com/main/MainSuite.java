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
public class MainSuite extends TestCase {
    
    public MainSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("MainSuite");
        suite.addTest(GameStatusTest.suite());
        suite.addTest(GameAIPlayerTest.suite());
        suite.addTest(BoardTest.suite());
        suite.addTest(GameStatsTest.suite());
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
    
}
