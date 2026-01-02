package com.study.pratices.codefinity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array03 {

    /**
     * Rotates the elements of a list to the left by 'd' positions.
     *
     * @param d   The number of positions to rotate.
     * @param arr The list of integers to rotate.
     * @return A new list with the elements rotated to the left.
     */
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        List<Integer> rotatedList = new ArrayList<>();

        rotatedList.addAll(arr.subList(d, arr.size()));

        rotatedList.addAll(arr.subList(0, d));

        return rotatedList;
    }

    public static void main(String[] args) {
        // Example execution
        List<Integer> originalList = Arrays.asList(1, 2, 3, 4, 5);
        int positionsToRotate = 4;

        List<Integer> result = rotateLeft(positionsToRotate, originalList);

        // Expected output for rotating [1, 2, 3, 4, 5] left by 4 is [5, 1, 2, 3, 4]
        System.out.println("Original list: " + originalList);
        System.out.println("Rotated list: " + result);
    }
}
