package DerekVisaQuestion;

import junit.framework.TestCase;

/**
 * Created by tzeyangng on 7/3/17.
 */
public class StringCollectorTest extends TestCase {
    public void testSolve() throws Exception {
        String input = "abcabcabcabc";
        String output = "aaaabbbbcccc";
        assertEquals(output,StringCollector.solve(input));
    }

    public void testSolve1() throws Exception {
        String input = "abcabcabcabc";
        String output = "aaaabbbbccccs";
        assertEquals(output,StringCollector.solve(input));
    }

    public void testSolve2() throws Exception {
        String input = "abcabcabcabc";
        String output = "aaaabbbbccccg";
        assertEquals(output,StringCollector.solve(input));
    }

}