package com.study.pratices.hakerank;

import static com.study.pratices.hakerank.Solution.generateTree;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeHuffmanDecodingTest {

  @Test
  public void testChallenge() {


    Decoding decode = new Decoding();

    assertEquals("ABACA", decode.decode("1001011", generateTree("ABACA")));
    assertEquals("ABRACADABRA", decode.decode("01111001100011010111100", generateTree("ABRACADABRA")));
    assertEquals("A", decode.decode("0", generateTree("A")));
  }
}
