package com.study.pratices.hakerank;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;

public class SparseArraysTest {

  @Test
  public void testChallenge() {

    assertEquals(
        List.of(2, 1, 0),
        SparseArrays.matchingStrings(
            List.of("aba", "baba", "aba", "xzxb"), List.of("aba", "xzxb", "ab")));
    assertEquals(
        List.of(1, 0, 1),
        SparseArrays.matchingStrings(List.of("def", "de", "fgh"), List.of("de", "lmn", "fgh")));
    assertEquals(
        List.of(1, 3, 4, 3, 2),
        SparseArrays.matchingStrings(
            List.of(
                "abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na",
                "basdn", "sdaklfj", "asdjf"),
            List.of("abcde", "sdaklfj", "asdjf", "na", "basdn")));
  }
}
