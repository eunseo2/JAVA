package com.example.stream.terminate;

import com.example.stream.mock.User;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Collecting {
  public static void main(String[] args) {
    List<User> list = User.userList();

    //stream -> list
    List<String> collect = list.stream().map(User::getName)
      .collect(Collectors.toList());

    System.out.println(collect);

    //list -> stream -> str
    String listToString = list.stream().map(User::getName)
      .collect(Collectors.joining());
    System.out.println(listToString);

    //average
    Double average = list.stream().collect(Collectors.averagingInt(User::getId));
    System.out.println(average);

    //sum & average & count ...
    IntSummaryStatistics statistics = list.stream().collect(Collectors.summarizingInt(User::getId));
    System.out.println(statistics);
  }
}
