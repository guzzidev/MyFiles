package ReverseWord;

public class Reverse extends senTense {

    public static void reversal() {
        CountWords CountWords = new CountWords();
        int count = CountWords.count;
        String[] words = sentence.split(" ");
        for (int k = count - 1; k > -1; k--) {
            System.out.print(words[k] + " ");
        }

    }
}
