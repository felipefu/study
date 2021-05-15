package com.study.pratices.hakerank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {

  // reference: https://www.hackerrank.com/challenges/sparse-arrays/problem

  public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

    long start = System.nanoTime();

    Map<String, Integer> stringListMap = new HashMap<>();

    for (String string : strings) {

      if (stringListMap.containsKey(string)) {
        Integer value = stringListMap.get(string);
        stringListMap.put(string, value + 1);
      } else {
        stringListMap.put(string, 1);
      }
    }

    List<Integer> result = new ArrayList<>();

    for (String query : queries) {
      result.add(stringListMap.getOrDefault(query, 0));
    }

    long finish = System.nanoTime();
    System.out.println("Tempo: " + (finish - start));

    return result;
  }
}
