package Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tzeyangng on 14/3/17.
 */
public class Question7Test {
    @Test
    public void solve() throws Exception {
        long startTime = System.nanoTime();
        int[][] input = {{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
        int[][] output = {{0,0,0,0},{0,5,6,7},{0,9,10,11},{0,13,14,15}};
        assertArrayEquals(output, Question7.solve(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 1:" + duration);
    }

    @Test
    public void solve2() throws Exception {
        long startTime = System.nanoTime();
        int[][] input = {{0,1,2,3},{4,5,6,7},{0,9,10,11},{12,13,14,15}};
        int[][] output = {{0,0,0,0},{0,5,6,7},{0,0,0,0},{0,13,14,15}};
        assertArrayEquals(output, Question7.solve(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 2:" + duration);
    }

    @Test
    public void solve3() throws Exception {
        long startTime = System.nanoTime();
        int[][] input = {{0,1,2,3},{4,5,6,7},{8,9,0,11},{12,13,14,15}};
        int[][] output = {{0,0,0,0},{0,5,0,7},{0,0,0,0},{0,13,0,15}};
        assertArrayEquals(output, Question7.solve(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 2:" + duration);
    }

    @Test
    public void solve4() throws Exception {
        long startTime = System.nanoTime();
        int[][] input = {{0,1,2,3},{4,5,6,7},{8,9,10,0},{12,13,14,15}};
        int[][] output = {{0,0,0,0},{0,5,6,0},{0,0,0,0},{0,13,14,0}};
        assertArrayEquals(output, Question7.solve(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 2:" + duration);
    }

}