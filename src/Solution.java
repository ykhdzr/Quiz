/**
 * Created by ykhdzr on 4/20/16.
 */
public class Solution {
    private Solution() {
    }

    public static String fizzBuzz(int input) {
        if (input <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= input; i++) {
            if (i % 15 == 0) {
                sb.append("fizzbuzz");
            } else if (i % 3 == 0) {
                sb.append("fizz");
            } else if (i % 5 == 0) {
                sb.append("buzz");
            } else {
                sb.append(i);
            }

            sb.append(",");
        }

        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static String reverseString(String input) {
        if (input.length() <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }

        return sb.toString();
    }

    public static boolean isAnagram(String expect, String target) {
        if (expect == null || target == null || (expect.length() != target.length())) {
            return false;
        }

        char[] expectArr = expect.toCharArray();
        StringBuilder sbTarget = new StringBuilder(target);

        for (char c : expectArr) {
            int index = sbTarget.indexOf("" + c);
            if (index == -1) {
                return false;
            }

            sbTarget.deleteCharAt(index);
        }

        return sbTarget.length() == 0;
    }

    public static boolean isPalindrome(String word) {
        if (null == word) {
            return false;
        }

        char[] wordArr = word.toCharArray();
        int idx1 = 0;
        int idx2 = wordArr.length - 1;
        while (idx2 > idx1) {
            if (wordArr[idx1] != wordArr[idx2]) {
                return false;
            }

            ++idx1;
            --idx2;
        }

        return true;
    }
}