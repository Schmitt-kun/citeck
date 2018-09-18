/*
 * 
 */
package citeck;

import citeck.ZeroSolution;
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
public class ZeroSolutionTest {
    
    ZeroSolution s = new ZeroSolution();
    
    public ZeroSolutionTest() {
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
    public void test() {
        int i = 0;
        assertTrue(1 == s.solution(i));
    }
    
    @Test
    public void test1() {
        int i = 10;
        assertTrue(11 == s.solution(i));
    }
    
    @Test
    public void test2() {
        int i = 2;
        assertTrue(2 == s.solution(i));
    }
    
    @Test
    public void test3() {
        int i = 100;
        assertTrue(101 == s.solution(i));
    }
    
    @Test
    public void test4() {
        int i = -100;
        assertTrue(-101 == s.solution(i));
    }
    
    @Test
    public void test5() {
        int i = 101;
        assertTrue(111 == s.solution(i));
    }
    
    @Test
    public void binaryTest() {
        int i = 0b0;
        assertTrue(0b1 == s.binarySolution(i));
    }
    
    @Test
    public void binaryTest1() {
        int i = 0b10;
        assertTrue(0b11 == s.binarySolution(i));
    }
    
    @Test
    public void binaryTest2() {
        int i = 0b101;
        assertTrue(0b111 == s.binarySolution(i));
    }
}
