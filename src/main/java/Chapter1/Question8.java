package Chapter1;

/**
 * Created by tzeyangng on 14/3/17.
 */
public class Question8 {
    //Assume you have a method isSubstring which checks if one word is a substring of another.
    // Given two strings,s1 and s2, write code to check If s2 is a rotation of s1 using only one call to isSubstring
    // (e.g.,"waterbottLe"is a rotation of"erbottLewat").

    public static boolean solve(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }

        s1 = s1+s1;

        return isSubstring(s1,s2);
    }

    public static boolean isSubstring(String main, String sub){
        return main.contains(sub);
    }
}
