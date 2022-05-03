package ReverseWord;

import java.util.ArrayList;
import java.util.Arrays;


public class Reverse extends senTense {
    static int count = CountWords.count;
    public static int k;
    public static String[] words = sentence.split(" ");
    public static String revFirstWord;
    public static String newRevFirstWord = changeCase();
    public static ArrayList<String> fromSecondword = new ArrayList<String>();
    public static String joinedString;
    private static String[] conv;


    public static String changeCase(){
        words = sentence.split(" ");
        k = words.length;
        revFirstWord = words[k-1];
        newRevFirstWord = revFirstWord.substring(0,1).toUpperCase() + revFirstWord.substring(1);
        return newRevFirstWord;
    }


    public static void reversal() {
        // Add first and get from second word
            // System.out.print( newRevFirstWord + " " + getFromsecondword());

        System.out.println( newRevFirstWord +" "+joinedString);
    }

    public static String[] getFromsecondword() {
        for (k = words.length - 2; k > -1; k--) {
            fromSecondword.add(words[k]);
        }
            //return Arrays.toString(fromSecondword);

        // System.out.println(fromSecondword);
        // System.out.println(Arrays.toString(words));
        conv = new String[fromSecondword.size()];
        for ( int i = 0; i < fromSecondword.size(); i++){

            conv[i] = fromSecondword.get(i);
        }
        return conv;
        }
        public static String arrayTostring () {
            getFromsecondword();
            // String[] word = new String[0];

            StringBuilder sb = new StringBuilder();
            // String words = words[];
            for (k= 0; k < conv.length ; k++) {
                sb.append(conv[k]).append(" ");
            }
            joinedString = sb.toString();
            return joinedString;
        }
}

