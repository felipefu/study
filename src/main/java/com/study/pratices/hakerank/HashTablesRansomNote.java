package com.study.pratices.hakerank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// reference: https://www.hackerrank.com/challenges/ctci-ransom-note/problem
public class HashTablesRansomNote {

  public static boolean checkMagazine(List<String> magazine, List<String> note) {

    Map<String, Integer> magazineMap = new HashMap<>();

    for (String string : magazine) {

      if (magazineMap.containsKey(string)) {
        Integer value = magazineMap.get(string);
        magazineMap.put(string, value + 1);
      } else {
        magazineMap.put(string, 1);
      }
    }

    boolean result = true;

    for (String word : note) {

      if (magazineMap.containsKey(word) && magazineMap.get(word) > 0) {
        int value = magazineMap.get(word);
        magazineMap.put(word, value - 1);
      } else {
        result = false;
      }
    }

    return result;
  }

  // Solution not optimized
  public static boolean checkMagazineOld(List<String> magazine, List<String> note) {

    long start = System.nanoTime();

    int difference = magazine.size() - note.size();

    note.forEach(magazine::remove);

    if (magazine.size() == difference) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    long finish = System.nanoTime();
    System.out.println("Tempo: " + (finish - start));

    return magazine.size() == difference;
  }
}
