package com.study.pratices.hakerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoPrefixSet {

  public static List<String> noPrefix(List<String> words) {

    Node trie = new Node();
    List<String> result = new ArrayList<>();

    boolean ok = false;

    for (String word : words) {
      if (!insert(trie, word)) {
        result.add("BAD SET");
        result.add(word);
        System.out.println("BAD SET");
        System.out.println(word);
        return result;
      }
      ;
    }
    result.add("GOOD SET");
    System.out.println("GOOD SET");
    return result;
  }

  public static boolean insert(Node current, String word) {

    for (char ch : word.toCharArray()) {
      int index = ch - 'a';

      if (current.isWord) {
        return false;
      }

      if (current.children[index] == null) {
        current.children[index] = new Node();
      }
      current = current.children[index];
    }

    current.isWord = true;
    return true;
  }

  static class Node {

    Node[] children;
    boolean isWord = false;

    Node() {
      this.children = new Node[60];
      Arrays.fill(children, null);
    }
  }
}
