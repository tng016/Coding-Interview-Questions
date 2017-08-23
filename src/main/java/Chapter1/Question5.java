package Chapter1;

import java.util.Arrays;

/**
 * Created by tzeyangng on 11/3/17.
 */
public class Question5 {
    //Implement a method to perform basic string compression using the counts of repeated characters.
    // For example, the string aabcccccaaa would become a2blc5a3.
    // If the "compressed" string would not become smaller than the original string, your method should return the original string.

    /**
     * @author      Ng Tze Yang
     * @version     1.0
     * @since       11 Mar 2017
     */
    public static String solve(String inputStr){
        int length = inputStr.length();
        char[] characters = new char[length];
        int[] counts = new int[length];
        int arrayPointer = 0;
        int count = 1;
        char c = 0;

        for (int i =1 ;i<length;i++){
            c = inputStr.charAt(i);
            char last = inputStr.charAt(i-1);
            if (c == last){
                count ++;
            }
            else{
                characters[arrayPointer] = last;
                counts[arrayPointer] = count;
                count =1;
                arrayPointer++;
            }
        }
        characters[arrayPointer] = c;
        counts[arrayPointer] = count;
        arrayPointer++;

        String output = "";
        for(int i=0;i<arrayPointer;i++){
            output += characters[i];
            output += counts[i];
        }

        if (output.length()< length){
            return output;
        }
        else {
            return inputStr;
        }
    }
}
