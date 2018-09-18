package citek;

import java.util.Arrays;
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
public class ArraySolutionTest {
    
    public ArraySolutionTest() {
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
    
    public boolean equalArrays(int[][] arr0, int[][]arr1) {
        if (arr0 == null || arr1 == null)
            return false;
        
        if (arr0.length != arr1.length) 
            return false;
        
        for(int i = 0; i < arr0.length; i++) {
            if (!Arrays.equals(arr0[i], arr1[i]))
                return false;
        }
        
        return true;
    }
    
    private String printArray(int[][] arr) {
        StringBuilder b = new StringBuilder("[");
        
        for(int i = 0; i < arr.length; i++) {
            b.append(printArray(arr[i]));
            if (i < arr.length - 1)
                b.append(",");
        }
        
        b.append("]");
        return b.toString();
    }
    
    private String printArray(int[] arr) {
        StringBuilder b = new StringBuilder("[");
        
        for(int i = 0; i < arr.length; i++) {
            b.append(arr[i]);
            if (i < arr.length - 1)
                b.append(",");
        }
        
        b.append("]");
        return b.toString();
    }

    @Test
    public void test() {
        ArraySolution s = new ArraySolution();
        int[] ar = new int [] {1,1,2,2,2,3};
        int[][] res = new int [][] {{3,1}, {1,2}, {2,3}};
        
        int[][] aktual = s.solution(ar);
        
        System.out.println(printArray(aktual));
        assertTrue(equalArrays(aktual, res));
    }
    
    @Test
    public void test1() {
        ArraySolution s = new ArraySolution();
        int[] ar = new int [] {3,2,1};
        int[][] res = new int [][] {{1,1}, {2,1}, {3,1}};
        
        int[][] aktual = s.solution(ar);
        
        System.out.println(printArray(aktual));
        assertTrue(equalArrays(aktual, res));
    }
}
