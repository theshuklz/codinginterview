package ch1;

class OneAway_1_5 {
    /**
     * Idea is to ensure that two strings are at most 1 length in difference
     * then they can have at most(2 different chars in case of replace) and 1 diff char in case of remove/add
     * We count the how many odd chars in both of the strings. If its more than 2, its not one-away: O(n)
     */
    boolean isOneAway(String first, String another) {
        if (Math.abs(first.length() - another.length()) > 1)
            return false;

        int[] asciiSet = new int[128];
        for (int i = 0; i < first.length(); i++)
            asciiSet[first.charAt(i)]++;

        for (int i = 0; i < another.length(); i++)
            asciiSet[another.charAt(i)]++;

        int oddCharCount = 0;
        for (int i : asciiSet) {
            if (i % 2 != 0) oddCharCount++;
            if (oddCharCount > 2)
                return false;
        }

        return true;
    }
}
