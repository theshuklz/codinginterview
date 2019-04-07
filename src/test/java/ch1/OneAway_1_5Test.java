package ch1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OneAway_1_5Test {
    private OneAway_1_5 classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new OneAway_1_5();
    }

    @Test
    public void pale_ple_isOneAway_true() {
        assertTrue(classUnderTest.isOneAway("pale", "ple"));
    }

    @Test
    public void pales_pale_isOneAway_true() {
        assertTrue(classUnderTest.isOneAway("pales", "pale"));
    }

    @Test
    public void pale_bale_isOneAway_true() {
        assertTrue(classUnderTest.isOneAway("pale", "bale"));
    }

    @Test
    public void pale_bake_isOneAway_false() {
        assertFalse(classUnderTest.isOneAway("pale", "bake"));
    }
}