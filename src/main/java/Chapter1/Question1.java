package Chapter1;

import java.util.Hashtable;

/**
 * Created by tzeyangng on 8/3/17.
 */
public class Question1 {
    //Question: Implement an algorithm to determine if a string has all unique characters
    public static boolean allUniqueCharacters(String inputStr){
        Hashtable<Character,Boolean> htable = new Hashtable<>();
        for (int i =0;i<inputStr.length();i++){
            if (htable.get(inputStr.charAt(i))== null){
                htable.put(inputStr.charAt(i),true);
            }
            else{
                return false;
            }
        }
        return true;
    }

    //Part 2: What if you cannot use additional data structures
    public static boolean allUniqueCharacters2(String inputStr){
        for (int i=0;i<inputStr.length();i++){
            char c = inputStr.charAt(i);
            for (int j=i+1;j<inputStr.length();j++){
                if (c == inputStr.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
