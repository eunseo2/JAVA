package com.example.stream.generate;

import com.example.stream.mock.User;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmptyStream {
  public static void main(String[] args) {
    List<User> userList = Collections.emptyList();

    Stream<User> stream = (userList ==null) || userList.isEmpty()
      ? Stream.empty() : userList.stream();
    System.out.println(stream.collect(Collectors.toList()));


  }
}
