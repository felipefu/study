package com.study.pratices.hakerank;

import static com.study.pratices.hakerank.LargestRectangle.largestRectangle;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class LargestRectangleTest {

  @Test
  public void testChallenge() {

    Assert.assertEquals(9, largestRectangle(List.of(1, 2, 3, 4, 5)));
  }
}
