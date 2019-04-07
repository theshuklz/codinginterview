package ch1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPermutation_1_2Test {

    @Test
    public void when_same_strings_checkPermutation_returns_true() {
        assertTrue(new CheckPermutation_1_2().checkPermutation("hola", "hola"));
    }

    @Test
    public void when_diff_strings_checkPermutation_returns_false() {
        assertFalse(new CheckPermutation_1_2().checkPermutation("hola", "pool"));
    }

    @Test
    public void when_permutedString_checkPermutation_returns_true() {
        assertTrue(new CheckPermutation_1_2().checkPermutation("hola", "loha"));
    }
}