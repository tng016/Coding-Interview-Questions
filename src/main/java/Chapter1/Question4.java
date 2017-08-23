package Chapter1;

/**
 * Created by tzeyangng on 11/3/17.
 */
public class Question4 {
    //Write a method to replace all spaces in a string with '%20'.
    // You may assume that the string has sufficient space at the end of the string to hold the additional characters,
    // and that you are given the "true" length of the string.
    // (Note: if implementing in Java, please use a character array so that you can perform this operation inplace.)

    public static String solve(String inputString){
        String[] parts = inputString.split(" ");
        String output = parts[0];
        for (int i=1;i<parts.length;i++){
            output += "%20" + parts[i];
        }
        return output;
    }

    public static String solve2(String inputString){
        String output = "";
        for (int i=0;i<inputString.length();i++){
            char c = inputString.charAt(i);
            if (c !=' '){
                output += c;
            }
            else {
                output += "%20";
            }
        }
        return output;
    }

    public static String solve3(String inputString){
        String output = "";
        char[] charArray = inputString.toCharArray();
        for (char c : charArray){
            if (c !=' '){
                output += c;
            }
            else {
                output += "%20";
            }
        }
        return output;
    }

    //without strings
    public static String solve4(String inputString){
        char[] charArray = inputString.toCharArray();
        int spaceCounter = 0;
        for (char c : charArray){
            if (c ==  ' '){
                spaceCounter++;
            }
        }

        char[] output = new char[charArray.length + spaceCounter*2];
        for (int i=0,j=0; i<charArray.length ;i++){
            char c = charArray[i];
            if (c ==  ' '){
                output[j++] = '%';
                output[j++] = '2';
                output[j++] = '0';
            }
            else{
                output[j++] = c;
            }
        }
        return charArray.toString();
    }
}
