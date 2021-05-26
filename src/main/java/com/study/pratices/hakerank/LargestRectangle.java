package com.study.pratices.hakerank;

import java.util.ArrayList;
import java.util.List;

public class LargestRectangle {

  public static long largestRectangle(List<Integer> h) {

    int maxHeight = 0;
    int maxRectangle = 0;
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < h.size(); i++) {

      list.add(h.get(i));

      if (maxHeight < h.get(i)) {
        maxHeight = h.get(i);
      }

      for (Integer build : list) {}
    }

    return 0L;
  }
}
