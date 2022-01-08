package com.example.stream.generate;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveTypeStream {
  public static void main(String[] args) {
    IntStream intStream = IntStream.range(1,5);
    intStream.forEach(System.out::print);
    System.out.println();

    //boxing
    Stream<Integer> boxedIntStream = IntStream.range(1,5).boxed();
    boxedIntStream.forEach(System.out::print);
    System.out.println();

    LongStream longStream = LongStream.rangeClosed(1,5);
    longStream.forEach(System.out::print);
  }
}
