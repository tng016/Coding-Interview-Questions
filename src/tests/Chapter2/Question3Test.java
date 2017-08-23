package Chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tzeyangng on 16/3/17.
 */
public class Question3Test {
    @Test
    public void solve() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(1);
        head.createNext(2).createNext(3).createNext(4).createNext(5);
        LinkedList middle = head.getNext().getNext();
        String output = "[1,2,4,5]\n";
        assertEquals(output, Question3.solve(middle,head));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 1:" + duration);
    }

}