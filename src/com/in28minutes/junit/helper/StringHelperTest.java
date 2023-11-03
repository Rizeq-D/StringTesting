package com.in28minutes.junit.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper helper = new StringHelper();
    @Test
    public void test() {
        assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));

    }
    @Test
    public void test2() {
        assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));

    }
    // ABCD => false, ABAB => true.
    @Test
    public void test_AreFirstAndLastTwoCharactersTheSame_NegativeResults() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));

    }
    @Test
    public void test_AreFirstAndLastTwoCharactersTheSame_PositiveResults() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));

    }
}
