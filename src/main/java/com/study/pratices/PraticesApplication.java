package com.study.pratices;

import java.util.HashMap;
import java.util.Map;

public class PraticesApplication {

  public static void main(String[] args) {

    test();

    //    SpringApplication.run(PraticesApplication.class, args);
  }

  private static void test() {

    String chaveDeTest = "001";

    Map<String, String> test = new HashMap<>();

    test.put(chaveDeTest, "lala01");

    String lala = test.computeIfAbsent("chaveDeTest", novoItem -> "lala02");

    assert (test.containsKey(chaveDeTest));
  }
}
