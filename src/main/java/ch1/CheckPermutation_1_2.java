package ch1;

class CheckPermutation_1_2 {
    /**
     * <h2>Possible Solutions</h2>
     * 1. sort both strings and check if they are equal: O(nlogn)
     * 2. search for each character in first string in second one and remove that char from second if found: O(n^2)
     * 3. create a map of each character in first string and check for each of the chars in second string in the ma :O(n)
     */
    boolean checkPermutation(String first, String second) {
        boolean[] asciiMap = new boolean[128];
        if (first.length() != second.length())
            return false;
        else {
            for (int pos = 0; pos < first.length(); pos++)
                asciiMap[first.charAt(pos)] = true;

            for (int pos = 0; pos < second.length(); pos++) {
                if (!asciiMap[second.charAt(pos)])
                    return false;
            }
            return true;
        }
    }
}
