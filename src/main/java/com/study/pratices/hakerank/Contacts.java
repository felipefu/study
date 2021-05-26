package com.study.pratices.hakerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// reference: https://www.hackerrank.com/challenges/contacts/problem
public class Contacts {

  private static void insert(TrieOld trieOld, String word) {

    TrieNode currentNode = trieOld.root;

    for (int i = 0; i < word.length(); i++) {

      char ch = word.charAt(i);
      if (currentNode.nodeMap.containsKey(ch)) {
        currentNode = currentNode.nodeMap.get(ch);
        currentNode.numberOfChildrenOfFather++;
      } else {
        currentNode.nodeMap.put(ch, new TrieNode());
        currentNode = currentNode.nodeMap.get(ch);
      }
    }

    currentNode.isWord = true;
  }

  private static int find(TrieOld trieOld, String word) {

    TrieNode currentNode = trieOld.root;

    for (char ch : word.toCharArray()) {

      TrieNode node = currentNode.nodeMap.get(ch);

      if (node != null) {
        currentNode = currentNode.nodeMap.get(ch);
      } else {
        return 0;
      }
    }
    return currentNode.numberOfChildrenOfFather;
  }

  public List<Integer> contactsStillBadPerformance(List<List<String>> queries) {

    TrieOld trieOld = new TrieOld();

    List<Integer> result = new ArrayList<>();

    for (List<String> query : queries) {

      if (query.get(0).equals("add")) {

        insert(trieOld, query.get(1));

      } else if (query.get(0).equals("find")) {

        result.add(find(trieOld, query.get(1)));
      }
    }

    return result;
  }

  public List<Integer> contactsSolutionWithBadPerformance(List<List<String>> queries) {

    List<String> contactList = new ArrayList<>();
    List<Integer> result = new ArrayList<>();

    for (List<String> query : queries) {

      if (query.get(0).equals("add")) {

        contactList.add(query.get(1));

      } else if (query.get(0).equals("find")) {

        int resultCount = 0;

        for (String contact : contactList) {

          if (contact.contains(query.get(1))) {
            resultCount++;
          }
        }
        result.add(resultCount);
      }
    }

    return result;
  }

  public List<Integer> contacts(List<List<String>> queries) {

    List<Integer> resultList = new ArrayList<>();
    Node trie = new Node();

    for (List<String> query : queries) {

      // Insertion Operation
      if (query.get(0).equals("add")) {
        trie.insert(trie, query.get(1));
      } else { // Search Operation
        Node currentNode = trie;

        // Traverse through each level
        for (char c : query.get(1).toCharArray()) {
          // Maintain a reference to the Node matching the char for that level
          currentNode = currentNode.children[c - 'a'];

          if (currentNode == null) {
            break;
          }
        }

        // Print the number of results
        int result = (currentNode != null) ? currentNode.count : 0;
        resultList.add(result);
        System.out.println(result);
      }
    }
    return resultList;
  }

  static class TrieNode {

    private final HashMap<Character, TrieNode> nodeMap = new HashMap<>();
    private int numberOfChildrenOfFather = 0;
    private boolean isWord;

    TrieNode() {
      numberOfChildrenOfFather++;
    }
  }

  static class TrieOld {

    private final TrieNode root;

    TrieOld() {
      root = new TrieNode();
      root.numberOfChildrenOfFather = 0;
    }
  }

  static class Node {

    int count;
    Node[] children;

    Node() {
      this.count = 0;
      this.children = new Node[26];
      Arrays.fill(children, null);
    }

    public void insert(Node current, String value) {

      for (char c : value.toCharArray()) {
        int index = c - 'a';

        if (current.children[index] == null) {
          current.children[index] = new Node();
        }

        current.children[index].count++;
        current = current.children[index];
      }
    }
  }
}
