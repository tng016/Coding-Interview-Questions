package Chapter1;

import junit.framework.TestCase;

/**
 * Created by tzeyangng on 11/3/17.
 */
public class Question4Test extends TestCase {
    public void testSolve() throws Exception {
        long startTime = System.nanoTime();
        String input = "  a  b c d e f g h i j k l m n o p q r s t u v w x y z";
        String output = "%20%20a%20%20b%20c%20d%20e%20f%20g%20h%20i%20j%20k%20l%20m%20n%20o%20p%20q%20r%20s%20t%20u%20v%20w%20x%20y%20z";
        assertEquals(output, Question4.solve(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println(duration);
    }

    public void testSolve2() throws Exception {
        long startTime = System.nanoTime();
        String input = "  a  b c d e f g h i j k l m n o p q r s t u v w x y z";
        String output = "%20%20a%20%20b%20c%20d%20e%20f%20g%20h%20i%20j%20k%20l%20m%20n%20o%20p%20q%20r%20s%20t%20u%20v%20w%20x%20y%20z";
        assertEquals(output, Question4.solve2(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println(duration);
    }

    public void testSolve3() throws Exception {
        long startTime = System.nanoTime();
        String input = "  a  b c d e f g h i j k l m n o p q r s t u v w x y z";
        String output = "%20%20a%20%20b%20c%20d%20e%20f%20g%20h%20i%20j%20k%20l%20m%20n%20o%20p%20q%20r%20s%20t%20u%20v%20w%20x%20y%20z";
        assertEquals(output, Question4.solve3(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println(duration);
    }

    public void testSolve4() throws Exception {
        long startTime = System.nanoTime();
        String input = "  a  b c d e f g h i j k l m n o p q r s t u v w x y z";
        String output = "%20%20a%20%20b%20c%20d%20e%20f%20g%20h%20i%20j%20k%20l%20m%20n%20o%20p%20q%20r%20s%20t%20u%20v%20w%20x%20y%20z";
        assertEquals(output, Question4.solve3(input));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println(duration);
    }

}