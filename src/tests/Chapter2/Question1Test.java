package Chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tzeyangng on 15/3/17.
 */
public class Question1Test {
    @Test
    public void solve() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(1);
        head.createNext(2).createNext(3).createNext(4).createNext(5);
        String output = "[1,2,3,4,5]\n";
        System.out.print(LinkedList.toString(head));
        assertEquals(output, Question1.solve(head));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 1:" + duration);
    }

    @Test
    public void solve2() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(1);
        head.createNext(2).createNext(3).createNext(4).createNext(5).createNext(1);
        String output = "[1,2,3,4,5]\n";
        assertEquals(output, Question1.solve(head));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 2:" + duration);
    }

    @Test
    public void solve3() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(1);
        head.createNext(2).createNext(1).createNext(3).createNext(4).createNext(5).createNext(1).createNext(2).createNext(6);
        String output = "[1,2,3,4,5,6]\n";
        assertEquals(output, Question1.solve(head));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 3:" + duration);
    }

    @Test
    public void solve4() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(1);
        head.createNext(2).createNext(3).createNext(4).createNext(5);
        String output = "[1,2,3,4,5]\n";
        System.out.print(LinkedList.toString(head));
        assertEquals(output, Question1.solve2(head));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 1:" + duration);
    }

    @Test
    public void solve5() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(1);
        head.createNext(2).createNext(3).createNext(4).createNext(5).createNext(1);
        String output = "[1,2,3,4,5]\n";
        assertEquals(output, Question1.solve2(head));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 2:" + duration);
    }

    @Test
    public void solve6() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(1);
        head.createNext(2).createNext(1).createNext(3).createNext(4).createNext(5).createNext(1).createNext(2).createNext(6);
        String output = "[1,2,3,4,5,6]\n";
        assertEquals(output, Question1.solve2(head));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 3:" + duration);
    }

    @Test
    public void solve7() throws Exception {
        long startTime = System.nanoTime();
        LinkedList head = new LinkedList(1);
        head.createNext(1).createNext(1).createNext(3).createNext(4).createNext(5).createNext(1).createNext(6).createNext(6);
        String output = "[1,3,4,5,6]\n";
        assertEquals(output, Question1.solve2(head));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 3:" + duration);
    }

    }