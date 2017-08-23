package Chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tzeyangng on 16/3/17.
 */
public class Question4Test {
    @Test
    public void solve() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(5);
        head.createNext(4).createNext(3).createNext(2).createNext(1);
        assertEquals(true, Question4.isCorrect(Question4.solve(head,3),3));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 1:" + duration);
    }

    @Test
    public void solve2() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(5);
        head.createNext(4).createNext(3).createNext(2).createNext(1).createNext(1);
        assertEquals(true, Question4.isCorrect(Question4.solve(head,2),2));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 1:" + duration);
    }

}