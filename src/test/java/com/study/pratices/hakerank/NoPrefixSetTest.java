package com.study.pratices.hakerank;

import static com.study.pratices.hakerank.NoPrefixSet.noPrefix;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class NoPrefixSetTest {

  @Test
  public void testChallenge() {

    Assert.assertEquals(
        List.of("BAD SET", "abcde"),
        noPrefix(new ArrayList<>(List.of("abcd", "bcd", "abcde", "bcde"))));

    Assert.assertEquals(List.of("GOOD SET"), noPrefix(new ArrayList<>(List.of("ab", "bc", "cd"))));

    Assert.assertEquals(
        List.of("BAD SET", "aabcde"),
        noPrefix(
            new ArrayList<>(
                List.of("aab", "defgab", "abcde", "aabcde", "bbbbbbbbbb", "jabjjjad"))));

    Assert.assertEquals(
        List.of("BAD SET", "aacghgh"),
        noPrefix(new ArrayList<>(List.of("aab", "aac", "aacghgh", "aabghgh"))));
  }
}
