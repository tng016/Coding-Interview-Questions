package Chapter1;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by tzeyangng on 13/3/17.
 */
public class Question6Test extends TestCase {
    public void testSolve() throws Exception {
        long startTime = System.nanoTime();
        int[][] input = {{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
        int[][] output = {{12,8,4,0},{13,9,5,1},{14,10,6,2},{15,11,7,3}};
        assertArrayEquals(output, Question6.solve(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 1:" + duration);
    }

    public void testSolve2() throws Exception {
        long startTime = System.nanoTime();
        int[][] input = {{0,1,2,3,4},{4,5,6,7,8},{8,9,10,11,12},{12,13,14,15,16},{16,17,18,19,20}};
        int[][] output = {{16,12,8,4,0},{17,13,9,5,1},{18,14,10,6,2},{19,15,11,7,3},{20,16,12,8,4}};
        assertArrayEquals(output, Question6.solve(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 2:" + duration);
    }

}