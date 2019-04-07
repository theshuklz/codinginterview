package ch1;

class IsUnique_1_1 {
    boolean isUnique(String input) {
        boolean[] charSet = new boolean[128];
        for (int pos = 0; pos < input.length(); pos++) {
            char letter = input.charAt(pos);
            if (charSet[letter])
                return false;
            charSet[letter] = true;
        }
        return true;
    }
}
