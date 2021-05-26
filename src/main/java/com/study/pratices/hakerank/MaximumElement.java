package com.study.pratices.hakerank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumElement {

  // exemplo de pilha
  public static List<Integer> maximumElement(List<String> operations) {

    Map<Long, NodeMax> sequence = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    Long index = 0L;
    int maxValue = 0;

    for (String operation : operations) {

      String[] commands = operation.split(" ");
      String operator = commands[0];

      if (operator.equals("1")) {

        int value = Integer.parseInt(commands[1]);
        maxValue = Math.max(value, maxValue);

        NodeMax node =
            new NodeMax(
                value,
                maxValue,
                sequence.containsKey(index) ? sequence.get(index).maxValue : 0,
                sequence.get(index));

        index++;
        sequence.put(index, node);

      } else if (operation.equals("2")) {

        maxValue = sequence.get(index).oldMaxValue;
        index--;

      } else if (operation.equals("3")) {
        result.add(maxValue);
      }
    }

    return result;
  }
}

class NodeMax {
  int value;
  int maxValue;
  int oldMaxValue;
  NodeMax previousNode;

  NodeMax(int value, int maxValue, int oldMaxValue, NodeMax previousNode) {
    this.value = value;
    this.maxValue = maxValue;
    this.oldMaxValue = oldMaxValue;
    this.previousNode = previousNode;
  }
}
