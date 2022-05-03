package ReverseWord;

import java.util.ArrayList;


public class Reverse extends senTense {
    public static int k;
    public static String[] words = sentence.split(" ");
    public static String revFirstWord;
    public static String newRevFirstWord = changeCase();
    public static ArrayList<String> fromSecondword = new ArrayList<>();
    public static String joinedString;
    private static String[] conv;


    public static String changeCase(){
        words = sentence.split(" ");
        k = words.length;
        revFirstWord = words[k-1];
        newRevFirstWord = revFirstWord.substring(0,1).toUpperCase() + revFirstWord.substring(1);
        return newRevFirstWord;
    }

    public static void getFromsecondword() {
        for (k = words.length - 2; k > -1; k--) {
            fromSecondword.add(words[k]);
        }
            //convert arraylist to array
        conv = new String[fromSecondword.size()];
        for ( int i = 0; i < fromSecondword.size(); i++){

            conv[i] = fromSecondword.get(i);
        }
    }
        public static void arrayTostring () {
            getFromsecondword();
            // String[] word = new String[0];

            StringBuilder sb = new StringBuilder();
            // String words = words[];
            for (k= 0; k < conv.length ; k++) {
                sb.append(conv[k]).append(" ");
            }
            joinedString = sb.toString();
        }
}

