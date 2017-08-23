package Chapter1;

import junit.framework.TestCase;

/**
 * Created by tzeyangng on 9/3/17.
 */
public class Question3Test extends TestCase {
    public void testSolve() throws Exception {
        String input1 = "`1234567890-=~!@#$%^&*()_+|}{POIUYTREWQqwertyuiop[]\\';lkjhgfdsaASDFGHJKL:\"?><MNBVCXZzxcvbnm,./ ";
        String input2 = "`1234567890-=~!@#$%^&*()_+|}{POIUYTREWQqwertyuiop[]\\';lkjhgfdsaASDFGHJKL:\"?><MNBVCXZzxcvbnm,./ \\";
        assertEquals(false,Chapter1.Question3.solve(input1,input2));
    }

    /*public void testSolve4() throws Exception {
        String input1 = "dog";
        String input2 = "god";
        assertEquals(true,Chapter1.Question2.solve(input1,input2));
    }

    public void testSolve2() throws Exception {
        String input1 = "dog";
        String input2 = "god ";
        assertEquals(false,Chapter1.Question2.solve(input1,input2));
    }

    public void testSolve3() throws Exception {
        String input1 = "ddog";
        String input2 = "god";
        assertEquals(false,Chapter1.Question2.solve(input1,input2));
    }*/


}