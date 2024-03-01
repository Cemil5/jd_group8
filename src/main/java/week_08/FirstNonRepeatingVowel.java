package week_08;

/*
Given a string (which is not empty), write a method to find the first non-repeating vowel (a, e, i, o, u) in it and return its index. If it doesn't exist, return -1. Assume that all the characters of the String is lowercase.
Follow-up Question: Can you solve it, only using loops and String charAt() and length() methods.
 */
public class FirstNonRepeatingVowel {

    public static void main(String[] args) {
//        System.out.println("google = " + getFirstNonRepeatingVowel("google"));
//        System.out.println("repeat = " + getFirstNonRepeatingVowel("repeat"));
//        System.out.println("book = " + getFirstNonRepeatingVowel("book"));
//        System.out.println("bcd = " + getFirstNonRepeatingVowel("bcd"));

        String [] inputs = {"google", "repeat", "book", "bcd"};
        for (String input : inputs) {
            System.out.println(input + " = " + firstNonRepeatingVowel(input));
        }
    }

    public static int getFirstNonRepeatingVowel(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                int vowelCount = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (ch == input.charAt(j)) {
                        vowelCount++;
                    }
                }
                if (vowelCount == 1) return i;
            }
        }
        return -1;
    }

    public static int getFirstNonRepeatingVowel2(String input) {
        String vowels = "aeiou";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int firstNonRepeatingVowel(String str) {
        int []vowelCount = new int[5];
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                vowelCount[0]++;
            } else if (ch == 'e') {
                vowelCount[1]++;
            } else if (ch == 'i') {
                vowelCount[2]++;
            } else if (ch == 'o') {
                vowelCount[3]++;
            } else if (ch == 'u') {
                vowelCount[4]++;
            }

        }

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if ((ch == 'a' && vowelCount[0] == 1) ||
                    (ch == 'e' && vowelCount[1] == 1) ||
                    (ch == 'i' && vowelCount[2] == 1) ||
                    (ch == 'o' && vowelCount[3] == 1) ||
                    (ch == 'u' && vowelCount[4] == 1)) {
                return i;
            }
        }
        return -1;
    }


}
