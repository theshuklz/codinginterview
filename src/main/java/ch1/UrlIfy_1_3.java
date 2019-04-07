package ch1;

/**
 *
 */
class UrlIfy_1_3 {
    char[] urlIfy(char[] input, int length) {
        if (length > input.length) throw new IllegalArgumentException("length cannot be more than input size");
        for (int pos = 0; pos < length; pos++) {
            if (input[pos] == ' ') {
                shiftArray(pos, input, length - 1, 2);
                input[pos] = '%';
                input[pos + 1] = '2';
                input[pos + 2] = '0';
                length += 2;
            }
        }
        return input;
    }

    private void shiftArray(int pos, char[] input, int lastCharPos, int shiftBy) {
        for (int i = lastCharPos; i > pos; i--) {
            input[i + shiftBy] = input[i];
        }
    }
}
