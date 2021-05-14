package com.study.pratices.codility;

//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class anagramTest {

    @Test
    public void testChallenge() {

        assertTrue(anagram.nestedAnagrams("bored cat", "act robed"));
        assertTrue(anagram.nestedAnagrams("cat cat", "act"));
        assertTrue(anagram.nestedAnagrams("parrot flea lion hornet", "leaf loin raptor throne"));
        assertFalse(anagram.nestedAnagrams("parrot flea lion hornet", "leaf loin raptoo throne"));
    }
}
