package Chapter1;

import junit.framework.TestCase;

/**
 * Created by tzeyangng on 8/3/17.
 */
public class Question1Test extends TestCase {
    public void testAllUniqueCharacters() throws Exception {
        String input = "1234567890-=!@#$%^&*()_+`~qwertyuiop[]QWERTYUIOP{}\\|asdfghjkl;'ASDFGHJKL:\"zxcvbnm,./ZXCVBNM<>?";
        assertEquals(true,Chapter1.Question1.allUniqueCharacters(input));
    }

    public void testAllUniqueCharacters2() throws Exception {
        String input = "1234567890-=!@#$%^&*()_+`~qwertyuiop[]QWERTYUIOP{}\\|asdfghjkl;'ASDFGHJKL:\"zxcvbnm,./ZXCVBNM<>?a";
        assertEquals(false,Chapter1.Question1.allUniqueCharacters(input));
    }

    public void testAllUniqueCharacters3() throws Exception {
        String input = "1234567890-=!@#$%^&*()_+`~qwertyuiop[]QWERTYUIOP{}\\|asdfghjkl;'ASDFGHJKL:\"zxcvbnm,./ZXCVBNM<>?";
        assertEquals(true,Chapter1.Question1.allUniqueCharacters2(input));
    }

    public void testAllUniqueCharacters4() throws Exception {
        String input = "1234567890-=!@#$%^&*()_+`~qwertyuiop[]QWERTYUIOP{}\\|asdfghjkl;'ASDFGHJKL:\"zxcvbnm,./ZXCVBNM<>?a";
        assertEquals(false,Chapter1.Question1.allUniqueCharacters2(input));
    }

}