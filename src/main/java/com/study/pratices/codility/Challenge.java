package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge {


    public static int[] solution1(int[] A, int K) {

        int[] result = new int[A.length];

        for (int i = 0; i < A.length - 1; i++) {

            result[i] = A[A.length - i - K];
        }


        return result;
    }

    public static int[] solution(int[] A, int K) {

        int[] result = A;

        if (A.length > 0) {
        for (int j = 0; j < K; j++) {

            result = shift(result);

        } }
        return result;
    }

    private static int[] shift(int[] a) {

        int[] result = new int[a.length];

        for (int i = 0; i < a.length - 1; i++) {

            result[i+1] = a[i];
        }

        result[0] = a[a.length - 1];

        return result;
    }


    public static boolean nestedAnagrams(String phraseInput, String phraseAnagram) {

        String[] inputWords = phraseInput.split(" ");
        String[] anagramWords = phraseAnagram.split(" ");

        for (String inputWord : inputWords) {
            boolean wordHasMatch = false;
            for (String anagramWord : anagramWords) {

                if (inputWord.length() == anagramWord.length()) {

                    String inputWordAux = inputWord;

                    for (char letter : anagramWord.toCharArray()) {

                        if (inputWordAux.contains(String.valueOf(letter))) {
                            inputWordAux = inputWordAux.replaceFirst(String.valueOf(letter), "");
                        } else {
                            break;
                        }
                    }
                    if (inputWordAux.length() == 0) {
                        wordHasMatch = true;
                        break;
                    }
                }
            }
            if (!wordHasMatch) {
                return false;
            }
        }
        return true;
    }
}