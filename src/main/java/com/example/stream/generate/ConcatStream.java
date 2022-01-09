package com.example.stream.generate;

import java.util.stream.Stream;

public class ConcatStream {
  public static void main(String[] args) {
    Stream<String> stream1 = Stream.of("JAVA");
    Stream<String> stream2 = Stream.of("PYTHON");
    Stream<String> concat = Stream.concat(stream1,stream2);

    concat.forEach(System.out::println);
  }
}
