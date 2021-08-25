/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.tdd.koans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author thias
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void greetTest() {
        String[] name = {"Bob"};
        String expected = "Hello, Bob";
        String actual = Main.greet(name); 
        assertEquals(expected, actual);
        
    }
    
    @Test
    public void greetNotNullTest()   {
        String[] name = null;
        String expected = "Hello, my friend";
        String actual = Main.greet(name);
        assertEquals(expected, actual);
    }
    
    @Test
    public void toUpperCaseTest()   {
        
        String[] name = {"BOB"};
        String expected = "HELLO BOB!";
        String actual = Main.greet(name);
        assertEquals(expected, actual);
       
        
    }
    
    @Test
    public void commaSeperationTest()   {
        String[] name = {"Bob", "Jens"};
        String expected = "Hello, Bob and Jens";
        String actual = Main.greet(name);
        assertEquals(expected, actual);
  
    }
    
    @Test
    public void moreNamesTest() {
        String[] name = {"Bob", "Kurt", "Brian"};
        String expected = "Hello, Bob, Kurt and Brian";
        String actual = Main.greet(name);
        assertEquals(expected, actual);
    }
    
}
