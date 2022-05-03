package ReverseWord;

public class ReverseWord {

    public static void main(String[] args) {
        System.out.println("Enter the sentence below :");
        senTense.getSentence();
        Reverse.changeCase();
        Reverse.arrayTostring();
        System.out.println( Reverse.newRevFirstWord +" "+ Reverse.joinedString);
    }
}