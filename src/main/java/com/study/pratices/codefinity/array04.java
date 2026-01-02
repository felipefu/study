package com.study.pratices.codefinity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array04 {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {

        long[] result = new long[n + 2];

        for (List<Integer> query : queries) { // x=0

            int leftIndex = query.get(0); // 1
            int rightIndex = query.get(1); // 2
            int valueToAdd = query.get(2); // 100

            result[leftIndex] += valueToAdd;

            if (rightIndex + 1 <= n) {
                result[rightIndex + 1] -= valueToAdd;
            }
        }

        long max = 0;
        long currentSum = 0;
        for (int i = 0; i <= n; i++) {

            System.out.println("result[" + i + "]:" + result[i]);

            currentSum += result[i];
            System.out.println("currentSum:" + currentSum);

            if (currentSum > max) {
                max = currentSum;
                System.out.println("max:" + max);
            }
        }

        return max;

    }

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(2, 3, 603);
        List<Integer> list2 = Arrays.asList(1, 1, 286);
        List<Integer> list3 = Arrays.asList(4, 4, 882);

        List<List<Integer>> queries = new ArrayList<>();
        queries.add(list1);
        queries.add(list2);
        queries.add(list3);

        int listSize = 4;

        long result = arrayManipulation(listSize, queries);

        System.out.println("Result: " + result);
    }
}
