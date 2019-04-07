package ch1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsUnique_1_1Test {

    @Test
    public void when_uniqueChars_isUnique_returns_true() {
        assertTrue(new IsUnique_1_1().isUnique("hola"));
    }

    @Test
    public void when_NonUniqueChars_isUnique_returns_false() {
        assertFalse(new IsUnique_1_1().isUnique("hhola"));
    }

    @Test
    public void when_emptyString_isUnique_returns_true() {
        assertTrue(new IsUnique_1_1().isUnique(""));
    }

}