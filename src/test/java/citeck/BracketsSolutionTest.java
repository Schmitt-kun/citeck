/*
 * 
 */
package citeck;

import citeck.BracketsSolution;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kuznetsov Igor
 */
public class BracketsSolutionTest {
    
    public BracketsSolutionTest() {
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
    public void testPass() {
        BracketsSolution s = new BracketsSolution();
        String str = "([][[]()])";
        assertTrue(s.solution(str));
    }
    
    @Test
    public void testFail() {
        BracketsSolution s = new BracketsSolution();
        String str = "([][]()])";
        assertFalse(s.solution(str));
    }
    
    @Test
    public void testEmpty() {
        BracketsSolution s = new BracketsSolution();
        String str = "";
        assertTrue(s.solution(str));
    }
    
    @Test
    public void testFail1() {
        BracketsSolution s = new BracketsSolution();
        String str = "(";
        assertFalse(s.solution(str));
    }
    
    @Test
    public void testFail21() {
        BracketsSolution s = new BracketsSolution();
        String str = ")";
        assertFalse(s.solution(str));
    }
}
