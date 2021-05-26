package com.study.pratices.hakerank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

// reference: https://www.hackerrank.com/challenges/angry-children-2/problem
class Result {

  /*
   * Complete the 'angryChildren' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER k
   *  2. INTEGER_ARRAY packets
   */

  public static long angryChildren(int k, List<Integer> packets) {

    int value = 0;

    for (int i = 0; i < packets.size(); i++) {
      for (int j = i + 1; j < packets.size(); j++) {

        int difference = packets.get(i) - packets.get(j);
        value = (difference < 0) ? -difference : difference;

        // falta gerar uma forma de armazenar os valores de cada diferença.
        // pensei em gerar um pilha ordenada, armazenando os valores na medida que são subtraidos
        // no final bastaria pegar os "k" menores valores dessa pilha, onde K é a quantidade de
        // crianças
        // e gerar a soma conforme o calculo da "soma injusta"
        // mas para isso seria preciso criar um objeto para armazenar as variaveis e eles deveriam
        // ser comparable
        // para permitir ordenação. não sei se isso ficaria rápido o sufiente
      }
    }
    return 0L;
  }

  static class angryChildrenSolution {

    public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bufferedWriter =
          new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int n = Integer.parseInt(bufferedReader.readLine().trim());

      int k = Integer.parseInt(bufferedReader.readLine().trim());

      List<Integer> packets =
          IntStream.range(0, n)
              .mapToObj(
                  i -> {
                    try {
                      return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                      throw new RuntimeException(ex);
                    }
                  })
              .map(String::trim)
              .map(Integer::parseInt)
              .collect(toList());

      long result = Result.angryChildren(k, packets);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();

      bufferedReader.close();
      bufferedWriter.close();
    }
  }
}
