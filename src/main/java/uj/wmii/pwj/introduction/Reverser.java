package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String input) {
        if (input == null)
            return null;

        input = input.strip();
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--)
            reverse += input.charAt(i);

        return reverse;
    }

    public String reverseWords(String input) {
        if (input == null)
            return null;
            
        input = input.strip();
        String reverse = "";
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++)
            reverse = words[i] + " " + reverse;

        reverse = reverse.strip();

        return reverse;
    }
}
