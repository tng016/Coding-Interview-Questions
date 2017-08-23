package Chapter1;

import junit.framework.TestCase;

import java.util.HashMap;

/**
 * Created by tzeyangng on 11/3/17.
 */
public class Question5Test extends TestCase {

    public void testSolve() throws Exception {
        long startTime = System.nanoTime();
        String input = "aaabbbccc";
        String output = "a3b3c3";
        assertEquals(output, Question5.solve(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 1:" + duration);
    }

    public void testSolve2() throws Exception {
        long startTime = System.nanoTime();
        String input = "abc";
        String output = "abc";
        assertEquals(output, Question5.solve(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 2:" + duration);
    }

}