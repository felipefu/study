package com.study.pratices.hakerank;

import static com.study.pratices.hakerank.Result.angryChildren;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class AngryChildren2Test {

  @Test
  public void testChallenge() {

    assertEquals(2, angryChildren(3, new ArrayList<>(List.of(3, 3, 4, 5))));
    //    assertEquals(2, angryChildren(3, new ArrayList<>(List.of(3, 3, 4, 5, 7, 9, 10))));
    //    assertEquals(40, angryChildren(3, new ArrayList<>(List.of(10, 100, 300, 200, 1000, 20,
    // 30))));
  }
}
