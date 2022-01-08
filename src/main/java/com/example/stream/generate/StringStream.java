package com.example.stream.generate;

import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStream {
  public static void main(String[] args) {

    //char는 문자이지만 본질적으로는 숫자
    IntStream charsStream = "Stream".chars();
    charsStream.forEach(System.out::println);

    Stream<String> stringStream =
      Pattern.compile(", ").splitAsStream("Eric, Elena, Java");
    stringStream.forEach(System.out::println);
  }
}
