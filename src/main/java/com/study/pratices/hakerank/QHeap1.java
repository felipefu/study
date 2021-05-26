package com.study.pratices.hakerank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// reference: https://www.hackerrank.com/challenges/qheap1/problem
public class QHeap1 {

  public static List<Integer> solution() {

    Scanner input = new Scanner(System.in);
    int numberOfQueries = Integer.parseInt(input.next());

    for (int i = 0; i < numberOfQueries; i++) {

      int command;
      command = Integer.parseInt(input.next());

      Map<String, Integer> heap = new HashMap<>();

      //            if(command = 1) {
      //                // insert
      //            } else if (command == 2){
      //                // delete
      //            } else if (command = 3){
      //                // print
      //            }
    }

    return null;
  }
}
