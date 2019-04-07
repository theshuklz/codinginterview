package ch1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromePermutation_1_4Test {
    PalindromePermutation_1_4 classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new PalindromePermutation_1_4();
    }

    @Test
    public void singleCharInput_isPalindromePermutation_returns_true() {
        assertTrue(classUnderTest.isPalindromePermutation("a"));
    }

    @Test
    public void doubleSameCharInput_isPalindromePermutation_returns_true() {
        assertTrue(classUnderTest.isPalindromePermutation("aa"));
    }

    @Test
    public void doubleDiffCharInput_isPalindromePermutation_returns_false() {
        assertFalse(classUnderTest.isPalindromePermutation("a b"));
    }

    @Test
    public void TripleSameCharInput_isPalindromePermutation_returns_true() {
        assertTrue(classUnderTest.isPalindromePermutation("a a a"));
    }

    @Test
    public void TwoSame1DiffCharInput_isPalindromePermutation_returns_true() {
        assertTrue(classUnderTest.isPalindromePermutation("Aab"));
    }

    @Test
    public void ThreeDiffCharInput_isPalindromePermutation_returns_false() {
        assertFalse(classUnderTest.isPalindromePermutation("abc"));
    }
}