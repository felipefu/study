package com.study.pratices.hakerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoPrefixSet {


    public static List<Integer> oddNumbers(int l, int r) {

    List<Integer> result = new ArrayList<>();

    for(int i = l; i<= r; i++){
        if (i % 2 == 1){
            result.add(i);
        }
    }

    return result;

    }


    public static List<String> noPrefix(List<String> words) {

        Node trie = new Node();
        List<String> result = new ArrayList<>();

        boolean hasPrefix = false;

        for (String word : words) {
            if (!insert(trie, word)) {
                hasPrefix = true;
                result.add("BAD SET");
                result.add(word);
                System.out.println("BAD SET");
                System.out.println(word);
                break;
            }
        }

        if (!hasPrefix) {
            result.add("GOOD SET");
            System.out.println("GOOD SET");
            return result;
        }

        return result;
    }

    public static boolean insert(Node node, String word) {

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            int index = ch - 'a';

            if (node.words[index] == null) {
                node.words[index] = new Node();
            } else if (i == word.length() - 1){
                for (Node nodeAux : node.words) {
                    if (nodeAux.words != null) {
                        return false;
                    }
                }
            }

            node = node.words[index];

            if (node.isWord) {
                return false;
            }
        }

        node.isWord = true;
        return true;
    }

    static class Node {

        Node[] words;
        boolean isWord = false;

        Node() {
            this.words = new Node[60];
            Arrays.fill(words, null);
        }
    }
}
