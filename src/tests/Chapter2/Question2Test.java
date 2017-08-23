package Chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tzeyangng on 16/3/17.
 */
public class Question2Test {
    @Test
    public void solve() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(1);
        head.createNext(2).createNext(3).createNext(4).createNext(5);
        String output = "[1,2,3,4,5]\n";
        assertEquals(4, Question2.solve(head,1));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 1:" + duration);
    }

    @Test
    public void solve2() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(1);
        head.createNext(2).createNext(3).createNext(4).createNext(5);
        String output = "[1,2,3,4,5]\n";
        assertEquals(-1, Question2.solve(head,5));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 2:" + duration);
    }

    @Test
    public void solve3() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(1);
        head.createNext(2).createNext(3).createNext(4).createNext(5);
        String output = "[1,2,3,4,5]\n";
        assertEquals(5, Question2.solve(head,0));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 3:" + duration);
    }

}