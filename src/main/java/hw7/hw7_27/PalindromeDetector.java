package hw7.hw7_27;

/*Перепиши метод reverse(String word) у класі PalindromeDetector,
щоб позбавитися від циклу, і використати метод reverse() класу StringBuilder для розгортання рядка.

public class PalindromeDetector {
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        String result = "";
        char[] chars = word.toCharArray();
        for(char c: chars) {
            result = c + result;
        }
        return result;
    }
}
*/
public class PalindromeDetector {
    private String reverse(String word){
        return new StringBuilder(word).reverse().toString();
    }

    public boolean isPalindrome(String word){
        return word.equalsIgnoreCase(reverse(word));
    }
}