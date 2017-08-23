package DerekVisaQuestion;

import java.util.*;

/**
 * Created by tzeyangng on 7/3/17.
 */
public class StringCollector {
    public static String solve(String s){
        Hashtable<Character,Integer> htable = new Hashtable<>();
        ArrayList<Character> order = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (htable.get(c)==null){
                htable.put(c,1);
                order.add(c);
            }
            else{
                htable.put(c,htable.get(c)+1);
            }
        }
        String output = "";

        while (!order.isEmpty()){
            char c = order.remove(0);
            for (int j=0;j<htable.get(c);j++){
                output += c;
            }
        }
        return output;
    }
}
