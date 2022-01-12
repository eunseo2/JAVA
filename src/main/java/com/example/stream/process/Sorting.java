package com.example.stream.process;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
  public static void main(String[] args) {
    List<String> lang =
      Arrays.asList("Java","Python","Go");

    List<String> sort = lang.stream().sorted().collect(Collectors.toList());
    System.out.println(sort);

    List<String> reverseSort = lang.stream()
      .sorted(Comparator.reverseOrder())
      .collect(Collectors.toList());
    System.out.println(reverseSort);
  }
}
