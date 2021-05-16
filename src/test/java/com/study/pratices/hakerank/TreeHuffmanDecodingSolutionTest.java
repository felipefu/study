package com.study.pratices.hakerank;

import static com.study.pratices.hakerank.Solution.generateTree;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeHuffmanDecodingSolutionTest {

  @Test
  public void testChallenge() {

    assertEquals("ABACA", DecodingSolution.decode("1001011", generateTree("ABACA")));
  }
}
