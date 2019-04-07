package ch1;

class PalindromePermutation_1_4 {
    /**
     * Idea is to clean the input by trimming whitespace and making all chars to lowercase.
     * In a palindrome there has to be a matching pair for each char but there can be at most 1 single character
     * because it can be in the center of the string: O(n)
     */
    boolean isPalindromePermutation(String input) {
        int[] asciiArray = new int[128];
        input = input.toLowerCase().replaceAll(" ", "");

        for (int i = 0; i < input.length(); i++)
            asciiArray[input.charAt(i)]++;

        int oddNumCount = 0;
        for (int i : asciiArray) {
            if (i % 2 != 0)
                oddNumCount++;
            if (oddNumCount > 1)
                return false;
        }
        return true;
    }
}
