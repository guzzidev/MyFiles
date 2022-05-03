package ReverseWord;


public class CountWords extends senTense{
    public static int count;
    public static int CountWord() {
        // count the number of words
        count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i) == ' ') && (sentence.charAt(i + 1) != ' ')) {
                count++;

            }
        }
        return count = count + 1;
    }
}