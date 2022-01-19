package com.example.stream.terminate;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Reduction {
  public static void main(String[] args) {
    OptionalInt reducedOneParam =
      IntStream.range(1,5) // [1,2,3,4]
        .reduce(Integer::sum);
    System.out.println(reducedOneParam);


    int reducedTwoParams =
      IntStream.range(1,5)
        .reduce(10,Integer::sum);

    System.out.println(reducedTwoParams);

    Integer reducedParallel = Arrays.asList(1,2,3)
      .parallelStream()
      .reduce(10, Integer::sum,(a,b)->{
        System.out.println("combiner was called");
        return a + b;
      });

    System.out.println(reducedParallel);
  }
}
