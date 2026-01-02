package com.study.pratices.codefinity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class array02 {



        /*
         * Complete the 'reverseArray' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY a as parameter.
         */

        public static List<Integer> reverseArray(List<Integer> a) {

            // 1,2,3,4
            // 4


            int arraySize = a.size();
            List<Integer> result = new ArrayList<>(arraySize);


            for(int i = arraySize - 1; i >= 0; i--){

                result.add(a.get(i));

            }
            return result;

        }

        public static class Solution {
            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String outputPath = System.getenv("OUTPUT_PATH");
                if (outputPath == null) {
                    outputPath = "output.txt";
                }
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

                bufferedReader.readLine(); // Read array count (unused)

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                List<Integer> res = array02.reverseArray(arr);

                bufferedWriter.write(
                        res.stream()
                                .map(Object::toString)
                                .collect(joining(" "))
                                + "\n"
                );

                bufferedReader.close();
                bufferedWriter.close();
            }
        }

    }
