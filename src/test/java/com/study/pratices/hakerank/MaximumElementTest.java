package com.study.pratices.hakerank;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class MaximumElementTest {

  @Test
  public void testChallenge() {

    assertEquals(
        List.of(26, 91),
        MaximumElement.maximumElement(
            new ArrayList<>(List.of("1 26", "1 20", "2", "3", "1 91", "3"))));

    assertEquals(
        List.of(26, 91),
        MaximumElement.maximumElement(
            new ArrayList<>(
                List.of("1 97", "2", "1 20", "2", "1 26", "1 20", "2", "3", "1 91", "3"))));
  }
}
