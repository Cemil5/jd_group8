package week_06;

/*
Remove Vowels and Spaces from a String
Given a string str, write a method that removes the vowels 'a', 'e', 'i', 'o', 'u' and spaces from it, and returns the new string.

Example 1:
Input: "write once run anywhere"
Output: "wrtncrnnywhr"

Example 2:
Input: "everything is an object"
Output: "vrythngsnbjct"

Example 3:
Input: "ae iou"
Output: ""

Note:
str consists of lowercase English letters or space only.
1 <= S.length <= 1000
 */

public class VowelRemover {
    public static void main(String[] args) {
        System.out.println(removeVowels("write once run anywhere"));
        System.out.println(removeVowels("ae iou"));
        System.out.println(removeVowels("everything is an object"));
    }

    public static String removeVowels1(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != ' ') {
                result = result + ch;
            }
        }
        return result;
    }

    public static String removeVowels2(String str){
        String result = str.replace("a", "");
        result = result.replace("e", "");
        result = result.replace("i", "");
        result = result.replace("o", "");
        result = result.replace("u", "");
        result = result.replace(" ", "");
        return result;
    }

    public static String removeVowels(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (("aeiou ".indexOf(currentChar) == -1)) { // checks if the character is not a vowel or space
                result += currentChar;
            }
        }
        return result;
    }

}
