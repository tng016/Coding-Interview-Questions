package Chapter1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by tzeyangng on 9/3/17.
 */
public class Question3 {
    //Given two strings, write a method to decide if one is a permutation of the other.
    public static boolean solve(String strOne, String strTwo){
        if (strOne.length() != strTwo.length()){
            return false;
        }
        int[] charactersA = new int[255];
        int[] charactersB = new int[255];

        for (int j = 0;j<strOne.length();j++){
            charactersA[(int)strOne.charAt(j)]++;
            charactersB[(int)strTwo.charAt(j)]++;
        }

        if (Arrays.equals(charactersA,charactersB)){
            return true;
        }
        return false;
    }
}
