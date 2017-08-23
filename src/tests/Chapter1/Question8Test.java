package Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tzeyangng on 14/3/17.
 */
public class Question8Test {
    @Test
    public void solve() throws Exception {
        long startTime = System.nanoTime();
        String input = "WaterBottle";
        String output = "tleWaterBot";
        assertEquals(true, Question8.solve(input,output));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("test # 1:" + duration);
    }

}